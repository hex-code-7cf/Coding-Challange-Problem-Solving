import java.util.Scanner;


public class CodeChefRound{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int day = Integer.parseInt(stringInput);
        if(day == 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}