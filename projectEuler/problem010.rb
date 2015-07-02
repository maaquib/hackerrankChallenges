# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

# Find the sum of all the primes below two million.

def prime?(n)
	return false if n < 2
	2.upto(Math.sqrt(n)).none? { |i| n % i == 0 }
end

sum = 2
(3..2_000_000).each do |num|
	sum+=num if prime?(num)
end

puts sum