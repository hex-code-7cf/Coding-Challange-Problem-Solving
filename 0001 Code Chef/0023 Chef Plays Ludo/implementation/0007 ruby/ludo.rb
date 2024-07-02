test = gets.chomp.to_i
while(test > 0) do
    x = gets.chomp.to_i
    if(x == 6) 
        puts "YES"
    else
        puts "NO"
    end
    test = test - 1
end