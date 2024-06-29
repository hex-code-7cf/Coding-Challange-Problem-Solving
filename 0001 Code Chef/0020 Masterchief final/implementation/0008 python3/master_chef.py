if __name__ == "__main__":
    test = int(input())
    while(test > 0):
        rank = int(input())
        if(rank <= 10 and rank >=1):
            print("YES")
        else:
            print("NO")
        test = test - 1;