fun main(args:Array<String>){
    var stringInput:String? = readLine();
    var score:Int? = stringInput?.toInt();
    if(score != null){
        if(score >= 12){
            println("YES");
        }else{
            println("NO");
        }
    }
}