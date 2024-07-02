test = tonumber(io.read())
while(test > 0) do
    distance = tonumber(io.read())
    distance_walk_per_day = distance * 2
    distance_walk_per_week = distance_walk_per_day * 5
    print(distance_walk_per_week)
    test = test - 1
end