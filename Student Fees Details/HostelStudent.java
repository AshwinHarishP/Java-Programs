class HostelStudent extends Student{
    String room_no;
    String hostel_name;
    float hostel_fee;

    HostelStudent(String name, int year_of_study){
        super(name, year_of_study);
    }

    void setFee(){
        System.out.println("Enter Tuition Fee for "+this.name);
        float tuition_fee = sc.nextFloat();
        System.out.println("Enter Hostel Fee for "+this.name);
        float hostel_fee = sc.nextFloat();
        this.fee = tuition_fee + hostel_fee;
    }

    void setDetails(){
        System.out.println("Enter Hostel Name: ");
        String hostel_name = sc.next();
        this.hostel_name = hostel_name;
        System.out.println("Enter Room No: ");
        String room_no = sc.next();
        this.room_no = room_no;

    }

    void getDetails(){
        System.out.println("The details of "+this.name+" are:");
        System.out.println("Roll No: "+this.roll_no+"\n"
                            +"Name: "+this.name+"\n"
                            +"Year of Study: "+this.year_of_study+"\n"
                            +"Fee: "+this.fee+"\n"
                            +"Hostel Name: "+this.hostel_name+"\n"
                            +"Room No: "+this.room_no
                           );
    }
}