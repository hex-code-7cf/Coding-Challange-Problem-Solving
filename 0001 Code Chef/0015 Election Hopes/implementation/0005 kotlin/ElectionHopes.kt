fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var stringArray:Array<String> = stringInput.split(" ").toTypedArray();
        var x:Int? = stringArray[0].toIntOrNull();
        var y:Int? = stringArray[1].toIntOrNull();
        if(x != null && y != null){
            if(x >= 2*y){
                println("YES");
            }else{
                println("NO");
            }
        } 
    }
}
