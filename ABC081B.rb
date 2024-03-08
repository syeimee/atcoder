# https://qiita.com/drken/items/fd4e5e3630d0f5859067#5-%E9%81%8E%E5%8E%BB%E5%95%8F%E7%B2%BE%E9%81%B8-10-%E5%95%8F

N = gets.to_i
A = gets.split.map(&:to_i)

res = 0

# 操作が行える限り操作を繰り返す
loop do
    exist_odd = A.any? { |num| num.odd? }  # A[i]がすべて偶数かどうかを判定するフラグ

    break if exist_odd  # 奇数があればループを抜ける

    # 操作を行えるなら実際に操作を行う
    A.map! { |num| num / 2 }
    res += 1  
end

puts res