#include <stdio.h>

int main(){
    int minimum_wage,input_wage;
    minimum_wage = 11;
    scanf("%d",&input_wage);
    if(input_wage > minimum_wage){
        printf("YES\n");
    }else{
        printf("NO\n");
    }
    return 0;
}