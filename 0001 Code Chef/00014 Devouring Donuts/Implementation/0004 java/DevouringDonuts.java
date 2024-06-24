import java.util.Scanner;


class DevouringDonuts{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String stringInput = console.nextLine();
        String[] stringArray = stringInput.split(" ");
        int x = Integer.parseInt(stringArray[0]);
        int y = Integer.parseInt(stringArray[1]);
        System.out.println(x*y);
    }
}