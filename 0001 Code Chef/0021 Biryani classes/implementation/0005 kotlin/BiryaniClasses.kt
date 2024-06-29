fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var test:Int? = stringInput.toIntOrNull();
        if(test != null){
            var count:Int = test;
            while(count > 0){
                var stringInput:String? = readLine();
                if(stringInput != null){
                    var stringArray:Array<String> = stringInput.split(" ").toTypedArray();
                    if(stringArray.size == 2){
                        var x:Int? = stringArray[0].toIntOrNull();
                        var y:Int? = stringArray[1].toIntOrNull();
                        if(x != null && y != null){
                            var total:Int = x* y;
                            println(total);
                        }
                    }
                }
                count = count - 1;
            }
        }
    }
}