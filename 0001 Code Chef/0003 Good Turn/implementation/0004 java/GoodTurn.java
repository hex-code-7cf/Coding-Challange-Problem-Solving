import java.util.Scanner;


public class GoodTurn{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        String[] stringArray = stringInput.split(" ");
        int x = Integer.parseInt(stringArray[0]);
        int y = Integer.parseInt(stringArray[1]);
        int sumof = x + y;
        if(sumof > 6){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}