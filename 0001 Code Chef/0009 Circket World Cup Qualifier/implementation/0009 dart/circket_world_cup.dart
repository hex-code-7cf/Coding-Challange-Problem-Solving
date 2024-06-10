import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  int? score = int.tryParse(stringInput!);
  if(score != null){
    if(score >= 12){
      print("YES");
    }else{
      print("NO");
    }
  }
}