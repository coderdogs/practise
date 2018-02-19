package com.weimob.util;

import com.weimob.ScriptEnum;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Administrator on 2018/2/19.
 */
public class ScriptUtil {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName(ScriptEnum.JSENGINE.getName());
        try {
            engine.eval("function show(p1,p2){return (p1+p2)}");
            Invocable invocable = (Invocable) engine;
            long start = System.nanoTime();
            Object show = invocable.invokeFunction("show",12,13);
            long end = System.nanoTime();
            int res = 12 + 13;
            long end2 = System.nanoTime();
            System.out.println((end2-end)/1000);
            System.out.println((end-start)/1000);
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
