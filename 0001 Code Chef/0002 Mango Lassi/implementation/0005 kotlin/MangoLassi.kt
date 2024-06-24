fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput!=null){
        var day:Int? = stringInput.toIntOrNull();
        if(day!=null){
            if(day > 35){
                println("YES");
            }else{
                println("NO");
            }
        }
    }
}