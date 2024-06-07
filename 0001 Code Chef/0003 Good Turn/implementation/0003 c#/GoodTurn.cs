using System;

class GoodTurn{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        string[] stringArray = stringInput.Split(' ');
        int x = Convert.ToInt32(stringArray[0]);
        int y = Convert.ToInt32(stringArray[1]);
        int sumof = x + y;
        if(sumof > 6){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}