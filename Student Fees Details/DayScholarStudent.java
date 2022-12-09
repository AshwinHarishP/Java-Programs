class DayScholarStudent extends Student{
    int bus_no;
    String bus_stop;
    float bus_fee;

    DayScholarStudent(String name, int year_of_study){
        super(name, year_of_study);
    }

    void setFee(){
        System.out.println("Enter Tuition Fee for "+this.name);
        float tuition_fee = sc.nextFloat();
        System.out.println("Enter Bus Fee for "+this.name);
        float bus_fee = sc.nextFloat();
        this.fee = tuition_fee + bus_fee;
    }

    void setDetails(){
        System.out.println("Enter bus No for "+this.name);
        int bus_no = sc.nextInt();
        this.bus_no = bus_no;
        System.out.println("Enter bus stop for "+this.name);
        String bus_stop = sc.next();
        this.bus_stop = bus_stop;
    }
    void getDetails(){
        System.out.println("The details of "+this.name+" are:");
        System.out.println("Roll No: "+this.roll_no+"\n"
                            +"Name: "+this.name+"\n"
                            +"Year of Study: "+this.year_of_study+"\n"
                            +"Fee: "+this.fee+"\n"
                            +"Bus No: "+this.bus_no+"\n"
                            +"Bus Stop: "+this.bus_stop
                           );
    }
}

