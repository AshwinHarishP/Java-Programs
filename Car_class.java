class Car{
    // Data members
    String color; 
    int speed;     
    
    // methods
    void start(){
        System.out.println("car Started");
    }
    void stop(){
        System.out.println("car Stopped");
    }
}

public class Car_class {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red"; 
        myCar.speed = 60;
        System.out.println("My car colour is: "+ myCar.color);
        System.out.println("My car speed is: "+ myCar.speed);
        myCar.start();
        myCar.stop();
    }
}
