string_input = gets.chomp
string_array = string_input.split(" ")
total = string_array[0].to_i
attempted= string_array[1].to_i
unattempted = total - attempted
puts unattempted
