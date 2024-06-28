#include <stdio.h>

int main(){
    int test;
    scanf("%d",&test);
    while(test > 0){
        int water;
        scanf("%d",&water);
        if(water >= 2000){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
        test = test - 1;
    }
    return 0;
}