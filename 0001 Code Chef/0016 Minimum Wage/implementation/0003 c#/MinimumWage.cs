using System;

class MinimumWage{
    static void Main(string[] args){
        string inputString = Console.ReadLine();
        int input_wage = Convert.ToInt32(inputString);
        int minimum_wage = 11;

        if(input_wage > minimum_wage){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}