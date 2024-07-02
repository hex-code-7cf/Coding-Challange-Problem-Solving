test = gets.chomp.to_i
while(test > 0) do
    distance = gets.chomp.to_i;
    distance_travel_per_day = 2 * distance;
    distance_travel_per_week = 5 * distance_travel_per_day;
    puts distance_travel_per_week
    test = test - 1;
end