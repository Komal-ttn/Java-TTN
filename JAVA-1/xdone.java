import java.util.Scanner;
public class xdone {
    public static void main(String args[])
    {
        String s = " ";
        String x;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter String.. TO exit enter XDONE/xdone");
            x=sc.nextLine();
            if((x.equalsIgnoreCase("XDONE")))
            {break;}
            s=s+" "+x;
        }while(true);
        System.out.println("String is : "+ s);
        sc.close();
    }   
}
