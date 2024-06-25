import java.util.Scanner;

public class HealthySleep{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int sleep = Integer.parseInt(stringInput);
        if(sleep == 8){
            System.out.println("PERFECT");
        }else if(sleep < 8){
            System.out.println("LESS");
        }else if(sleep > 8){
            System.out.println("MORE");
        }else{
            System.out.println("Invalid input");
        }
    }
}