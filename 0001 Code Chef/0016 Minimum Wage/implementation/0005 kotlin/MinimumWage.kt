fun main(args:Array<String>){
    var minimumWage:Int = 11;
    var stringInput:String? = readLine();
    if(stringInput != null){
        var inputWage:Int? = stringInput.toIntOrNull();
        if(inputWage!= null){
            if(inputWage > minimumWage){
                println("YES");
            }else{
                println("NO");
            }
        }
    }
}