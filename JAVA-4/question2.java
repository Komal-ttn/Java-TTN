/*Q2) Using (instance) Method reference create and apply add and subtract method and
using (Static) Method reference create and apply multiplication method for the functional interface created
*/

@FunctionalInterface
interface operations{
    int performOperation(int a,int b);
}

class MethodReference{
    //instance method reference addition
    int add(int a,int b){
        return a+b;
    }
    //instance method reference subtraction
    int sub(int a,int b){
        return a-b;
    }
    //static method reference multiplication
    public static int mul(int a,int b){
        return a+b;
    }

}

public class question2 {
    public static void main(String[] args) {
        //using instance method reference
        System.out.println("Addition using instance method reference");
        operations opr1= new MethodReference()::add;
        System.out.println(opr1.performOperation(8,45));
        //using instance method reference
        System.out.println("------\nSubtraction using instance method reference");
        operations opr2=(a,b)->a-b;
        System.out.println(opr2.performOperation(12,7));
        //using static method reference
        System.out.println("------\nMultiplication using static method reference");
        operations opr3=MethodReference::mul;
        System.out.println(opr2.performOperation(4,9));

    }

}