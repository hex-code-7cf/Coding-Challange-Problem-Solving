local string_input = io.read();
local string_array = {}
local index = 1
for i in string.gmatch(string_input,"%S+") do
    string_array[index] = i 
    index = index + 1
end

local total = tonumber(string_array[1])
local attempted = tonumber(string_array[2])
local unattempted = total - attempted
print(unattempted)