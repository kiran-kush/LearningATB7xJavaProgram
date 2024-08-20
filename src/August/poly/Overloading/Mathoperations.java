package August.poly.Overloading;

public class Mathoperations {
// Encapsulation
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Polymorphism-- overloading
    int add(int a, int b){

       return a+b;

    }
    long add(long a, Long b){

       return a+b;

    }
    float add(float a, float b){

       return a+b;

    }
    float add(int a, float b){

       return a+b;

    }
    String add(String a, String b){

       return a+b;

    }
  int add(char a, char b){
        return (int)(a+b);

    }

}


