#include <iostream>

int main(){
    int t;
    std::cin >> t;
    while(t > 0){
        int x,y;
        std::cin >> x >> y;
        std::cout << (x + y) << std::endl;
        t = t - 1;
    }
    return 0;
}