//Zaid Abu Jumaiza - CS 113-004

public class MonetaryCoin extends Coin{
    
    private int value;
    
    public MonetaryCoin (int v) {
        super();
        value = v;
    }

    public String toString() {
        return "Monetary value of coin: " + value;
    }

    public int getValue(){
        return value;
    }
    
    public void setValue(int cents){
        value = cents;
    }
    
}
