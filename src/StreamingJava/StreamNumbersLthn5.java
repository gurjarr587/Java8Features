package StreamingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamNumbersLthn5 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Ram","Laxman","Sita");
        Long count = list.stream().filter(x->x.length()<5).count();
        System.out.println(count+" strings less than 5 count !!");
    }
}
