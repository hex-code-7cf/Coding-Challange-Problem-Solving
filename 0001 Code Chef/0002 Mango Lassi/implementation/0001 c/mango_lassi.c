#include <stdio.h>


int main(){
    int temperature;
    scanf("%d",&temperature);
    if(temperature > 35){
        printf("YES\n");
    }else{
        printf("NO\n");
    }
    return 0;
}