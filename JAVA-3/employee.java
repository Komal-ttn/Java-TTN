import java.util.*;

/*

Question 2
Given the following class
Employee class{ Double Age; Double Salary; String Name}
Design the class in such a way that the default sorting should work on firstname and lastname.

 */
class Employee{
    double age;
    double salary;
    String Name;
    Employee(double age, double salary, String Name){
        this.age=age;
        this.salary=salary;
        this.Name=Name;
    }
}
class NameComparator implements Comparator{
    public int compare(Object a, Object b){
        Employee emp1 = (Employee) a;
        Employee emp2 = (Employee) b;
        return emp1.Name.compareTo(emp2.Name);
    }
}
class SalaryComparator implements Comparator{
    public int compare(Object a, Object b){
        Employee emp1 = (Employee) a;
        Employee emp2 = (Employee) b;
        if(emp1.salary == emp2.salary){
            return 0;
        }
        else if(emp1.salary>emp2.salary){
            return 1;
        }
        else {
            return -1;
        }
    }
}
public class employee {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(new Employee(22,25001,"Komal Rawat"));
        arr.add(new Employee(22,4500,"Komal Roy"));
        arr.add(new Employee(18,45879,"Maria Lil"));
        arr.add(new Employee(25,3258,"Aish Weez"));

        System.out.println("Sorting by First Name and Last Name");
        Collections.sort(arr, new NameComparator());
        Iterator itr = arr.iterator();
        while (itr.hasNext()){
            Employee d =(Employee) itr.next();
            System.out.println("Name: "+d.Name + "\tAge: " + d.age+ "\tSalary: " + d.salary);
        }
        System.out.println("Sorting by salary");
        Collections.sort(arr, new SalaryComparator());
        Iterator itr1 = arr.iterator();
        while (itr1.hasNext()){
            Employee d=(Employee) itr1.next();
            System.out.println("Name: "+d.Name + "\tAge: " + d.age+ "\tSalary: " + d.salary);
        }
    }
}