class HostelStudent extends Student{
    String room_no;
    float hostel_fee;

    HostelStudent(String name, String room_no){
        super(name);
        this.room_no = room_no;
    }

    void setRoomNo(){
        System.out.println("Enter Room No: ");
        String room_no = sc.next();
        this.room_no = room_no;

    }

    //Method overriding
    //@override
    void setFee(){
        System.out.println("Enter Tuition Fee"+this.name);
        float tuition_fee = sc.nextFloat();
        System.out.println("Enter Hostel Fee"+this.name);
        float hostel_fee = sc.nextFloat();
        this.fee = tuition_fee + hostel_fee;
    }

    //Method overriding
    //@override
    void getDetails(){
        System.out.println("The details of "+this.name+" are:");
        System.out.println("Roll No: "+this.roll_no+"\n"
                            +"Name: "+this.name+"\n"
                            +"Year of Study: "+this.year_of_study+"\n"
                            +"Fee: "+this.fee+"\n"
                            +"Room No: "+this.room_no
                           );
    }
}