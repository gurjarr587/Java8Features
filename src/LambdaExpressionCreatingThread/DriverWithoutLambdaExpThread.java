package LambdaExpressionCreatingThread;

public class DriverWithoutLambdaExpThread {
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            public void run(){
                System.out.println("Thread is Running !!");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();;
    }

}
