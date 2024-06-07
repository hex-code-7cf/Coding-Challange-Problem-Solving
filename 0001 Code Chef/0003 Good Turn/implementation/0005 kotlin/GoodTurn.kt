fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var stringArray:Array<String> = stringInput.split(" ").toTypedArray();
        var x:Int = stringArray[0].toInt();
        var y:Int = stringArray[1].toInt();
        var sumof:Int = x + y
        if(sumof > 6){
            println("YES");
        }else{
            println("NO");
        }
    }

}