package animals;

public class Demo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Adress adress = new Adress();
        dog.bark();

        System.out.println( " " + dog.bark()+"\n "+"Dog name is " + dog.name + " \n" +
                "Dog adress is " + adress.getAdress());
    }
}
