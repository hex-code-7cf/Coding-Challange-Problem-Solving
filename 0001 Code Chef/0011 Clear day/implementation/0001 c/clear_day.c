#include <stdio.h>
#include <stdlib.h>

int main() {
    char input_array[5];
    int clear, x, y;

    // Get user input as string
    fgets(input_array, sizeof(input_array), stdin);

    int input[2];
    int i = 0, j = 0;

    // spliting string by ' ' 
    while(input_array[i] != '\0'){
        if(input_array[i] == ' ' || input_array[i] == '\n'){
            i = i + 1;
            continue;
        }else{
            input[j] = (int) input_array[i] - '0';
            j = j + 1;
        }
        i = i + 1;
    }


    clear = 7 - (input[0] + input[1]);
    printf("%d\n",clear);

    return 0;
}
