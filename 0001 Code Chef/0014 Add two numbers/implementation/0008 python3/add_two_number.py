if __name__ == "__main__":
    string_input = input()
    test = int(string_input)
    while(test > 0):
        string_input = input()
        string_array = string_input.split(" ")
        x = int(string_array[0])
        y = int(string_array[1])
        print(x+y)
        test = test - 1