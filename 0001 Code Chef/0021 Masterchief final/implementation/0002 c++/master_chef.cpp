#include <iostream>

int main(){
    int test = 0;
    std::cin >> test;
    while(test > 0){
        int rank;
        std::cin >> rank;
        if(rank <= 10){
            std::cout << "YES" << std::endl;
        }else{
            std::cout << "NO" << std::endl;
        }
        test = test - 1;
    }
    return 0;
}