package zoo;

public class Dog extends Pet {
    String name;

    @Override
    public void voice(String bark) {
        super.voice("Dog is barking");
    }
}
