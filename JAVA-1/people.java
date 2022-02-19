class intro {
    static String First_name;
    static String Last_name;
    static int age;
    //static block
    static
    {
        System.out.println("This is static block so it will execute before main");
        First_name="KOMAL";
        Last_name="RAWAT";
        age=22;
        System.out.println("First name is : "+First_name);
        System.out.println("**************\n");

    }
    //static method to change static values
    public static void change()
    {
        age=23;
        First_name="Maria";
        Last_name="Lil";
    }
    //static method
    public static void display()
    {
        System.out.println("This is static method");
        System.out.println("Last name is : "+Last_name);
        System.out.println("**************\n");
    }
    
}

public class people{

    public static void main(String args[])
    {
        intro.display();      //print using static method
        intro.change();        //changing static values
        System.out.println("Changing static values using static block");
        intro.display();
        System.out.println("Using static variable");          //print using static variable 
        System.out.println("Age is : "+intro.age);
        System.out.println("**************");
    }
    
}
