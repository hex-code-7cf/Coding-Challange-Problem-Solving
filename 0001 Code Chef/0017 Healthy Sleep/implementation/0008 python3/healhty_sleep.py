#!/bin/python3

if __name__ == "__main__":
    sleep = int(input())

    if(sleep == 8):
        print("PERFECT")
    elif(sleep < 8):
        print("LESS")
    elif(sleep > 8):
        print("MORE")
    else:
        print("INVALID INPUT")

