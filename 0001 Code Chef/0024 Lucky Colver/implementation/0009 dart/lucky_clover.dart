import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    int? n = int.tryParse(stringInput);
    if(n != null){
      int total = 4 + 3*(n-1);
      print(total);
    }
  }
}