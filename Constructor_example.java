class Student{
    int id;
    String name;
    Student(int i, String n){
        id = i;
        name = n; 
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class Constructor_example {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Tom");
        Student s2 = new Student(2, "Jerry");
        s1.display();
        s2.display();
    }    
}
