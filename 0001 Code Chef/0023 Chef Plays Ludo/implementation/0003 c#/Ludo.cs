using System;

class Ludo{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            int x = Convert.ToInt32(stringInput);
            if(x == 6){
                Console.WriteLine("YES");
            }else{
                Console.WriteLine("NO");
            }
            test = test - 1;
        }
    }
}