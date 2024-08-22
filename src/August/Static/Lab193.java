package August.Static;

public class Lab193 {
    // Static can be a:
    // block
    // Data member
    // function
    // Class
    public static void main(String[] args) {
        ATB s= new ATB("Kiran");
        System.out.println(ATB.courseName);
        s.getName();
        s.setName("Viki");



    }

}
class ATB{
     private String name;
     static String courseName= "JAVA";

    public ATB(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ATB.courseName = courseName;
    }
}
