#include <iostream>

int main(){
    int test;
    std::cin >> test;
    while(test > 0){
        int a,b;
        std::cin >> a >> b;
        if(a > b){
            std::cout << b << std::endl;
        }else{
            std::cout << a << std::endl;
        }
        test = test - 1;
    }
    return 0;
}