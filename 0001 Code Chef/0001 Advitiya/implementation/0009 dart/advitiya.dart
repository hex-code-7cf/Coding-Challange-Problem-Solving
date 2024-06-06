import 'dart:io';


void main(){
    String? stringInput = stdin.readLineSync();
    int ? day = int.tryParse(stringInput!);
    if(day != null){
        if(day == 17 || day == 18 || day == 19){
          print("ADVITIYA");
        }else{
          print("WAITING FOR ADVITIYA");
        }
    }else{
      print("Input is null");
    }
}