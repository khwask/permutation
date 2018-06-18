package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        for (String ans : perm("ABCD")) {
            System.out.println(ans);
        }
    }

    public static List<String> perm(String in) {
        List<String> ret = new ArrayList<>();
        if (in.length() == 1) {
            ret.add(in);
            return ret;
        }

        for (int i = 0; i < in.length(); i++) {
            for (String out : perm(in.substring(0, i) + in.substring(i + 1))) {
                ret.add(in.substring(i,i + 1) + out);
            }
        }
        return ret;
    }
}
