package MethodReferences;

public class MethodReferencetoStaticMethod {
    public static void threadStatus(){
        System.out.println("Thread is running ...");
    }
    public static void main(String[] args){
        Thread t2 = new Thread(MethodReferencetoStaticMethod::threadStatus);
        t2.start();
    }
}
