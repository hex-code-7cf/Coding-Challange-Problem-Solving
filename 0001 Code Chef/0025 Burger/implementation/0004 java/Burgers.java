import java.util.Scanner;

class Burgers{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String stringInput;
        stringInput = read.nextLine();
        int test = Integer.parseInt(stringInput);
        while(test > 0){
            stringInput = read.nextLine();
            String[] stringArray = stringInput.split(" ");
            int a = Integer.parseInt(stringArray[0]);
            int b = Integer.parseInt(stringArray[1]);
            if(a > b){
                System.out.println(b);
            }else{
                System.out.println(a);
            }
            test = test - 1;
        }
    }
}