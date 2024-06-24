fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var temperature:Int? = stringInput.toIntOrNull();
        if(temperature != null){
            if(temperature > 30){
                println("YES");
            }else{
                println("NO");
            }   
        }
   }else{
        println("Invalid input");
   }
}