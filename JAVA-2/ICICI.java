import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ICICI implements Bank{
    static long num=1034;
    static int TransactionNum=0;
    long AccountNum;
    double balance;
    String name;
    AccountT account_type;
    //Constructor 
    ICICI(String s,double b,AccountT AT)
    { this.balance=b;
    this.name=s;
    this.account_type=AT;
    this.AccountNum=num;
    num+=1;
    System.out.println("Account created at SBI");
    System.out.println("Account number is : "+this.AccountNum);}

    //get methods
    public double get_interest_rate()
    { return 4.6; }

  
    
    public double getBalance()
    {
        return balance;
    }

    public void withdraw(double amount)
    {
        try {
            if ((balance - amount) < 500) {
                throw new InsufficientAmountException("You need to have atleast 500 in your bank account.\nRequest of Withdrawl can't be processed.");
            }
            else{
                
                TransactionNum++;
                StringBuilder str=new StringBuilder();
                str.append("Transaction number : "+TransactionNum);
                str.append("\nName : "+name);
                str.append("\nAccount Number : "+AccountNum);
                str.append("\nAccont Type : "+account_type);
                str.append("\nWithdrawl Request has been processed\n");
                str.append("Balance before Withdrawl : "+balance);
                balance=balance-amount;
                str.append("\nAmount Withdrawn : Rs"+amount);
                str.append("\nBalance after Withdrawl : "+balance+"\n");
                try {  
                    File f1 = new File("ICICIBANK.txt");
                    // writing the content into the FileOperationExample.txt file  
                    FileWriter fileWritter = new FileWriter(f1.getName(),true);
                    BufferedWriter bw = new BufferedWriter(fileWritter);
                    bw.write(str.toString());
                    bw.close();
                    System.out.println("Done");
                } catch (IOException e) {  
                    System.out.println("Unexpected error occurred");  
                    e.printStackTrace();  
                    }  
                
            }
        }catch(InsufficientAmountException e)
            {     System.out.println(e.getMessage());    }
    }
   public void deposit(double amount)
    {
       
        TransactionNum++;
                StringBuilder str=new StringBuilder();
                str.append("Transaction number : "+TransactionNum);
                str.append("\nName : "+name);
                str.append("\nAccount Number : "+AccountNum);
                str.append("\nAccont Type : "+account_type);
                str.append("\nDeposit Request has been processed\n");
                str.append("Balance before Deposit : "+balance);
                balance+= amount;
                str.append("\nBalance after Deposit : "+balance+"\n");
                try {  
                    File f1 = new File("ICICIBANK.txt");
                    // writing the content into the FileOperationExample.txt file  
                    FileWriter fileWritter = new FileWriter(f1.getName(),true);
                    BufferedWriter bw = new BufferedWriter(fileWritter);
                    bw.write(str.toString());
                    bw.close();
                    System.out.println("Done");
                } catch (IOException e) {  
                    System.out.println("Unexpected error occurred");  
                    e.printStackTrace();  
                    }  

    }
    public void printDetails()
    {
        System.out.println("Bank Name : SBI");
        System.out.println("Interest Rate : "+get_interest_rate());
    }
    public void customer_details()
    {
        printDetails();
        
        System.out.println("Customer Name : "+this.name);
        System.out.println("Balance : "+this.balance);
        System.out.println("Account type : "+this.account_type);
        System.out.println("Account number is : "+this.AccountNum);
    }

}