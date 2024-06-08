using System;

class IdesOfMarch{
    static void Main(string[] args){
        string stringInput = Console.ReadLine();
        int day = Convert.ToInt32(stringInput);
        if(day == 15){
            Console.WriteLine("YES");
        }else{
            Console.WriteLine("NO");
        }
    }
}