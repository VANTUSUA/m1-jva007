package zoo;

public class Hippo extends Animals implements AbilityToSwimTheLake{
    @Override
    public void swim() {
        System.out.println("I`m swimming in the Pacific ocean");
    }
}
