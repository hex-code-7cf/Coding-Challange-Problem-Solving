using System;

class DoubleRent{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int rent = Convert.ToInt32(stringInput);
        Console.WriteLine(rent*2);
    }
}