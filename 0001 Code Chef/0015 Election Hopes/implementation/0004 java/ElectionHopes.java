import java.util.Scanner;
public class ElectionHopes{
    public static void main(String[] args){
        Scanner  console = new Scanner(System.in);
        String stringInput = console.nextLine();
        String[] stringArray = stringInput.split(" ");
        int x = Integer.parseInt(stringArray[0]);
        int y = Integer.parseInt(stringArray[1]);
        if(x >= 2*y){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}