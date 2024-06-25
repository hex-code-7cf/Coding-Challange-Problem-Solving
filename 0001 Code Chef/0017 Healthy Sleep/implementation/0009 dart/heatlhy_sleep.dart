import 'dart:io';


void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    int? sleep = int.tryParse(stringInput);
    if(sleep != null){
      if(sleep == 8){
        print("PERFECT");
      }else if (sleep > 8){
        print("MORE");
      }else if (sleep < 8){
        print("LESS");
      }else{
        print("Invalid input");
      }
    }
  }

}