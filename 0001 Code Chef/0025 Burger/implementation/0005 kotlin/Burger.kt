fun main(){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var test:Int? = stringInput.toIntOrNull();
        if(test != null){
            var count:Int = test;
            while(count > 0){
                var stringInput:String? = readLine();
                if(stringInput != null){
                    var stringArray:Array<String>? = stringInput.split(" ").toTypedArray();
                    if(stringArray != null && stringArray.size == 2){
                        var a:Int? = stringArray[0].toIntOrNull();
                        var b:Int? = stringArray[1].toIntOrNull();
                        if(a != null && b != null){
                            if(a > b){
                                println(b);
                            }else{
                                println(a);
                            }
                        }
                    }
                }
                count = count - 1;
            }
        }
    }
}