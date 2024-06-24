using System;

class AcPlease{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int temperature = Convert.ToInt32(stringInput);
        if(temperature > 30){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}