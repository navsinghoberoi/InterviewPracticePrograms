package features_java8;

import java.util.Arrays;
import java.util.List;

public class Lambda {


    public static void main(String[] args) {
        test();

    }

    public static void test() {
        List<String> names_list = Arrays.asList("Adam,Bobby,Chandler,Down");

        System.out.println("Printing values via lambda expression ->");
        names_list.forEach(name -> System.out.println(name));

        System.out.println("Printing values via method references ->");
        names_list.forEach(System.out::println);
    }

}
