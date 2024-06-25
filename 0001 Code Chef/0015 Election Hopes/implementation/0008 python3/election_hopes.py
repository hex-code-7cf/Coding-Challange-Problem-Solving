#!/bin/python3


if __name__ == "__main__":
    string_input = input()
    string_array = string_input.split(" ")
    x = int(string_array[0])
    y = int(string_array[1])

    if(x >= 2*y):
        print("YES")
    else:
        print("NO")