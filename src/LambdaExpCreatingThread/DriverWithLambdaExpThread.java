package LambdaExpCreatingThread;

public class DriverWithLambdaExpThread {
    public static void main(String[] args){
    Runnable runnable = ()->{
        System.out.println("Starting 2nd Thread !!");
    };
    Thread t2 = new Thread(runnable);
    t2.start();
}
}
