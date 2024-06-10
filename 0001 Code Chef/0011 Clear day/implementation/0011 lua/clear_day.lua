local stringInput = io.read()
local stringArray = {};
local count = 1

for i in string.gmatch(stringInput,"%S+") do
    stringArray[count] = i 
    count = count + 1
end

local rainy = tonumber(stringArray[1]);
local cloudy = tonumber(stringArray[2]);
local clear = 7 - (rainy + cloudy)
print(clear)
