fun main(args:Array<String>){
    var stringInput:String? = readLine();
    var number:Int? = stringInput?.toInt();
    if(number != null){
        println(number);
    }else{
        print("Invalid input");
    }
}