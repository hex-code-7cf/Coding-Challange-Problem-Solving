using System;

class BiryaniClasses{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            string[] stringArray = stringInput.Split(" ");
            int x = Convert.ToInt32(stringArray[0]);
            int y = Convert.ToInt32(stringArray[1]);
            int total = x * y;
            Console.WriteLine(total);
            test = test -1;
        }
    }
}