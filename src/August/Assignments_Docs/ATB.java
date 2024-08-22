package August.Assignments_Docs;

import java.util.Scanner;

public class ATB {
    String [] Students= new String[5];
    Scanner sc= new Scanner(System.in);


       ATB(String [] students) {
        this.Students = students;

    }

    public String[] showname() {
        System.out.println("the Students are:");

        return Students;
    }

    public void addName(String[] students) {
        System.out.println("Enter students name:");
        for (int i = 0; i < students.length; i++) {
             students[i]= sc.toString();

        }
        Students = students;
    }
}


