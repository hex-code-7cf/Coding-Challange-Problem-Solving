#include <iostream>

int main(){
    int x,y;
    std::cin >> x >> y;
    if(x >= y*2){
        std::cout << "YES" << std::endl;
    }else{
        std::cout << "NO" << std::endl;
    }
    return 0;
}