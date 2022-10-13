public class BatterListing{
    private String name;
    private double average;
    
    public BatterListing(String name, double average){
        this.name = name;
        this.average = average;
    }
    
    public String toString(){
        String listing = name + "   " + average;
        return listing;
    }
    
    public String getName(){
        return name;
    }
    
    public double getAverage(){
        return average;
    }
}
//Game class
import java.util.Formatter;
import java.util.Scanner;
public class Game {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please enter a player's name: ");
        String userPlayerName = input.nextLine();
        
        System.out.println("Please enter your player's batting average: ");
        double userPlayerAverage = input.nextDouble();
        
        String players[] = {userPlayerName};
        double stats[] = {userPlayerAverage};
        
        Formatter outputFormat = new Formatter();
        outputFormat.format("%15s      %15s\n","Player Name","Batting Average");
        
        for (String word : players) {
            outputFormat.format("%14s",word);
        }
        for (double stat : stats) {
            outputFormat.format("%14s",stat);
        }
        
        
        System.out.println(outputFormat);
        
        
        input.close();
    }
}
