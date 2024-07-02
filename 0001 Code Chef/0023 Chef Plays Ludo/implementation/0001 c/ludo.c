#include <stdio.h>

int main(){
    int test;
    scanf("%d",&test);
    while(test > 0){
        int x;
        scanf("%d",&x);
        if(x == 6){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
        test = test - 1;
    }
    return 0;
}