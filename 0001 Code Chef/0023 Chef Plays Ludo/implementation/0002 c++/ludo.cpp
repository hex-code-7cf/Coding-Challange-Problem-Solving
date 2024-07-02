#include <iostream>

int main(){
    int test;
    std::cin >> test;
    while(test > 0){
        int x;
        std::cin >> x;
        if(x == 6){
            std::cout << "YES" << std::endl;
        }else{
            std::cout << "NO" << std::endl;
        }
        test = test - 1;
    }
    return 0;
}