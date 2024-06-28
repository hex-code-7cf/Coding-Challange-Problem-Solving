import java.util.Scanner;

public class WaterConsumption{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput;

        stringInput = console.nextLine();
        int test = Integer.parseInt(stringInput);
        while(test > 0){
            stringInput = console.nextLine();
            int water = Integer.parseInt(stringInput);
            if(water >= 2000){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            test = test - 1;
        }

    }
}