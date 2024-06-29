#include <stdio.h>

int main(){
    int test = 0;
    scanf("%d",&test);
    while(test > 0){
        int rank;
        scanf("%d",&rank);
        if(rank <= 10){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
        test = test - 1;
    }
    return 0;
}