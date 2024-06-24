fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var test:Int = stringInput.toInt();
        while(test > 0){
            var userInput:String? = readLine();
            if(userInput != null){
                var stringArray:Array<String> = userInput.split(" ").toTypedArray();
                if(stringArray.size  == 2){
                    var x:Int = stringArray[0].toInt();
                    var y:Int = stringArray[1].toInt();
                    println(x+y);
                }
            }

            test = test - 1;
        }
    }else{
    println("Invalid input");
   }
}