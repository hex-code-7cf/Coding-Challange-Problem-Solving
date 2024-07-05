using System;

class Burgers{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            string[] stringArray = stringInput.Split(" ");
            int a = Convert.ToInt32(stringArray[0]);
            int b = Convert.ToInt32(stringArray[1]);
            if(a > b){
                Console.WriteLine(b);
            }else{
                Console.WriteLine(a);
            }
            test = test - 1;
        }
    }
}