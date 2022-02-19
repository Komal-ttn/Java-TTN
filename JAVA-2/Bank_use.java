import java.util.Scanner;

enum AccountT{
   SAVINGS,CURRENT;
}

//User-defined exception
class InsufficientAmountException extends Exception
{
    public InsufficientAmountException(String str)
    { super(str);  }
}

interface Bank
{
    double get_interest_rate();
    double getBalance();
    void printDetails();
    
    abstract void withdraw(double wit);
    abstract  void deposit(double d);
    abstract void customer_details();
   // abstract void file_save();
}


public class Bank_use {
    public static void main(String[] args) {
    Bank b;
    String ch="null";
    int x,y,t;
    String name;
    double balance;
    AccountT at=null;
    double deposits,withdraws;
        Scanner sc=new Scanner(System.in);
        System.out.println("CHOOSE BANK\t1.SBI\t2.BOI\t3.ICICI");
        x=sc.nextInt();
    do{
        System.out.println("Enter Name : ");
        name=sc.next();
        System.out.println("\nEnter Balance : ");
        balance=sc.nextDouble();
        System.out.println("Select Account type : Press 1 for SAVINGS\tPress 2 for Current");
        t=sc.nextInt();
        if(t==1)
        {
            at=AccountT.SAVINGS;
        }
        else if(t==2)
        {at=AccountT.CURRENT;      }
        else{ System.out.println("Invalid Choice ");
            }
        //Bank b;  
        switch(x)
        {

            case 1:
                    System.out.println("*****This is SBI BANK*****");
                    b=new SBI(name,balance,at);
                    break;
            case 2:
                    System.out.println("*****This is BOI BANK*****");
                    b=new BOI(name,balance,at);
                    break;
            case 3: System.out.println("*****This is ICICI BANK*****");
                    b=new ICICI(name,balance,at);
                    break;
            default: b=null;

        }

          
            
        do{
            System.out.println("CHOOSE Action\t1.Deposit\t2.Withdraw");
                System.out.println("3.Get Details\t4.Get Balance\t5.Know Interest Rate");
                y=sc.nextInt();
                
                    switch(y)
                    { 
                    case 1: 
                            
                            System.out.print("Enter amount to deposit : ");
                            deposits=sc.nextDouble();
                            b.deposit(deposits);
                            break;
                    case 2: 
                            System.out.print("Enter amount to Withdraw : ");
                            withdraws=sc.nextDouble();
                            b.withdraw(withdraws);
                            break;
                    case 3:
                            b.customer_details();
                            break;
                    case 4: System.out.println("Your balance is : "+b.getBalance());
                            break;
                    case 5: System.out.println("Interest Rate for Bank is : "+b.get_interest_rate());
                            break;
                    default: System.out.println("Invalid choice");
                            break;                        
                    }
                    System.out.println("Do you want to Continue yes/no");
                    ch=sc.next();
                }while(!ch.equals("no"));
           
           
            System.out.println("Do you want to Enter new user  yes/no");
            ch=sc.next();       

    }while(!ch.equals("no"));
      
    sc.close();
    }

}
