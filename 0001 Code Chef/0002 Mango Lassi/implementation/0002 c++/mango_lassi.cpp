#include <iostream>


int main(){
    int temperature;
    std::cin >> temperature;
    if(temperature > 35){
        std::cout << "YES" << std::endl;
    }else{
        std::cout << "NO" << std::endl;
    }
    return 0;
}