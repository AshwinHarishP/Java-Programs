class Polygon{
    public void draw(){
        System.out.println("Drawing Polygon");
    }
}
class Circle extends Polygon{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Square extends Polygon{
    public void draw(){
        System.out.println("Drawing Square");
    }
}

public class Shape_polymorphism {
    public static void main(String[] args) {
    
        Circle c1 = new Circle();
        c1.draw(); 
        Square s1 = new Square();
        s1.draw();
    }
}
