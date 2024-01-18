package MethodReferences;

public class MethodRfrToInstanceofMethod {
    public void sayHello(){
        System.out.println("Hello Raj !!");
    }
    public static void main(String[] args){
        MethodRfrToInstanceofMethod methodReferencetoInstanceofMethod = new MethodRfrToInstanceofMethod();
        MethodRfrFunctionalInterface methodRfrFunctionalInterface = methodReferencetoInstanceofMethod::sayHello;
        methodRfrFunctionalInterface.Display();
    }
}
