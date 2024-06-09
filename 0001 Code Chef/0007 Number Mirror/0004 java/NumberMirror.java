import java.util.Scanner;

public class NumberMirror{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int number = Integer.parseInt(stringInput);
        System.out.println(number);
    }
}