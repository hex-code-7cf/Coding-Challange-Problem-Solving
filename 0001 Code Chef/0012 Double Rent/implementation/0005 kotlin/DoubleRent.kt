fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var rent:Int? = stringInput.toIntOrNull();
        if(rent != null){
            println(rent*2);
        }
    }
}