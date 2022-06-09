package io.infinity.common.util;

import javassist.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sakura
 * @descprition
 * @function GenerateClazzMethod
 * @date 2022/6/9 23:22
 */
public class GenerateClazzMethod {
    public static void main(String[] args) throws IOException, CannotCompileException, NotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool = ClassPool.getDefault();
        // 创建类 classname：创建类路径和名称
        CtClass ctClass = pool.makeClass("src.main.java.io.infinity.generate.HelloWorld");
        // 添加方法
        CtMethod mainMethod = new CtMethod(CtClass.voidType, "main", new CtClass[]{pool.get(String[].class.getName())}, ctClass);
        mainMethod.setModifiers(Modifier.PUBLIC + Modifier.STATIC);
        mainMethod.setBody("{System.out.println(\"javassist hi helloworld by 小傅哥(bugstack.cn)\");}");
        ctClass.addMethod(mainMethod);
        // 创建无参数构造方法
        CtConstructor ctConstructor = new CtConstructor(new CtClass[]{}, ctClass);
        ctConstructor.setBody("{}"); ctClass.addConstructor(ctConstructor);
        // 输出类内容
        ctClass.writeFile();
        // 测试调用
        Class<?> clazz = ctClass.toClass();
        Object obj = clazz.newInstance();
        Method main = clazz.getDeclaredMethod("main", String[].class);
        main.invoke(obj, (Object)new String[1]);
    }
}