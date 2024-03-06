D = gets.to_i
N = gets.to_i
change = Array.new(D+1, 0) 

i = 0
while i < N
    l,r = gets.split.map(&:to_i)
    change[l] +=1
    change[r+1] -=1  #範囲重複分の調整
    i += 1
end

sum = []
tmp = 0
change.each do |delta|
  tmp += delta
  sum << tmp
end

puts sum[1..-1].join("\n")


# なぜREなんでしょう？