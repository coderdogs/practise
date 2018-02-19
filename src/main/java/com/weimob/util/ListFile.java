package com.weimob.util;
import java.util.*;
import java.io.*;
/**查找目录中应有的文件
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
            /**
             * java中的isDirectory()是检查一个对象是否是文件夹。返回值是boolean类型的。如果是则返回true，否则返回false
             * 调用方法为：对象.isDirectory()  无需指定参数。
             */
            File[] files = file.listFiles();
            /**
             * listFiles()方法返回的是一个File类的引用，它具有类的所有属性和方法
             */
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