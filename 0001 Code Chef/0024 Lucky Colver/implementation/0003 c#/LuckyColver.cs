using System;

class LuckyColver{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int n = Convert.ToInt32(stringInput);
        int totalLeaves = 4 + 3*(n-1);
        Console.WriteLine(totalLeaves);
    }
}