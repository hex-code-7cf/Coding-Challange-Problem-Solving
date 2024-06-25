import 'dart:io';


void main(){
    int minimumWage = 11;
    String? stringInput = stdin.readLineSync();
    if(stringInput != null){
      int? inputWage = int.tryParse(stringInput);
      if(inputWage != null){
        if(inputWage > minimumWage){
          print("YES");
        }else{
          print("NO");
        }
      }
    }
}