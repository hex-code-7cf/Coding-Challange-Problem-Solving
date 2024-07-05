#include <stdio.h>

int main(){
    int total,attempted,un_attempted;
    scanf("%d %d",&total,&attempted);
    un_attempted = total - attempted;
    printf("%d\n",un_attempted);
    return 0;
}