#include <iostream>

int main(){
    int test;
    std::cin >> test;
    while(test > 0){
        int x;
        scanf("%d",&x);
        int distance_walk_per_day = 2*x;
        int distance_walk_per_week = 5 * distance_walk_per_day;
        std::cout << distance_walk_per_week << std::endl;
        test = test - 1;
    }

    return 0;
}