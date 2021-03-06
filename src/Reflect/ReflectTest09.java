package Reflect;

import java.lang.reflect.Constructor;

/**
 * 获取某个特定的构造方法，然后创建对象
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        //1、获取类
        Class c = Class.forName("Reflect.Customer");

        //2、获取特定的构造方法
        Constructor con = c.getDeclaredConstructor(String.class,int.class);

        //3、创建对象
        Object o = con.newInstance("张三",25);
        System.out.println(o);
    }
}
class Customer{
    String name;
    int age;
    Customer(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}