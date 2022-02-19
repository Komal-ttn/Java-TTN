import java.util.HashMap;

public class Emp {
    String name;
    int age;
    String designation;
    int salary;
    Emp(String name, int age, String designation, int salary){
        this.name=name;
        this.age=age;
        this.designation=designation;
        this.salary=salary;

    }
    public static void main(String[] args) {

        Emp e1= new Emp("Komal", 24, "JVM", 21400);
        Emp e2= new Emp("Maria", 41, "Druple", 78450);
        Emp e3= new Emp("Tarun", 77, "AMC", 20000);
        Emp e4= new Emp("Lily", 21, "JVM", 35458);
        HashMap<String , Integer> map= new HashMap<>();
        map.put(e1.name,e1.salary);
        map.put(e2.name,e2.salary);
        map.put(e3.name,e3.salary);
        map.put(e4.name,e4.salary);
        System.out.println(map);

        if (map.containsKey("Komal")) {

            // Mapping
            Integer a = map.get("Komal");

            // Printing value fr the corresponding key
            System.out.println("value for Komal is : " + a);
        }


    }


}