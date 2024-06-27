test = gets.chomp.to_i

while(test > 0) do
    string_input = gets.chomp
    string_array = string_input.split(" ");
    x = string_array[0].to_i
    y = string_array[1].to_i
    if(x > y)
        puts x -y
    else
        puts 0
    end
    test = test - 1
end