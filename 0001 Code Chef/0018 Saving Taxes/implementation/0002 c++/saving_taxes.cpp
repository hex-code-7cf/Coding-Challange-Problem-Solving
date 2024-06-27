#include <iostream>

int main(){
    int test;
    std::cin >> test;
    while(test > 0){
        int x,y;
        std::cin >> x >> y;
        if(x > y){
            std::cout << x-y << std::endl;
        }else{
            std::cout << 0 << std::endl;
        }
        test = test -1;
    }
    return 0;
}