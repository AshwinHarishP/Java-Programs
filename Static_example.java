class MyClass{
    static int count = 0;
    public MyClass(){
        count ++;
    }
}
public class Static_example {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        System.out.println("Count: "+m1.count);
    }
}



