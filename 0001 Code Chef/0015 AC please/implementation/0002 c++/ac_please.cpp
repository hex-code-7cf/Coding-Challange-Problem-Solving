#include <iostream>

int main(){
    int temperature = 0;
    std::cin >> temperature;
    if(temperature > 30){
        std::cout << "YES" << std::endl;
    }else{
        std::cout << "NO" << std::endl;
    }
    return 0;
}