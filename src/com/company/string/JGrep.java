package com.company.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if(args.length < 1){
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new net.mindview.util.TextFile(args[0])){
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() +": " + m.start());
        }
    }
}
