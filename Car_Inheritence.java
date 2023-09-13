class Vechile{

    void start(){
        System.out.println("car Started");
    }
    void stop(){
        System.out.println("car Stopped");
    }
}


class Car extends Vechile{
    void accelerate(){
        System.out.println("Vechile Accelerated")
    }
}

public class Car_Inheritence {
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

