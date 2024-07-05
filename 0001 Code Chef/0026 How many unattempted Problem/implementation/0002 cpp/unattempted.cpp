#include <iostream>

int main(){
    int total,attempted,unattempted;
    std::cin >> total >> attempted;
    unattempted = total - attempted;
    std::cout << unattempted << std::endl;
    return 0;
}