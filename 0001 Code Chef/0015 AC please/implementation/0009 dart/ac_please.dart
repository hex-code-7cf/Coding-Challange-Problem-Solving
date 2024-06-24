import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    int? temperature = int.tryParse(stringInput!);
    if(temperature != null){
      if(temperature > 30){
        print("YES");
      }else{
        print("NO");
      }
    }else{
      print("Invlid input");
    }
  }else{
    print("Invalid input");
 }
}