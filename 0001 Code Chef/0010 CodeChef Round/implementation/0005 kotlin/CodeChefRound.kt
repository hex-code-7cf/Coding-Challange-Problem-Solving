fun  main(args:Array<String>){
    var stringInput:String? = readLine();
    var day:Int? = stringInput?.toInt();
    if(day != null){
        if(day == 4){
            println("YES");
        }else{
            println("NO");
        }
    }
}