package LambdaExpression;

public class DriverClass {
    public static void main(String[] args ){
        AddInterface addInterface = new AddInterface(){
             public void add(int a, int b){
                System.out.println(a+b);
            }
        };
        addInterface.add(2,3);
        }
    }

