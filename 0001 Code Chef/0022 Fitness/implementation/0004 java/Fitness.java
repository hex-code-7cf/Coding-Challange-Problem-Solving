import java.util.Scanner;

public class Fitness{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput;
        stringInput = console.nextLine();
        int test = Integer.parseInt(stringInput);
        while(test > 0){
            stringInput = console.nextLine();
            int x = Integer.parseInt(stringInput);
            int distance_walk_per_day = x * 2;
            int distance_walk_per_week = 5 * distance_walk_per_day;
            System.out.println(distance_walk_per_week);            
            test = test - 1;
        }
    }
}