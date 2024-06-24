using System;

class AddTwoNumber{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            string[] stringArray = stringInput.Split(" ");
            int x = Convert.ToInt32(stringArray[0]);
            int y = Convert.ToInt32(stringArray[1]);
            Console.WriteLine(x+y);
            test = test - 1;
        }
    }
}