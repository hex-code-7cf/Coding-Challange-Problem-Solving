using System;

class Advitiya{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int day = Convert.ToInt32(stringInput);
        if(day == 16 || day == 17 || day == 18){
            Console.WriteLine("ADVITIYA");
        }else{
            Console.WriteLine("WAITING FOR ADVITIYA");
        }
    }
}