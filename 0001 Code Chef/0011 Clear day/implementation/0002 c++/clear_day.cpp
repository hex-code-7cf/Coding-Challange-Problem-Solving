#include <iostream>
#include <string>

int main(){
    std::string string_input;
    std::getline(std::cin,string_input);

    int i = 0, j = 0, inputs[2];
    while(string_input[i] != '\0'){
        if(string_input[i] != ' ' || string_input[i] != '\n'){
            inputs[j] =  string_input[i] - '0';
            std::cout << inputs[j] << std::endl;
            j = j + 1;
        }
        i = i + 1;
    }


    int clear = 7 - (inputs[i] + inputs[j]);
    std::cout << clear << std::endl;

    return 0;
}