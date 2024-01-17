package LambdaExpression;
import java.util.ArrayList;
import java.util.List;

public class DriverClassLambdaExpression {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("EFG");
        list.add("Dream");
        list.add("God");
        list.forEach((name)-> System.out.println(name));
    }
}
