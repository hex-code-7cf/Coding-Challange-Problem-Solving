import 'dart:io';

void main(){
  String? stringInput = stdin.readLineSync();
  if(stringInput != null){
    List<String>? stringArray = stringInput.split(" ");
    if(stringArray != null && stringArray.length == 2){
      int? total = int.tryParse(stringArray[0]);
      int? attempted = int.tryParse(stringArray[1]);
      if(total != null && attempted != null){
        int unattempted = total - attempted;
        print(unattempted);
      }
    }
  }
}