import java.util.Scanner;
abstract class Student{
    int roll_no;
    String name;
    int year_of_study;
    float fee;
    Scanner sc = new Scanner(System.in);

    //Constructor
    Student(String name, int year_of_study){
        this.roll_no = 0;
        this.name = name;
        this.year_of_study = year_of_study;
    }

    //non-abstract method
    void setRollNo(){
        System.out.println("Enter Roll No for "+this.name);
        int roll_no = sc.nextInt();
        this.roll_no = roll_no;

    }

    //abtract methods
    abstract void setFee();
    abstract void setDetails();
    abstract void getDetails();

}