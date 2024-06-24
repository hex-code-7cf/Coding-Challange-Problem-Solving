import java.util.Scanner;

public class AddTwoSum{
    public static void main(String[] args){
        Scanner console  = new Scanner(System.in);
        String stringInput;
        stringInput = console.nextLine();
        int test = Integer.parseInt(stringInput);
        while(test > 0){
            stringInput = console.nextLine();
            String[] stringArray = stringInput.split(" ");
            int x = Integer.parseInt(stringArray[0]);
            int y = Integer.parseInt(stringArray[1]);
            System.out.println(x+y);
            test = test - 1;
        }
    }
}