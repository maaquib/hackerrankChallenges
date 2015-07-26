def main():
   n = int(input())
   k = int(input())
   A = []
   for i in range(0, n):
      A.append(int(input()))
   A.sort()
   weighted_sum = 0;
   normal_sum = 0
   for i in range(k - 1, -1, -1):
      xval = (2*i-k+1)
      weighted_sum += xval *  A[i]
      normal_sum += 2 * A[i]
   ans = weighted_sum
   for i in range(k, n):
      weighted_sum = weighted_sum + ((k - 1) * A[i]) + ((k + 1) * A[i - k]) - normal_sum
      ans = min(ans, weighted_sum)
      normal_sum = normal_sum + 2 * (A[i] - A[i-k])
   print (ans)

main()
