#include <stdio.h>

int main(){
    int x,y,sumof;
    scanf("%d %d",&x,&y);
    sumof = x + y;
    if(sumof > 6){
        printf("YES\n");
    }else{
        printf("NO\n");
   }
    return 0;
}