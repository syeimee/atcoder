# ABC 086A -Product
# https://qiita.com/drken/items/fd4e5e3630d0f5859067#5-%E9%81%8E%E5%8E%BB%E5%95%8F%E7%B2%BE%E9%81%B8-10-%E5%95%8F

a = gets.to_i
b = gets.to_i

product = a * b 

result = product % 2 == 0 ? "Even":"Odd"

puts result
