#include <iostream>

int main(){
    int x,y,sumof;
    std::cin >> x >> y;
    sumof = x + y;
    if(sumof > 6){
        std::cout << "YES" << std::endl;
    }else{
        std::cout << "NO" << std::endl;
    }
    return 0;
}