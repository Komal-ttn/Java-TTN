import java.util.Locale;

/*Q1) Write the following a functional interface and implement it using lambda:

        First number is greater than second number or not Parameter (int ,int ) Return boolean
        Increment the number by 1 and return incremented value Parameter (int) Return int
        Concatenation of 2 string Parameter (String , String ) Return (String)
        Convert a string to uppercase and return . Parameter (String) Return (String)
*/
//Interface 1
@FunctionalInterface
interface compare{
    boolean greater(int a,int b);
}

//Interface 2
@FunctionalInterface
interface increment{
    int incrementBy1(int a);
}

//interface 3
@FunctionalInterface
interface stringConcatenation{
    String concatenationString(String str1,String str2);
}

//interface 4
@FunctionalInterface
interface toUpperCase{
    String toUpperCasee(String str);
}

public class functionalInterface {
    public static void main(String[] args) {
        //lambda exp for interface 1
        System.out.println("Comparison");
        compare cmp=(a,b)-> a>b;
        System.out.println(cmp.greater(7,4));
        //lambda exp for interface 2
        System.out.println("------\nIncrement by 1");
        increment inc=(a)->a+1;
        System.out.println(inc.incrementBy1(5));
        //lambda exp for interface 3
        System.out.println("------\nConcat of 2 strings");
        stringConcatenation str=(a,b)-> a.concat(b);
        System.out.println(str.concatenationString("Hello","Java"));
        //lambda exp for interface 4
        System.out.println("------\nString to uppercase");
        toUpperCase upr=(a)-> a.toUpperCase();
        System.out.println(upr.toUpperCasee("Hello komal"));

    }


}
