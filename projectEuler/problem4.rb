# A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

# Find the largest palindrome made from the product of two 3-digit numbers.

def palindrome?(str)
  str == str.reverse
end

max = 0
(100..999).each do |first|
	(100..999).each do |second|
		max = first * second if palindrome?((first * second).to_s) && first * second > max
	end
end
puts max