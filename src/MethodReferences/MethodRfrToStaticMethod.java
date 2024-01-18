package MethodReferences;

public class MethodRfrToStaticMethod {
    public static void threadStatus(){
        System.out.println("Thread is running ...");
    }
    public static void main(String[] args){
        Thread t2 = new Thread(MethodRfrToStaticMethod::threadStatus);
        t2.start();
    }
}
