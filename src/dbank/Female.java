package dbank;

public class Female extends Clients{
    String initialsMrs = "Mrs. ";
    String initialsMiss = "Miss. ";

    public String getInitialsMrs() {
        return initialsMrs;
    }

    public void setInitialsMrs(String initialsMrs) {
        this.initialsMrs = initialsMrs;
    }

    public String getInitialsMiss() {
        return initialsMiss;
    }

    public void setInitialsMiss(String initialsMiss) {
        this.initialsMiss = initialsMiss;
    }
}
