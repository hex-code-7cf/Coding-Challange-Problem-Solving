fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
           var sleep:Int? = stringInput.toIntOrNull();
           if(sleep != null){
                if(sleep == 8){
                    println("PERFECT");
                }else if (sleep < 8){
                    println("LESS");
                }else if (sleep > 8){
                    println("MORE");
                }else{
                    println("Invalid Input");
                }
           }
    }
}