stringInput = gets.chomp;
stringArray = stringInput.split(" ");
x = Integer(stringArray[0]);
y = Integer(stringArray[1]);
sumof = x + y 
if(sumof > 6)
    puts "YES"
else
    puts "NO"
end