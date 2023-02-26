package minidb.xmlParser;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;

/**
 * Used for performing CRUD operations and XML parsing on the database file.
 */
public class DatabaseFile  {
    // prefix `X` to avoid namespace conflict
    private static String TAG_STORAGE = "Xstorage";
    private static String TAG_META = "Xmeta"; // incomplete feature
    private static String TAG_DATA = "Xdata";

    private File xmlFile;
    private Document doc;
    private Element metaElem;
    private Element storageElem;

    public DatabaseFile(String path) {
        try {
            xmlFile = new File(path);
            new File(".\\db").mkdir(); // create `db` directory if it doesn't exist
            boolean NoFileFound = xmlFile.createNewFile();
            load(NoFileFound);
        } catch (ParserConfigurationException | SAXException | IOException err) {
            System.out.println(err);
            err.printStackTrace();
        }
    }

    private void load(boolean NoFile) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        if (NoFile) {
            doc = docBuilder.newDocument();
            createFile(); // abstract method to create the file
        } else {
            doc = docBuilder.parse(xmlFile);
            ;
        }
    }

    protected void createFile() {
        Element rootElem = doc.createElement("Xroot");
        Element meta = doc.createElement(TAG_META);
        Element data = doc.createElement(TAG_STORAGE);

        rootElem.appendChild(meta);
        rootElem.appendChild(data);
        doc.appendChild(rootElem);

        this.updateFile();
    }

    protected void updateFile() {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");

            DOMSource source = new DOMSource(this.doc);
            StreamResult result = new StreamResult(this.xmlFile);
            transformer.transform(source, result);
            System.out.println("Updated;");

        } catch (TransformerException err) {
            err.printStackTrace();
        }
    }

    public void EditMode() {
        metaElem = (Element) doc.getElementsByTagName(TAG_META).item(0);
        storageElem = (Element) doc.getElementsByTagName(TAG_STORAGE).item(0);
        // System.out.println("Edit Mode On; " + schemaElem.getAttribute("val"));
    }

    public String getSchema() {
        return storageElem.getAttribute("schema");
    }

    public void createSchema(String value) {
        storageElem.setAttribute("schema", value);
        this.updateFile();
    }

    public void addData(String value) {
        String[] vals = value.split(",");
        String[] schemaArray = this.getSchema().split(",");

        if (vals.length == schemaArray.length) {
            Element newDataElem = doc.createElement(TAG_DATA);
            newDataElem.setAttribute("id", vals[0]);

            for (int i = 1; i < schemaArray.length; i++) {
                String v = vals[i];
                String s = schemaArray[i];
                Element x = doc.createElement(s);
                x.appendChild(doc.createTextNode(v));
                newDataElem.appendChild(x);
            }
            storageElem.appendChild(newDataElem);

            this.updateFile();

        } else {
            System.out.println("The data does not follow the declared schema: " + this.getSchema());
        }

    }


    public void readData() {
        String[] schemaArray = this.getSchema().split(",");
        String headers = String.join("    ", schemaArray);
        System.out.println(headers);

        NodeList dataList = doc.getElementsByTagName(TAG_DATA);
        for (int i = 0; i < dataList.getLength(); i++) {
            Node singleItem = dataList.item(i);
            NodeList itemsChildren = singleItem.getChildNodes();

            String dataString = singleItem.getAttributes().getNamedItem("id").getNodeValue() + "  ";

            for (int j = 0; j < itemsChildren.getLength(); j++) {
                Node z = itemsChildren.item(j);
                dataString += z.getTextContent().trim() + "  ";
            }

            System.out.println(dataString.trim());
        }
    }

    //Duplicate code
    public void readData(String id,boolean read) {
        // just Trying the Xpath API, instead of using DOM API
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            Node nameNode = (Node) xPath.compile("/Xroot/Xstorage/Xdata[@id=" + id + "]/name").evaluate(doc,
                    XPathConstants.NODE);
            if (nameNode != null) {
                if(read)
                    System.out.println(nameNode.getTextContent());
                else {
                    nameNode.getParentNode().removeChild(nameNode);
                    this.updateFile();
                }
            }

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

//    public void deleteData(String id) {
//        try {
//            XPath xPath = XPathFactory.newInstance().newXPath();
//            Node nameNode = (Node) xPath.compile("/Xroot/Xstorage/Xdata[@id=" + id + "]").evaluate(doc,
//                    XPathConstants.NODE);
//            if (nameNode != null) {
//                nameNode.getParentNode().removeChild(nameNode);
//                this.updateFile();
//            }
//
//        } catch (XPathExpressionException e) {
//            e.printStackTrace();
//        }
//    }
}
