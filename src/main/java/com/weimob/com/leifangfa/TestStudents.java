package com.weimob.com.leifangfa;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/26.
 */
public class TestStudents {
    public static void main(String[] args){
        StudentsBiz ss=new StudentsBiz();
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.print("请输入学生姓名：");
            String name1=input.next();
            ss.addName(name1);//调用方法时name实参，没有数据类型
        }
        ss.showNames();//显示学员姓名

        //调用含有多个参数的查找学员姓名的方法
        System.out.print("请输入要查找的起始位置:");
        int s=input.nextInt();
        System.out.print("请输入要查找的终止位置:");
        int e=input.nextInt();
        System.out.print("请输入要查找的姓名:");
        String name=input.next();
        boolean find=ss.searchName(s,e,name);
        if(find==true){
            System.out.print("找到了"+name+"的学生");
        }else{
            System.out.println("查无此人");
        }

        int[] score=new int[]{100,99,98,97,96};
        double avg=ss.calAvg(score);
        System.out.println("平均分为："+avg);
    }
}
