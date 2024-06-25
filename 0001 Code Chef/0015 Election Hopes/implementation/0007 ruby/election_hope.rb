stringInput = gets.chomp
stringArray = stringInput.split(" ");
x = stringArray[0].to_i
y = stringArray[1].to_i

if(x >= 2*y)
    puts "YES"
else
    puts "NO"
end