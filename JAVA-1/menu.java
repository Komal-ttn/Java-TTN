import java.util.Scanner;
class fun
{
    static double radius;
    public static void area()
    {
        System.out.println("Area of Circle is"+ 3.14*radius*radius);
    }
    public static void circum()
    {
        System.out.println("Area of Circle is"+ 2*3.14*radius);
    }
}

public class menu 
{
    public static void main(String args[])
    {
        int x;       
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("***Menu***");
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate curcumference of circle");
        System.out.println("3.Exit");
        System.out.println("Enter your choice");
        x=sc.nextInt();
        if(x==3)
        {
            System.out.println("Exiting......");
            break;
        }
        System.out.println("Enter radius");
        fun.radius=sc.nextInt();
        switch(x)
        {
            case 1: fun.area();
                    break;
            case 2: fun.circum();
                    break;
            default: System.out.println("Invalid choice");
                    break;
        }

        }
        sc.close();
    }
    
}
