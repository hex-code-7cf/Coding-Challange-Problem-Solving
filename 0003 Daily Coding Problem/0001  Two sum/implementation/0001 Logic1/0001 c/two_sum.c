#include <stdio.h>

int main(){
    int k = 17;
    int list[] = {10,15,3,7};
    int flag = 1;
    int length = sizeof(list)/sizeof(list[0]);
    for(int i =0; i < length-1; i++){
        for(int j = i+1; i < length; j++){
            if(list[i] + list[j] == k){
                printf("%d %d\n",list[i],list[j]);
                flag = 0;
                break;
            }
        }
        if(flag == 0){
            break;
        }
    }
    return 0;
}