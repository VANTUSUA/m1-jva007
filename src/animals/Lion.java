package animals;

public class Lion extends Predators{
    String roaming = "R-r-r-r-r";

    public String getRoaming() {
        System.out.println();
        return roaming;
    }

    public void setRoaming(String roaming) {
        this.roaming = roaming;
    }

    public String roam(){
        return roaming;
    };
}
