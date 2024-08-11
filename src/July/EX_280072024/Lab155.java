package July.EX_280072024;

public class Lab155 {
    public static void main(String[] args) {

        // class- attributes/properties - data types: primitive and non primitive
        // class- behaviour/ methods- functions

        // object- real entity which is created from a class.
        // syntax- classname refrence= new class name();
        // new class name- object
        // class reference=  class ref
        // class - is a blueprint you are using.



        BuildingBP dlf= new BuildingBP();
          dlf.name= "dlf";
          dlf.norooms= 10;
          BuildingBP prestige= new BuildingBP();
              prestige.address= "gurugram";
              prestige.uselift();
              prestige.activities();


    }
}
