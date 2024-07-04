import java.util.Scanner;

public class LuckyClover{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String stringInput;
        stringInput = read.nextLine();
        int n = Integer.parseInt(stringInput);
        int totalLeaves = 4 + 3*(n-1);
        System.out.println(totalLeaves);
    }
}