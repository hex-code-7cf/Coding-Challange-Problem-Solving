using System;


class SavingTaxes{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            string[] stringArray = stringInput.Split(" ");
            int x = Convert.ToInt32(stringArray[0]);
            int y = Convert.ToInt32(stringArray[1]);
            if(x > y){
                Console.WriteLine(x-y);
            }else{
                Console.WriteLine(0);
            }
            test = test - 1;
        }
    }
}