cases = gets.chomp.to_i
cases.times do
	numUpto = gets.chomp.to_i
	a, b, sum = 1, 2, 0
	while b < numUpto
		sum += b if b.even?
		a, b = b, a + b
	end
	puts sum
end