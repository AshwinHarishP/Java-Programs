class DemoAbstract{
    public static void main(String arg[]){
        Student st1 = new DayScholarStudent("Aakash",1);
        Student st2 = new HostelStudent("Ajay", 2);
        st1.setRollNo();
        st1.setFee();
        st1.setDetails();
        st2.setRollNo();
        st2.setFee();
        st2.setDetails();
        st1.getDetails();
        st2.getDetails();
    }
}