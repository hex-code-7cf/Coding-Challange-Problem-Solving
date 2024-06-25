sleep = gets.chomp.to_i

if (sleep == 8)
    puts "PERFECT"
elsif (sleep < 8)
    puts "LESS"
elsif (sleep > 8)
    puts "MORE"
else
    puts "INVALID INPUT";
end
