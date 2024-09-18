package use_treeset_compartor;

import java.util.Objects;

/**
 * @author wuhaoyu
 * @date 2024/9/18  下午9:03
 * @description: 自定义的类，实现了hashcode 和 equals，从而hashset能够对这个类进行自动去重。
 */

public class Person {
    int age;
    String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return age+" "+name;
    }
}
