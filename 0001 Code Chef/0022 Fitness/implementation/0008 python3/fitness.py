if __name__ == "__main__":
    test  = int(input())
    while(test > 0):
        distance = int(input())
        distance_walk_per_day = 2*distance
        distance_walk_per_week = 5 * distance_walk_per_day
        print(distance_walk_per_week)
        test = test - 1