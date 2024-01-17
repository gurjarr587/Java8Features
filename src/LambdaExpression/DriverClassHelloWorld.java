package LambdaExpression;

public class DriverClassHelloWorld {
    public static void main(String[] args){
        HelloWorldInterface helloWorldInterface = (String name) -> {return "Hello " + name;};
        System.out.println(helloWorldInterface.myHelloWorld("Raj"));
    }
}
