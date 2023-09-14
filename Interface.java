interface mammal{
    public void mammalSound();
    public void sleep();

}
    class man implements mammal{
        public void mammalSound(){
            System.out.println("The man shouts hey hey");
    } 
    public void sleep(){
        System.out.println("The man sleeps");
    }
}



public class Interface {
    public static void main(String[] args) {
        man m = new man();
        m.mammalSound();
        m.sleep();
    }
}
