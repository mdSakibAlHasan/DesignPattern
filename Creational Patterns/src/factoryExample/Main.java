package factoryExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Press 1 for Oracle");
        System.out.println("Press 2 for MySql");
        System.out.println("press 3 for MongoDB");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0 && n<3){
            System.out.println("Invalid");
        }
        else {
            DatabazeFactory databazeFactory = new DatabazeFactory();
           Databaze db = databazeFactory.createDatabazeObject(DatabazeType.values()[n-1]);
           db.showConnectionDetails();
        }
    }
}

//https://youtu.be/Yi6CXAIzNRA
