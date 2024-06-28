using System;

class WaterConsumption{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            int water = Convert.ToInt32(stringInput);
            if(water >= 2000){
                Console.WriteLine("YES");
            }else{
                Console.WriteLine("NO");
            }
            test = test - 1;
        }
    }
}