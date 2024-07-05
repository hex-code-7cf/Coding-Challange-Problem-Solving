if __name__ == "__main__":
    string_input = input()
    string_array = string_input.split(" ")
    total = int(string_array[0])
    attempted = int(string_array[1])
    unattempted = total - attempted
    print(unattempted)