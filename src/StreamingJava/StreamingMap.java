package StreamingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamingMap {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Ram","Sita","Laxman");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
