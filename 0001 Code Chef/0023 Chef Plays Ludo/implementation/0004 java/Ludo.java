import java.util.Scanner;

public class Ludo{
    public static void main(String[] args){
        String stringInput;
        Scanner read = new Scanner(System.in);
        stringInput = read.nextLine();
        int test = Integer.parseInt(stringInput);
        while(test > 0){
            stringInput = read.nextLine();
            int x = Integer.parseInt(stringInput);
            if(x == 6){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            test = test - 1;
        }
    }
}