# The prime factors of 13195 are 5, 7, 13 and 29.

# What is the largest prime factor of the number 600851475143 ?

i = 2
num = gets.chomp.to_i
while i * i < num
	break if num == 1
    while num%i == 0
        num = num / i
    end
    i += 1
end
puts num