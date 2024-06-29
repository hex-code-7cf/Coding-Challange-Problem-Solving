import java.util.Scanner;

public class MasterChef{
    public static void main(String[] args){
        Scanner console  = new Scanner(System.in);
        String stringInput;
        stringInput = console.nextLine().trim();
        int test = Integer.parseInt(stringInput);
        while(test > 0){
            stringInput = console.nextLine().trim();
            int rank = Integer.parseInt(stringInput);
            if(rank <= 10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            test = test - 1;
        }
    }
}