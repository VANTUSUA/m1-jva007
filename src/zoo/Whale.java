package zoo;

public class Whale extends Animals implements AbilityToSwimTheOcean{
    String phrase = "I`m in the Indian Ocean";
    @Override
    public String swimTheOcean() {
        return phrase ;
    }
}
