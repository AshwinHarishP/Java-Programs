//create an abstract class called flying features step 1
//inside that abstract method fly step 2
//convert abstract class to concrete class by extending and redefine the method

//create a class called eagle
//Define a concrete method flyingwith wings
//Inside flying with wings print the message fly at an higher altitude 
//create a Class called bat and create a methods inside that flying with wings and inside that print flys ar a lower altitude 


// Create a main function
// and create an object flying fc = new eagle 
// flying creature fc = new bat


abstract class Flying_features{
    abstract void flywithWings();
}

class Eagle extends Flying_features{
    void flywithWings(){
        System.out.println("Fly at higher altitude");
    }
}

class Bat extends Flying_features{
    void flywithWings() {
        System.out.println("Flys at a lower altitude ");
    }
}
class Fly{
    public static void main(String[] args) {
        Flying_features v1 = new Bat();
        v1.flywithWings();
        Flying_features v2 = new Eagle();
        v2.flywithWings();
    }
}