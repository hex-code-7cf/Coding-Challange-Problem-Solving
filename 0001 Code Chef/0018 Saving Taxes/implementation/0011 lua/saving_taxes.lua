test = tonumber(io.read())

while(test > 0) do
    string_input = io.read()
    string_array = {}
    index = 1
    for i in string.gmatch(string_input,"%S+") do
        string_array[index] = i
        index = index + 1
    end

    x = tonumber(string_array[1])
    y = tonumber(string_array[2])

    if(x > y) then
        print(x-y)
    else
        print(0)
    end

    test = test - 1
end