using System;

class Unattempted{
    static void Main(string[] args){
        int total, attempted, unattempted;
        string stringInput = Console.ReadLine();
        string[] stringArray = stringInput.Split(" ");
        total = Convert.ToInt32(stringArray[0]);
        attempted = Convert.ToInt32(stringArray[1]);
        unattempted = total - attempted;
        Console.WriteLine(unattempted);
    }
}