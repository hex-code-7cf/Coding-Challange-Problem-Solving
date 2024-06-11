import java.util.Scanner;


public class ThalaForReason{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int number = Integer.parseInt(stringInput);
        if(number == 7){
            System.out.println("THALA");
        }else{
            System.out.println("SADGE");
        }
    }
}