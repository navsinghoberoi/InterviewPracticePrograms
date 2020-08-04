package HashcodeEqualsMethod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Nav");
        Student s2 = new Student(1, "Nav");
        Student s3 = new Student(2, "Preet");

        HashSet<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);

        // If hashcode() & equals() not overrided, then duplicate values will be save [ex s1 & s2]
        System.out.println("Elements in the set =>" + set);

        Map<Student,Integer> map = new HashMap<>();
        map.put(s1,1);
        map.put(s2,3);
        map.put(s3,4);

        // If hashcode() & equals() not overrided, then duplicate keys will be save [ex s1 & s2]
        System.out.println("Elements in the map =>" + map);

        System.out.println(map.get(s1));
        System.out.println(map.get(s2));

        // Check output of map & set before & after commenting hashcode() and equals()

    }


}
