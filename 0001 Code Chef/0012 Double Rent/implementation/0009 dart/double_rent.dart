import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput!= null){
    int? rent = int.tryParse(stringInput!);
    if(rent != null){
      print(rent*2);
    }

  }

}