
if __name__ == "__main__":
    test = int(input())
    while(test > 0):
        string_input = input()
        string_array = string_input.split(" ");
        x = int(string_array[0]);
        y = int(string_array[1]);
        if(x > y):
            print(x-y)
        else:
            print(0)
        test = test - 1