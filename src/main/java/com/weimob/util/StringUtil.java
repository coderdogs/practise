package com.weimob.util;

import java.lang.*;

import static java.lang.System.*;

/**
 * Created by Administrator on 2018/2/17.
 */
public class StringUtil {
    /**
     * reversalString 将字符串倒序
     * @param input
     * @return
     */
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

    /**
     * replace 将已有的字符进行替换
     * @param source
     * @param charSource
     * @param teacher
     * @return
     */
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

    /**
     * 去掉前后的空格
     * @param value
     * @return
     */
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

    /**
     * 将多个字符串进行连接(不限制字符串个数)
     * @param args
     * @return
     */
    public static String symtemOut(String... args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String arg : args) {
            stringBuilder.append(arg);
        }
        return stringBuilder.toString();
    }
}
