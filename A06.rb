N, Q = gets.chomp.split.map(&:to_i)
A = gets.chomp.split.map(&:to_i)
LR = Q.times.map { gets.split.map(&:to_i) }

sum= []
sum[0] = 0
A.each_with_index do |a, i|
    sum[i+1] = sum[i] + a
end

LR.each do |lr|
    l,r = lr
    puts (sum[r] - sum[l-1])
end