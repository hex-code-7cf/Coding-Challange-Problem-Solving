#include <stdio.h>

int main(){
    int test;
    scanf("%d",&test);
    while(test > 0){
        int x,y,total;
        scanf("%d %d",&x,&y);
        total = x * y;
        printf("%d\n",total); 
        test = test -1;
    }
    return 0;
}