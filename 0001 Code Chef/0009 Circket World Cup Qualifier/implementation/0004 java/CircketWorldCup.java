import java.util.Scanner;

public class CircketWorldCup{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int score = Integer.parseInt(stringInput);
        if(score >= 12){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}