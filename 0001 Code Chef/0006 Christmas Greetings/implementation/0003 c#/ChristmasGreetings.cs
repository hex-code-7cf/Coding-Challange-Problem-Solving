using System;

class ChristmasGreetings{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int day = Convert.ToInt32(stringInput);
        if(day == 25){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}