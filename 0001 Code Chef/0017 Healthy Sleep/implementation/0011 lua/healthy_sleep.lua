sleep = tonumber(io.read())

if(sleep == 8) then
    print("PERFECT")
elseif(sleep < 8) then
    print("LESS")
elseif(sleep > 8) then
    print("MORE")
else
    print("INVALID INPUT");
end
