package com.company.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[frb][aiu][gx]");
        Matcher m = p.matcher("fix the rug with bags");
        while (m.find())
            System.out.print(m.group() +"||");
        System.out.println();

        m.reset("fix the rig with rags");
        while (m.find())
            System.out.print(m.group() +"//");
    }
}
