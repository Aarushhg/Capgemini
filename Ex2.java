package spring;

import java.util.function.Function;

public class Ex2 {

    public static void main(String[] args) {

        Function<String, String> addSpace =
                str -> String.join(" ", str.split(""));

        String result = addSpace.apply("CG");
        System.out.println(result);   
    }
}