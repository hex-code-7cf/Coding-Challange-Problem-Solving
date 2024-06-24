fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var day:Int? = stringInput.toIntOrNull();
        if(day != null){
            if(day == 16 || day == 17 || day == 18){
                println("ADVITYA");
            }else{
                println("WAITING FOR ADVITIYA");
            }
        }
    }
}