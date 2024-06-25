import java.util.Scanner;

class MinimumWage{
    public static void main(String[] args){
        int minimumWage = 11;
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int inputWage = Integer.parseInt(stringInput);

        if(inputWage > minimumWage){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}