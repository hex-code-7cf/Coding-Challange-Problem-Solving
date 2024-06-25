using System;

class ElectionHopes{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        string[] stringArray = stringInput.Split(" ");
        int x = Convert.ToInt32(stringArray[0]);
        int y = Convert.ToInt32(stringArray[1]);

        if(x >= 2*y){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}