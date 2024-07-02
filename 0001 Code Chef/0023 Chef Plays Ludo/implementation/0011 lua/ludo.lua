test = tonumber(io.read())
while(test > 0) do
    x = tonumber(io.read())
    if(x == 6) then
        print("YES")
    else
        print("NO")
    end
    test = test - 1
end