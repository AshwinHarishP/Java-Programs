class Student{
    int id; String name; int age;
    Student(int i, String n){
        id = i;
        name = n;
    }
    Student(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
}
public class Constructor_overloading {
    public static void main(String[] args) {
        Student obj1 = new Student(1234, "Ashwin");
        obj1.display();
    }
}
