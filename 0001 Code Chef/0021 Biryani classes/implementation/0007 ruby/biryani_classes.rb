test = gets.chomp.to_i
while(test > 0) do
    stringInput = gets.chomp
    stringArray = stringInput.split(" ")
    x = stringArray[0].to_i
    y = stringArray[1].to_i
    total = x * y
    puts total
    test = test - 1
end
