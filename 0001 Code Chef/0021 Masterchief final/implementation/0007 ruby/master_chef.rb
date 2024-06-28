test = gets.chomp.to_i
while(test > 0) do
    rank = gets.chomp.to_i
    if(rank >= 1 && rank <= 10)
        puts "YES"
    else
        puts "NO"
    end
    test = test - 1;
end