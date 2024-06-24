import 'dart:io';

void main(){
  String? string_input = stdin.readLineSync();
  if(string_input != null){
    int? test = int.tryParse(string_input);
      while(test != null && test > 0){
        String? user_input = stdin.readLineSync();
        if(user_input != null){
          List<String> string_array = user_input.split(" ");
          int? x = int.tryParse(string_array[0]);
          int? y = int.tryParse(string_array[1]);
          if(x != null && y != null){
            print(x + y);
          }
        }
        test = test - 1;
    }
  }
}  