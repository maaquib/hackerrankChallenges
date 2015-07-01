# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

# Find the sum of all the multiples of 3 or 5 below 1000.

def sum (num, div)
	return div * (num/div * (num/div + 1)) / 2
end

numUpto = gets.chomp.to_i
puts sum((numUpto-1), 5) + sum((numUpto-1), 3) - sum((numUpto-1), 15)