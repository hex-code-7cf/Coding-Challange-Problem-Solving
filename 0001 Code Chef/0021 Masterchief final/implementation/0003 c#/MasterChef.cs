using System;

class MasterChef{
    static void Main(string[] args){
        string stringInput;
        stringInput = Console.ReadLine();
        int test = Convert.ToInt32(stringInput);
        while(test > 0){
            stringInput = Console.ReadLine();
            int rank = Convert.ToInt32(stringInput);
            if(rank <= 10){
                Console.WriteLine("YES");
            }else{
                Console.WriteLine("NO");
            }
            test = test - 1;
        }
    }
}