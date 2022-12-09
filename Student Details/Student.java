import java.util.Scanner;
class Student{
    int roll_no;
    String name;
    int year_of_study;
    float fee;
    Scanner sc = new Scanner(System.in);

    //Constructor Overloading
    Student(String name){
        this.roll_no = 0;
        this.name = name;
        this.year_of_study = 1;
        this.fee = 0;
    }
    //Constructor Overloading
    Student(String name, int year_of_study){
        this.roll_no = 0;
        this.name = name;
        this.year_of_study = year_of_study;
        this.fee = 0;
    }

    void setRollNo(){
        System.out.println("Enter Roll No for "+this.name +":");
        int roll_no = sc.nextInt();
        this.roll_no = roll_no;

    }

    void setFee(){
        System.out.println("Enter Maintanance Fee:");
        float fee = sc.nextFloat();
        this.fee = fee;
    }

    //Method Overloading
    void setFee(float fee){
        this.fee = fee;
    }

    //final void getDetails()
    void getDetails(){
        System.out.println("The details of "+this.name+" are:");
        System.out.println("Roll No: "+this.roll_no+"\n"
                            +"Name: "+this.name+"\n"
                            +"Year of Study: "+this.year_of_study+"\n"
                            +"Fee: "+this.fee
                           );
    }

}