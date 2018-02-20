package com.weimob;

/**
 * 枚举：是一个常量
 * （常量类）
 * Created by Administrator on 2018/2/19.
 */
public enum ScriptEnum {
    JSENGINE(1,"js"),
    CENGINE(2,"c");
    private int type;
    private String name;
    public static void main(String[] args){
        System.out.print(ScriptEnum.JSENGINE);
    }
    ScriptEnum(int i,String javascript){
        javascript="function show(p1,p2){return (p1+p2)}";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
}
