package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String inputStr = "ABCDEF";
        List<String> in = Arrays.asList(inputStr.split(""));
        perm(in).forEach(System.out::println);
    }

    public static Stream<String> perm(List<String> in) {
        if (in.size() == 1) {
            return in.stream();
        }

        return in.stream()
                .flatMap(s -> {
                    List<String> tmp = new ArrayList<>(in);
                    tmp.remove(s);
                    return perm(tmp).map(r -> s + r);
                });
    }
}
