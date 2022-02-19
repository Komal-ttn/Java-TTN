class details {
    String FirstN;
    String LastN;
    int age;
    String desig;

    //default constructor
    details()
    {
        this.FirstN="NULL";
        this.LastN="NULL";
        this.age=0;
        this.desig="NULL";
    }

    //parametrized constructor
    details(String FirstN,String LastN,int age,String desig)
    {
        this.FirstN=FirstN;
        this.LastN=LastN;
        this.age=age;
        this.desig=desig;
    }

    //three arg constructor
    details(String FirstN,String LastN,int age)
    {
        this.FirstN=FirstN;
        this.LastN=LastN;
        this.age=age;
        this.desig="Not Allocated";
    }

    //setter method
    public void setFirstN(String FirstN)
    {
        this.FirstN=FirstN;
    }
    public void setLastN(String LastN)
    {
        this.LastN=LastN;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setdesig(String desig)
    {
        this.desig=desig;
    }

    //display values
    @Override
    public String toString()
    {
        return "First Name is : "+this.FirstN +"\nLast Name is : "+this.LastN+"\nAge is : "+this.age
        +"\nDesignation is : "+this.desig;
    }
        
}

public class employee{
    public static void main(String args[])
    {
        details d=new details();
        System.out.println(d);
        details d1=new details("Komal","Rawat",22,"Trainee");
        System.out.println(d1);
        d1.setLastN("Jazz");
        System.out.println(d1);
        details d2=new details("Maria","Lil",4);
        d2.setdesig("Developer");
        System.out.println(d2);
    }

}