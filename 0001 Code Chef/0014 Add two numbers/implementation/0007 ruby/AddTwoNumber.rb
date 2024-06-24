stringInput = gets.chomp
test = stringInput.to_i
while(test > 0)
    stringInput = gets.chomp
    stringArray = stringInput.split(" ");
    x = stringArray[1].to_i
    y = stringArray[0].to_i
    puts (x+y)
    test = test - 1
end