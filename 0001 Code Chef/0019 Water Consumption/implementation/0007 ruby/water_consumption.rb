test = gets.chomp.to_i
while(test > 0) do 
    water = gets.chomp.to_i
    if(water >= 200) 
        puts "YES";
    else
        puts "NO";
    end
    test = test - 1;
end