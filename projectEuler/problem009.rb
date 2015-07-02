# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

# a2 + b2 = c2
# For example, 32 + 42 = 9 + 16 = 25 = 52.

# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.

def pythagorean?(a, b, c)
	return a**2 + b**2 == c**2
end

sum = 1000
(1..sum - 2).each do |a|
	(a..sum - 1).each do |b|
		c = sum - a - b
		puts a*b*c if c > a && c > b && pythagorean?(a, b, c)
	end
end