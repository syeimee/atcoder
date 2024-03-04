n , k = gets.split.map(&:to_i)
result = 0


i = 1
while i <= n do
    j = 1
    while j <= n do
        a = i + j
        if k - a <= n && k - a > 0
            result += 1
        end
        j += 1
    end
    i += 1
end


puts result