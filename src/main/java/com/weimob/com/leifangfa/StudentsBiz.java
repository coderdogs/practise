package com.weimob.com.leifangfa;

/**
 * Created by Administrator on 2018/2/26.
 */
public class StudentsBiz {
    String[] names=new String[30];

    public void addName(String name){
        for(int i=0;i<names.length;i++){
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }

    /**
     * 显示学员姓名的方法
     */
    public void showNames(){
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){
                System.out.println(names[i]);
            }
        }
    }

    /**
     * 带多个参数的方法
     *
     */
    public boolean searchName(int start,int end,String name){
       boolean find=false;
        for(int i=start-1;i<end;i++){
            System.out.println(i);
            if(names[i].equals(name)){
                find=true;
                break;
            }
        }
        return find;
    }

    /**
     * 含有数组参数的方法
     * @param scores
     * @return
     */
    public double calAvg(int[] scores){
        double avg=0.0;
        int sum=0;
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
            sum=sum+scores[i];
        }
        avg=(double) sum/scores.length;
        return avg;
    }
}
