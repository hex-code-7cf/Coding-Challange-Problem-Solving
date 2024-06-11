import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    int? number = int.tryParse(stringInput);
    if(number != null){
      if(number == 7){
        print("THALA");
      }else{
        print("SADGE");
      }
    }
  }
}