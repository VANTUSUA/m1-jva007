package InnersAndExceptions;

public class Dog
{
    private boolean isAngry = true;

    public void bark()
    {
        if (isAngry)
        {
            class SecretPartOfTheBrain
            {
                private String theThoughts = "No, barking is not enough this time...";

                public void action()
                {
                    System.out.println("S");
                }
            }

            new SecretPartOfTheBrain().action();
            System.out.println(SecretPartOfTheBrain.class.getName());
        }

    }

    public static void main(String[] args)
    {
        System.out.println(Dog.class.getName());
        new Dog().bark();
    }
}