using System;

class MangoLassi{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int temperature = Convert.ToInt32(stringInput);
        if(temperature > 35){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}