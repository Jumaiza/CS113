//Zaid Abu Jumaiza - CS 113-004

import java.util.Scanner;

public class CoinFlipper
{
    public static void main(String args[]){
        
        Scanner bot = new Scanner(System.in);
        
        
        MonetaryCoin[] coins = new MonetaryCoin[35];
        
        int randomValue = 0;
        
        for (int i = 0; i<coins.length; i++) {
        	
            randomValue = (int)(Math.random()*5);
            
            if (randomValue == 0)
                coins[i] = new MonetaryCoin(1);
            else if (randomValue == 1) 
            	coins[i] = new MonetaryCoin(5);
            else if (randomValue == 2) 
            	coins[i] = new MonetaryCoin(10); 
            else if (randomValue == 3) 
            	coins[i] = new MonetaryCoin(25);
            else if (randomValue == 4) 
            	coins[i] = new MonetaryCoin(100);
            
        }
        
        int totalValueHeads = 0;
        int headCount = 0;
        for (int j = 0; j<coins.length ;j++) {
            if (coins[j].isHeads()){
                totalValueHeads += coins[j].getValue();
                headCount++;
            }
        }
        
        int average = totalValueHeads/headCount;
        
        System.out.println("Average monetory value of all coins with HEAD face: "+average+" cents");
        
        
    }
}
