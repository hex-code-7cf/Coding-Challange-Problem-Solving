fun main(args:Array<String>){
    var stringInput:String? = readLine();
    if(stringInput != null){
        var test:Int? = stringInput.toIntOrNull();
        if(test != null){
            var count:Int = test;
            while(count > 0){
                var stringInput:String? = readLine();
                if(stringInput!= null){
                    var distance:Int? = stringInput.toIntOrNull();
                     if(distance != null){
                        var distance_travel_per_day:Int = distance * 2;
                        var distance_travel_per_week:Int = distance_travel_per_day * 5;
                        println(distance_travel_per_week);
                    }
                }
                    count = count - 1;
            }
        }
    }
}