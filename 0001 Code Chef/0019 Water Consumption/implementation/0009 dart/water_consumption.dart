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
          int? water = int.tryParse(stringInput);
          if(water != null){
            if(water >= 2000){
              print("YES");
            }else{
              print("NO");
            }
          }
        }
        count = count - 1;
      }
    }
  }
}