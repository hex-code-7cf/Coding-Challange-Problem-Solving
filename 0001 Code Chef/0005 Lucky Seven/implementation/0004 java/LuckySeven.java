import java.util.Scanner;

public class LuckySeven{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        System.out.println(stringInput.charAt(6));
    }
}