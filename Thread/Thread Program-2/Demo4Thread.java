class Demo4Thread {

    public void PrintOdd() {
        for(int i = 1; i <= 10; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
    }

    public void PrintEven() {
        for(int i = 1; i <= 10; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }


    public static void main(String arg[]){
        Demo4Thread obj = new Demo4Thread();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                obj.PrintOdd();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                obj.PrintEven();
            }
        });

        t1.start();
        t2.start();
    
    }
}