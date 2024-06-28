if __name__ == "__main__":
    test = int(input())
    while(test > 0):
        water = int(input())
        if(water >= 2000):
            print("YES")
        else:
            print("NO")
        test = test - 1;