import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  int? day = int.tryParse(stringInput!);
  if(day != null){
    if(day == 4){
      print("YES");
    }else{
      print("NO");
    }
  }
}