string_input = io.read()
string_array = {}
count = 1

for i in string.gmatch(string_input,"%S+") do
    string_array[count] = i 
    count = count + 1
end

x = tonumber(string_array[1])
y = tonumber(string_array[2])

if(x >= 2*y) then
    print("YES")
else
    print("NO")
end
