class collegeThread extends Thread{
    public void run (){
        try{
            while(true){
                System.out.println("BMS college of engineering");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e){
            System.out.println("COllege thread interrupted");
        }
    }

}

class CSEThread extends Thread{
    public void run(){

        try {
            while(true){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e ){
            System.out.println("CSE thread exception");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        collegeThread t1 = new collegeThread();
        CSEThread t2 = new CSEThread();
        t1.start();
        t2.start();
    }
}
