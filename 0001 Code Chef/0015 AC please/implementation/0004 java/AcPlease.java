import java.util.Scanner;

class AcPlease{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        int temperature = Integer.parseInt(stringInput);
        if(temperature > 30){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}