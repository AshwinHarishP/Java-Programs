abstract class Bank{
    abstract int getIntersetRate();
}
class Citi extends Bank{
    int getIntersetRate()
    {
        return 7;
    }

}

class HSBC extends Bank{  //--> abstract class bank redefined to  hsbc
    int getIntersetRate(){ // --> concrete method redifined
        return 6;
    }
}

public class Concrete_class {
    public static void main(String[] args) {
        Bank b;
        b = new Citi();
        System.out.println("Citi rate of interest is: "+b.getIntersetRate() + "%");
        b = new HSBC();
        System.out.println("HSBC rate of interest is: "+b.getIntersetRate()+"%");
    }    
}
