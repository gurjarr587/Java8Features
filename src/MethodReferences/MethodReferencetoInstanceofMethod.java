package MethodReferences;

public class MethodReferencetoInstanceofMethod {
    public void sayHello(){
        System.out.println("Hello Raj !!");
    }
    public static void main(String[] args){
        MethodReferencetoInstanceofMethod methodReferencetoInstanceofMethod = new MethodReferencetoInstanceofMethod();
        MethodRefFunctionalInterface methodRefFunctionalInterface = methodReferencetoInstanceofMethod::sayHello;
        methodRefFunctionalInterface.Display();
    }
}
