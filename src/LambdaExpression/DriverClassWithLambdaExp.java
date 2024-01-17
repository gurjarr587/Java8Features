package LambdaExpression;

public class DriverClassWithLambdaExp {
    public static void main(String[] args){
        //With Lambda Expression
        AddInterface addInterface = (a,b) -> {
            System.out.println(a+b);
        };
        addInterface.add(3,4);
    }
}
