package factoryPatternBook;

interface Metal{}
class SS implements Metal{}
class Raw implements Metal{}

abstract class Building {
    void makeFloor(){
        Metal metal = getMetal();
        extractMethod(metal);

    }

    void makeFoundation(){
        Metal metal = getMetal();
        extractMethod(metal);
    }

    abstract Metal getMetal();
    void extractMethod(Metal metal){
//        metal.bend();
//        metal.process();
//        metal.hammer();
//        metal.transport();
//        metal.color();
//        metal.useInBlock();
//        metal.align();
    }
}

class SchoolBuilding extends Building{
    void doSchoolStuffs(){

    }
     Metal getMetal(){
        return new Raw();
    }
}

class VIPBuilding extends Building{
    void doVIPStuffs(){

    }
    Metal getMetal(){
        return new SS();
    }
}

