test = tonumber(io.read())
while(test > 0) do
    rank = tonumber(io.read())
    if(rank >= 1 and rank <= 10) then
        print("YES")
    else
        print("NO")
    end
    test = test - 1
end