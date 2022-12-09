class DemoStudent{
    public static void main(String arg[]){
        Student st1 = new Student("Ashwin");
        Student st2 = new Student("Harish", 2);
        Student st3 = new Student("Kumar", 2);
        HostelStudent hst1 = new HostelStudent("", "K102");
        st1.setRollNo();
        st1.setFee();
        hst1.setFee();
        st2.setRollNo();
        st2.setFee();
        hst1.setFee();
        hst1.setRollNo();
        hst1.setFee();
        st1.getDetails();
        st2.getDetails();
        hst1.getDetails();

    }
}