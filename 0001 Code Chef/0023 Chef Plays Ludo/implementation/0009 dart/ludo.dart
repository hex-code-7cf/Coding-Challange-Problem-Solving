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
          int? x = int.tryParse(stringInput);
          if(x != null){
            if(x == 6){
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