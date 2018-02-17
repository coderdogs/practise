package com.weimob.util;
import java.util.*;
import java.io.*;
/**
 * Created by Administrator on 2018/2/17.
 */
public class ListFile {
    public static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        findFile("D:\\90Workspace\\maven\\stone","jar");
        for (String re : res) {
            System.out.println(re);
        }
        System.out.println(res.size());
        res.clear();
    }
    /**
     * 递归查询文件
     * @param filePath
     * @param key
     */
    public static void findFile(String filePath, String key) {
        File file = new File(filePath);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files!=null) {
                for (File fileVar : files) {
                    findFile(fileVar.getAbsolutePath(), key);
                }
            }
        } else {
            if (file.getName().contains(key)) {
                res.add(file.getAbsolutePath());
            }
        }
    }
}