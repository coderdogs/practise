package com.weimob.util;

import java.lang.*;

import static java.lang.System.*;

/**
 * Created by Administrator on 2018/2/17.
 */
public class StringUtil {
    public static void main(String[] args){
        out.print(reversalString(null));

        out.print(replace("12vr",'e','v'));

        out.print(cancel(" h n h "));

        out.println(symtemOut("dwa", "dwadw","dwadaw"));
    }


    private static String reversalString(String input){
        if(input==null || input==""){
            return "";
        }
        char[] chars=input.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=chars.length-1; i>=0; i--){
            stringBuffer.append(chars[i]);
        }
        return stringBuffer.toString();
    }

    private static String replace(String source, char charSource, char teacher) {

        char[] chars1 = source.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i]==charSource) {
                chars1[i] = teacher;
            } else {
                chars1[i] = charSource;
            }
            stringBuffer.append(chars1[i]);
        }
        return stringBuffer.toString();
}

    private static String cancel(String value) {
        char[] values = value.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int len=values.length;
        int st=0;
        char[] val = values;
        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < values.length)) ? value.substring(st, len) : value;
    }

    public static String symtemOut(String... args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String arg : args) {
            stringBuilder.append(arg);
        }
        return stringBuilder.toString();
    }

}
