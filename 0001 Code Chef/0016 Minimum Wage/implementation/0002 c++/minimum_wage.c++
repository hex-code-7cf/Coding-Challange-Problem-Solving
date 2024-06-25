#include <iostream> 
int main(){
    int minimum_wage,input_wage;
    minimum_wage = 11;
    std::cin >> input_wage;
    if(input_wage > minimum_wage){
        std::cout << "YES" << std::endl;
    }else{
        std::cout << "NO" << std::endl;
    }
    return 0;
}