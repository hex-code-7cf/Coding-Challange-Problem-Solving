test = tonumber(io.read())

while(test > 0) do
    water = tonumber(io.read())
    if(water >= 2000) then
        print("YES")
    else
        print("NO")
    end
    test = test - 1
end