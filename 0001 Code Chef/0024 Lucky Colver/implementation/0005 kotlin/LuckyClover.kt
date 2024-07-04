fun main(){
    var stringInput:String? = readLine()
    if(stringInput != null){
        var n:Int? = stringInput.toIntOrNull()
        if(n != null){
            var totalLeaves:Int = 4 + 3*(n-1);
            println(totalLeaves);
        }
    }
}