#include <iostream>

int main(){
    int score;
    std::cin >> score;
    if(score >= 12){
        std::cout << "YES" << std::endl;
    }else{
        std::cout << "NO" << std::endl;
    }
    return 0;
}