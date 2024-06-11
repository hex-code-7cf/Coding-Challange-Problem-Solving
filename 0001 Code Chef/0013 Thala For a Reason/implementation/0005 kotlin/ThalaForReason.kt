fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var number:Int? = stringInput.toIntOrNull();
        if(number != null){
            if(number == 7){
                println("THALA");
            }else{
                println("SADGE");
            }
        }
    }
}