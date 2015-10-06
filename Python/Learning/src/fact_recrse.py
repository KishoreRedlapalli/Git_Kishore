def recur_fact(n):
    if n==1:
        return n
    else:
        return n*recur_fact(n-1)
num=int(input("Enter a number \n"))
fact=1
if num<0:
    print "Sorry negative number"
    exit(1)
elif (num == 0):
    print "factorial of zero is 1"
    exit (0)
else:
    print "factorial of " + str(num) +" is " + str(recur_fact(num))