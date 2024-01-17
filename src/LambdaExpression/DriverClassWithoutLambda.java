package LambdaExpression;

public class DriverClassWithoutLambda {
    public static void main(String[] args ){
        //Without Lambda Expression
        AddInterface addInterface = new AddInterface(){
             public void add(int a, int b){
                System.out.println(a+b);
            }
        };
        addInterface.add(2,3);
        }
    }

