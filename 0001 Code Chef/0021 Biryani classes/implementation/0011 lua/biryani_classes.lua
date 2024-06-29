test = tonumber(io.read())
while(test > 0) do
    string_input = io.read()
    string_array = {}
    count = 1;
    for i in string.gmatch(string_input,"%S+") do
        string_array[count] = i
        count = count + 1
    end

    x = tonumber(string_array[1]);
    y = tonumber(string_array[2]);
    total = x * y
    print(total)
    test = test - 1
end
