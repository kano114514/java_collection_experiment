package use_treeset_compartor;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wuhaoyu
 * @date 2024/9/18  下午9:00
 * @description:${description}
 *///TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        TreeSet<Person> set=new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        Person s=new Person(0,"wuhaoyu");
        Person w=new Person(1,"waterside");
        Person sq=new Person(2,"waterside");
        Person nm=new Person(1,"waterside");
        set.add(s);
        set.add(w);
        set.add(sq);
        set.add(nm);
        set.add(s);
        for(Person p:set){
            System.out.println(p);
        }
    }
}