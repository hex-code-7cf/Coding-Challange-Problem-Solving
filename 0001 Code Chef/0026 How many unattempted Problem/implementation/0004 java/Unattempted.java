import java.util.Scanner;

public class Unattempted{
    public static void main(String[] args){
        int total, attempted, unattempted;
        String stringInput;
        String[] stringArray;

        Scanner read = new Scanner(System.in);
        stringInput = read.nextLine();
        stringArray = stringInput.split(" ");
        total = Integer.parseInt(stringArray[0]);
        attempted = Integer.parseInt(stringArray[1]);
        unattempted = total - attempted;
        System.out.println(unattempted);
    }
}