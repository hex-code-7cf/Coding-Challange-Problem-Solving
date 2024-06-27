#include <stdio.h>

int main(){
    int test;
    scanf("%d",&test);
    while(test > 0){
        int x,y;
        scanf("%d %d",&x,&y);
        if(x > y){
            printf("%d\n",x-y);
        }else{
            printf("%d\n",0);
        }
        test = test - 1;
    }
    return 0;
}