test = gets.chomp.to_i
while(test > 0) do
    string_input = gets.chomp
    string_array = string_input.split(" ")
    a = string_array[0].to_i
    b = string_array[0].to_i
    if(a > b)
        puts b
    else
        puts a
    end
    test = test - 1
end