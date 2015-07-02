# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

def isDivisibileByAll?(num)
	(11..20).each { |i| return false if num % i != 0 }
	return true
end

num = 20 * 2 
while true
	break if isDivisibileByAll?(num)
	num+=20
end

puts num