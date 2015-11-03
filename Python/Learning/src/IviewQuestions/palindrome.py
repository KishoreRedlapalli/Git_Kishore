
def main():
    print "in main"
    inpt=raw_input("Enter the string which needs to be checked for palindrome \t ")
    l=len(inpt)
    list_inpt=list(inpt)
    print l
    for i in range(0,l):
        print list_inpt[i]
        print list_inpt[l-i-1]
        if(list_inpt[i]!=list_inpt[l-i-1]):
            print "not a palindrome"
            return False
    else:
        print "is a palindrome"
        return True



if __name__=="__main__":main()