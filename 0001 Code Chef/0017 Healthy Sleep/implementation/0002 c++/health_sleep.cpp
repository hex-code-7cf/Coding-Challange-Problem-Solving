#include <iostream>

int main(){
    int sleep;
    std::cin >> sleep;
    if(sleep == 8){
        std::cout << "PERFECT" << std::endl;
    }else{
        if(sleep > 8){
            std::cout << "MORE" << std::endl;
        }else{
            std::cout << "LESS" << std::endl;
        }
    }
    return 0;
}