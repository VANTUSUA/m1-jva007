package zoo;

public class Predators extends Animals {
    public String voice = "I`m predator 0_0";

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void eat() {
        super.eat();
            System.out.println("Eating meet");
        };
    }
