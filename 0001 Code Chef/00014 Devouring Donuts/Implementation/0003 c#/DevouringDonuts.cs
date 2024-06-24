using System;

class DevouringDonuts{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        string[] stringArray = stringInput.Split(" ");
        int x = Convert.ToInt32(stringArray[0]);
        int y = Convert.ToInt32(stringArray[1]);
        Console.WriteLine(x*y);
    }
}