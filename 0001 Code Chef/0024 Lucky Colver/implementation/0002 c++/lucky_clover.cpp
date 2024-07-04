#include <iostream>

int main(){
    int n,total_leaves;

    std::cin >> n;
    total_leaves = 4 + 3*(n-1);
    std::cout << total_leaves << std::endl;
    return 0;
}