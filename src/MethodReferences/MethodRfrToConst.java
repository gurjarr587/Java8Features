package MethodReferences;

public class MethodRfrToConst {
    public static void main(String[] args) {
        //Method reference to a constructor
        MethodRfrInterface ref = Hello::new;
        ref.display("Hello Raj Constructor");
    }
}
