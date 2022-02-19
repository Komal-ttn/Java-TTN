import java.util.*;

/*
Question 1.
1) Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
find the sum of the numbers in List.
 */
public class listt {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        List<Float> nums=new ArrayList<Float>();

        for(int i=0;i<5;i++)
        {
            System.out.printf("Enter %d element : ",i+1);
            nums.add(sc.nextFloat());
            System.out.println();
        }

        float sum=0f;
        ListIterator<Float> itr=nums.listIterator();    
        while(itr.hasNext()){    
              sum+=itr.next();
        }    
        System.out.printf("Sum of floating values is %-5.3f%n",sum);

        sc.close();
        
    }


    
}
