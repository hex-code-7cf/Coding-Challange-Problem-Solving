#include <stdio.h>
#include <string.h>

int main(){
    char message[10];
    fgets(message,sizeof(message),stdin);
    printf("%c\n",message[6]);
    return 0;
}