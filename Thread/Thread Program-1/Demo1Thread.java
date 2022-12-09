class MyThread extends Thread{
public void run()
    {
        for(int i=0;i<20;i++)
            System.out.println("Thread 1 "+i);
    }
}

class MyThread1 extends Thread{
public void run()
    {
        for(int i=101;i<120;i++)
            System.out.println("Thread 2 "+i);
    }
}

class Demo1Thread {
    public static void main(String arg[]){
        MyThread th1=new MyThread();
        th1.start();
        // th1.setPriority(10);
        MyThread1 th2=new MyThread1();
        th2.start();
        System.out.println("Main thread end");
    
    }
}