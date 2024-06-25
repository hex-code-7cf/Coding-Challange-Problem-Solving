using System;

class HealthySleep{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int sleep = Convert.ToInt32(stringInput);
        if(sleep < 8){
            Console.WriteLine("LESS");
        }else if(sleep > 8 ){
            Console.WriteLine("MORE");
        }else{
            Console.WriteLine("PERFECT");
        }
    }
}