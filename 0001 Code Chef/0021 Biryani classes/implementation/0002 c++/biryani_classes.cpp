#include <iostream>

int main(){
    int test;
    std::cin >> test;
    while(test > 0){
        int x,y,total;
        std::cin >> x >> y;
        total = x * y;
        std::cout << total << std::endl;
        test = test -1;
    }
    return 0;
}