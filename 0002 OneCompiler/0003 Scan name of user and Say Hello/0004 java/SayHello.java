import java.util.Scanner;

public class SayHello{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello " + name + "...");
    }
}