#include <stdio.h>

int main(){
    int sleep;
    scanf("%d",&sleep);
    if(sleep < 8){
        printf("LESS\n");
    }else{
        if(sleep > 8){
            printf("MORE\n");
        }else{
            printf("PERFECT\n");
        }
    }
    return 0;
}