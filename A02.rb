# n = gets.chomp.to_i
# x = gets.chomp.to_i
# numbers = []
# ans = false
# i = 0
# j = 0

# while i < n do
#     numbers[i] = gets.chomp.to_i
#     i += 1
# end


# while i < j do
#     if numbers[j] == x
#         ans = true
#         break
#     end
#     j += 1
# end

# if ans
#     puts "Yes"
# else
#     puts "No"
# end
        
n,x = gets.split.map(&:to_i)
a = gets.split.map(&:to_i)

puts a.include?(x)?"Yes":"No"