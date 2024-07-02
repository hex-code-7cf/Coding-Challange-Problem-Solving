import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    int? test = int.tryParse(stringInput);
    if(test != null){
      int count = test;
      while(count > 0){
        String? stringInput = stdin.readLineSync();
        if(stringInput != null){
          int? distance = int.tryParse(stringInput);
          if(distance != null){
            int distance_walk_per_day = 2 * distance;
            int distance_walk_per_week = 5 * distance_walk_per_day;
            print(distance_walk_per_week);
          }
        }
        count = count - 1;
      }
      }
    } 
  }