#include <stdio.h>

int main(){
    int n;
    int total_leaves;

    scanf("%d",&n);
    total_leaves = 4 + 3*(n-1);
    printf("%d\n",total_leaves);
    return 0;
}