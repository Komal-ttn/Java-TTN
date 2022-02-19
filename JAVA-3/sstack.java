import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class SpecialStack{
    int []a;
    int size;
    int top;
    int min,second_min;
    SpecialStack(int size)
    {
        this.size=size;
        a=new int[size];
        top=-1;
    }

    boolean isempty()
    {
        return top==-1;
    }
    boolean isfull()
    {
        return top == (size - 1);
    }


    void push(int ele)
    {
        if (isfull()) {  System.out.println("Stack is full.Can't insert more element.");    }
        else {
            top++;
            a[top]=ele;
            System.out.println("Number "+ele+" Inserted");

        }

    }

    int peek()
    {
        if(isempty())
            return 0;
        else
            return a[top];
    }

    int pop()
    {
        if(isempty())
        { return 0;}
        else
        {
            int x=a[top];
            top--;
            return x;
        }
    }
    int GetMinimum()
    {
        if(isempty())
            return 0;
        else{
            int min=a[0];
            for(int i=1;i<size;i++)
            {
                if(min>a[i])
                    min=a[i];
            }
            return min;
        }
    }

    
}

public class sstack {
    public static void main(String args[]) {
        int size;
        String ch="yes";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size=sc.nextInt();
        SpecialStack st=new SpecialStack(size);
        do {
            System.out.println("Enter Choice\n1.Push\t2.Pop\t3.Peep\t4.Get minimum");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element ");
                    st.push(sc.nextInt());
                    break;
                case 2:
                    int z = st.pop();
                    if (z == 0)
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Element popped is " + z);
                    break;
                case 3:
                    int y = st.peek();
                    if (y == 0)
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Element at top of stack is " + y);
                    break;
                case 4:
                    int x = st.GetMinimum();
                    int c = st.peek();
                    if (c == 0)
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Minimum element is " + c);
                    break;

                default: System.out.println("Invalid choice");

            }
            System.out.println("Do you want to continue yes/no");
            ch=sc.next();
        }while (!ch.equals("no"));





        
    }
    
}
