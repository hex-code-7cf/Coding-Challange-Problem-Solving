fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var test:Int? = stringInput.toIntOrNull();
        if(test != null){
            var count:Int = test;
            while(count > 0){
                var stringInput:String? = readLine();
                if(stringInput != null){
                    var water:Int? = stringInput.toIntOrNull();
                    if(water != null){
                        if(water >= 2000){
                            println("YES");
                        }else{
                            println("NO");
                        }
                    }
                }               
                count = count - 1;
            }
        }
    }
}