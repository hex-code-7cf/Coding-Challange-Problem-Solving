if __name__ == "__main__":
    test = int(input())
    while(test >0):
        string_input = input()
        string_array = string_input.split(" ")
        x = int(string_array[0]);
        y = int(string_array[1]);
        total = x * y
        print(total)
        test = test - 1;