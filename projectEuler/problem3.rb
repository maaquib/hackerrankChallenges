cases = gets.chomp.to_i
cases.times do
	i = 2
	num = gets.chomp.to_i
	while i * i < num
	    while num%i == 0
	        num = num / i
	    end
	    i += 1
	end
	puts num
end