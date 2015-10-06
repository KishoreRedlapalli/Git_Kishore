#result=""

def main():
    toberev="python is the best programming language"
    print reverse1(toberev)

def reverse1(s):
    print "in reverse"
    i=len(s)-1
    snew=''
    while i>=0:
        snew=snew+str(s[i])
        i=i-1
    return snew

if __name__=="__main__":main()


#using xrange
#for i in xrange(len(toberev)-1,-1,-1):
#    result+=toberev[i]
#print result

#normal way


