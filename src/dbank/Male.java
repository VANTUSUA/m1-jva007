package dbank;

public class Male extends Clients {
    String initials = "Mr. ";

    @Override
    public String getName() {
        return initials + super.getName();
    }
}
