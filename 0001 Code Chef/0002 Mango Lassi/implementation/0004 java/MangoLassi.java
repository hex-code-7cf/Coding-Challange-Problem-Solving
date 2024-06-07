import java.util.Scanner;

public class MangoLassi{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int temperature = Integer.parseInt(stringInput);

        if(temperature > 35){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}