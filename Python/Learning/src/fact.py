import sys
num=int(input("Enter a number \n"))
fact=1

if num<0:
    print "Sorry negative number"
    exit(1)
elif (num == 0):
    print "factorial of zero is 1"
    exit (0)
else:
    for i in range(1,num+1):
        fact=fact*i
    print "factorial of " + str(num) +" is " + str(fact)
