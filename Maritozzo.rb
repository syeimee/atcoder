s = []
s[1] = gets.chomp.to_s
s[2]= gets.chomp.to_s
s[3] = gets.chomp.to_s
numbers = gets.chomp.chars.map(&:to_i) 

result = []

numbers.each do |number|
    result << s[number]
end


print result.join("")

