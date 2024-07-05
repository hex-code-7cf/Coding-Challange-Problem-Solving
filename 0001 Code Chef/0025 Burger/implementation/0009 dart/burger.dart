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
          List<String> stringArray = stringInput.split(" ");
          if(stringArray != null && stringArray.length == 2){
            int? a = int.tryParse(stringArray[0]);
            int? b = int.tryParse(stringArray[1]);
            if(a != null && b != null){
              print(b);
            }else{
              print(a);
            }
          }
        }
        count = count - 1;
      }
    }
  }
}