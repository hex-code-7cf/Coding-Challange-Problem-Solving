import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  int? temperature = int.tryParse(stringInput!);

  if(temperature != null){
    if(temperature > 35){
      print("YES");
    }else{
      print("NO");
    }
  }
}