def sum (num, div)
	return div * (num/div * (num/div + 1)) / 2
end

cases = gets.chomp.to_i
cases.times do
	numUpto = gets.chomp.to_i
	puts sum((numUpto-1), 5) + sum((numUpto-1), 3) - sum((numUpto-1), 15)
end