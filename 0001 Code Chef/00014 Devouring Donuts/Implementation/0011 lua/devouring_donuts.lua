stringInput = io.read()
stringArray = {}
count = 1
for i in string.gmatch(stringInput,"%S+") do
    stringArray[count] = i
    count = count + 1
end

x = tonumber(stringArray[1])
y = tonumber(stringArray[2])
result = x * y
print(result)