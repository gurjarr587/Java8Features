package StreamingJava;

import java.util.stream.Stream;

public class StreamingUsingOf {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("Jai","Veeru");
        stream.forEach(System.out::println);

        Stream<Integer> streamArray = Stream.of(new Integer[]{1,2,3,4,5,6});
        streamArray.forEach(System.out::println);
    }
}
