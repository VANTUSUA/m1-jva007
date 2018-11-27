package animals;

import static java.lang.Thread.sleep;

public class Demo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println( " New object Dog is created");

        System.out.println( " " + dog.bark()+"\n "+"Dog name is " + dog.name + " \n" +
                "Dog adress is ");
    }
}
