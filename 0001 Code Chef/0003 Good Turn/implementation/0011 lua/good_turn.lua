local string_input = io.read()
local count = 1
local string_array = {}
for i in string.gmatch(string_input,"%S+") do
    string_array[count] = i 
    count = count + 1
end

local x = tonumber(string_array[1])
local y = tonumber(string_array[2])
local output = x + y 
if(output > 6) then
    print("YES")
else
    print("NO")
end

