if __name__ == "__main__":
    test = int(input())
    while(test > 0):
        string_input = input()
        string_array = string_input.split(" ")
        a = int(string_array[0])
        b = int(string_array[1])
        if(a > b):
            print(b)
        else:
            print(a)
        test = test - 1;
