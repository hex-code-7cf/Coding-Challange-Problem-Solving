import java.util.Scanner;

public class DoubleRent{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int rent = Integer.parseInt(stringInput);
        System.out.println(rent*2);
    }
}