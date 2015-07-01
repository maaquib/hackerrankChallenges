# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

# What is the 10 001st prime number?

def prime?(n)
	return false if n < 2
	2.upto(Math.sqrt(n)).none? { |i| n % i == 0 }
end

i, num = 1, 1
while 10_001 > i
	num+=2
	i+=1 if prime?(num)
end

puts num