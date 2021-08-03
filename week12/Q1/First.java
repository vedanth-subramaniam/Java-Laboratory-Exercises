class MyThread extends Thread{
    @Override
    public void run(){
        int sleepTime = (int)(Math.random() * 10);
        try{
            MyThread.sleep(sleepTime * 100L);
        }
        catch(InterruptedException e){

        }
        System.out.println("Time:" + sleepTime);
    }
}

public class First {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        try{
                t.join();
                System.out.println(t.getState());
        }
        catch(Exception e){

        }
        System.out.println("f");;    
    }
}
