fun main(){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var stringArray:Array<String>? = stringInput.split(" ").toTypedArray();
        if(stringArray != null && stringArray.size == 2){
            var total:Int? = stringArray[0].toIntOrNull();
            var attempted:Int? = stringArray[1].toIntOrNull();
            if(total != null && attempted != null){
                var unattempted:Int = total - attempted;
                println(unattempted);
            }
        }
    }
}