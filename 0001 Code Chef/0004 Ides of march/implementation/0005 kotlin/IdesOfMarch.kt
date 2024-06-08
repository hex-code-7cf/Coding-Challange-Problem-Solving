fun main(args:Array<String>){
	var stringInput:String? = readLine();
	var day:Int? = stringInput?.toIntOrNull();
	if(day != null){
		if(day == 15){
			println("YES");
		}else{
			println("NO");
		}
	}	
}