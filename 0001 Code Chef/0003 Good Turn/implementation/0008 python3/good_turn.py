if __name__ == "__main__":
    string_input = input();
    string_array = string_input.split(" ")
    x = int(string_array[0]);
    y = int(string_array[1]);
    sumof = x + y
    if(sumof > 6):
        print("YES")
    else:
        print("NO")