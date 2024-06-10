using System;

class CircketWorldCup{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int score = Convert.ToInt32(stringInput);
        if(score >= 12){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}