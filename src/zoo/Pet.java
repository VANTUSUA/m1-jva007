package zoo;

public class Pet extends Animals {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void beFriendly (){
        System.out.println("I`m friendly");
    }
}
