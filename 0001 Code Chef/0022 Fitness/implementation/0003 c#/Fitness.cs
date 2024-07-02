using System;

class Fitness{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            int x = Convert.ToInt32(stringInput);
            int distance_walk_per_day = x * 2;
            int distance_walk_per_week = 5 * distance_walk_per_day;
            Console.WriteLine(distance_walk_per_week);
            test = test - 1;
        }
    }
}