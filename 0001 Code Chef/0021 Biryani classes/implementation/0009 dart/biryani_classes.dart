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
          List<String>? stringArray = stringInput.split(" ");
          if(stringArray.length == 2){
            int? x = int.tryParse(stringArray[0]);
            int? y = int.tryParse(stringArray[1]);
            if(x != null && y != null){
              int total = x * y;
              print(total);
            }
          }
        }
        count = count - 1;
      }
    }
  }
}