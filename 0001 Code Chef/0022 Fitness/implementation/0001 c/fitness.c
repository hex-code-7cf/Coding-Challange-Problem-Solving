#include <stdio.h>

int main(){
    int test;
    scanf("%d",&test);
    while(test > 0){
        int x;
        scanf("%d",&x);
        int distance_walk_per_day = 2*x;
        int distance_walk_per_week = 5 * distance_walk_per_day;
        printf("%d\n",distance_walk_per_week);
        test = test - 1;
    }
    return 0;
}