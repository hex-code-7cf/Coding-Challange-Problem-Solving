import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    List<String> stringArray = stringInput.split(" ");
    int? x = int.tryParse(stringArray[0]);
    int? y = int.tryParse(stringArray[1]);
    if(x != null && y != null){
      int sumof = x + y;
      if(sumof > 6){
        print("YES");
      }else{
        print("NO");
      }
    }


  }
}