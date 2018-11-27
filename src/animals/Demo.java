package animals;

import static java.lang.Thread.sleep;

public class Demo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println( "New object Dog is created");

        Lion lion = new Lion();
        System.out.println("New Lion is created" );

        String roaming = lion.getRoaming();
        System.out.println("Lion is roaming: " + roaming);

        Cat cat = new Cat();

        System.out.println( cat.getName());

        Hippo h = new Hippo();
        System.out.println(" ----> New hippo is created");

        System.out.println(h.hipposRoar);


    }
}
