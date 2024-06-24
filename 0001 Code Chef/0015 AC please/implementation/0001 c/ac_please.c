#include <stdio.h>

int main(){
    int temperature = 0;
    scanf("%d",&temperature);
    if(temperature > 30){
        printf("YES\n");
    }else{
        printf("NO\n");
    }
    return 0;
}