import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  int? number = int.tryParse(stringInput!);
  if(number != null){
    print(number);
  }else{
    print(number);
  }
}