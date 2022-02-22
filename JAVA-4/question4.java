/*
Q4) WAP using java 8:
Collect all  even numbers from a list using stream
Given a list of objects of following class:
           class Employee{
           String fullName;
           Long salary;
           String city;
           }

          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    String fullName;
    Long salary;
    String city;

    Employee(String fullName,Long salary,String city){
        this.fullName=fullName;
        this.salary=salary;
        this.city=city;
    }
    public Long getSalary(){
        return this.salary;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getCity(){
        return  this.city;
    }
}
public class question4 {
    public static void main(String[] args) {
        //3 ways to create Stream
        //1st way
        Arrays.asList(5,6,7,2,9).stream();

        //2nd way
        int []a= new int[]{1,2,5,3,2};
        Stream.of(a);

        //3rd way
        Stream.of(5,2,1,3,4,7);

        //Collect all  even numbers from a list using stream
        List<Integer> arr= Arrays.asList(4,5,7,8,9,5);
        System.out.println(arr.stream()
                        .filter(e->e%2==0)
                        .collect(Collectors.toList())
                );

        System.out.println("Part 2>>>>>Employee Class");
        //Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
        ArrayList<Employee> employee=new ArrayList<Employee>();

        Employee emp1=new Employee("Komal Rawat Great", 3000L,"Delhi");
        employee.add(emp1);
        Employee emp2=new Employee("Maria Singh Rawat", 4000L,"Delhi");
        employee.add(emp2);
        Employee emp3=new Employee("Komal Says what", 2000L,"Delhi");
        employee.add(emp3);
        Employee emp4=new Employee("Sarthak singh Rawat", 9000L,"Mumbai");
        employee.add(emp4);

        System.out.println(employee.stream()

                        .filter(salary->salary.getSalary()<5000)
                .filter(city->city.getCity().equals("Delhi"))               //filter is a predicate
                .map(name->name.getFullName().split(" ")[0])     //map is a function
                .distinct()
                .collect(Collectors.toList()));


    }
}
