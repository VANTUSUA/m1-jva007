package zoo;

public class Dog extends Pet {
    String braking ="Dog is barking" ;

    @Override
    public void voice(String bark) {
        super.voice(braking);
    }
}
