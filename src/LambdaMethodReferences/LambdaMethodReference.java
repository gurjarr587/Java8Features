package LambdaMethodReferences;

public class LambdaMethodReference {
    public static void threadStatus(){
        System.out.println("Thread is running ...");
    }
    public static void main(String[] args){
        Thread t2 = new Thread(LambdaMethodReference::threadStatus);
        t2.start();
    }
}
