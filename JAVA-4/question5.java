//Q5)Implement multiple inheritance with default method inside interface.



interface defaultPractice {
    default void display() {
        System.out.println("This is defaultPractice class");

    }

}
interface child1 extends defaultPractice {
    default void display() {
        System.out.println("This is child1");
    }
}

interface child2 extends defaultPractice {
    default void display() {
        System.out.println("This is child2");
    }

}

public class question5 implements child1,child2{
    public void display(){
        child1.super.display();
        child2.super.display();
    }
    public static void main(String[] args) {
        new question5().display();
    }

}