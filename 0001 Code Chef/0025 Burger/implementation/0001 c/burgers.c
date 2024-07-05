#include <stdio.h>

int main(){
    int test;
    scanf("%d",&test);
    while(test > 0){
        int a,b;
        scanf("%d %d",&a,&b);
        if(a > b){
            printf("%d\n",b);
        }else{
            printf("%d\n",a);
        }

        test = test - 1;
    }
    return 0;
}