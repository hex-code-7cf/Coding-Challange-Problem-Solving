test = tonumber(io.read())
while(test > 0)do
    string_input = io.read()
    string_array = {}
    index = 1;
    for i in string.gmatch(string_input,"%S+") do
        string_array[index] = i
        index = index + 1;
    end
    a = tonumber(string_array[1]);
    b = tonumber(string_array[2]);
    if(a > b) then
        print(b)
    else
        print(a)
    end
    test = test - 1;
end