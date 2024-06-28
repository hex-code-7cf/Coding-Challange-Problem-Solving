import 'dart:io';


void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    int? test = int.tryParse(stringInput);
    if(test != null){
      int count = test;
      while(count > 0){
        String? stringInput = stdin.readLineSync();
        if(stringInput != null){
          int? rank = int.tryParse(stringInput);
          if(rank != null){
            if(rank <= 10 && rank >= 1){
              print("YES");
            }else{
              print("NO");
            }
          }
        }
        count = count - 1;
      }
    }
  }
}