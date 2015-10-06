__author__ = 'KishoreRP'
# Enter your code here. Read input from STDIN. Print output to STDOUT
def main():
    a=int(raw_input())
    b=int(raw_input())
    divint(a,b)
    divflt(a,b)

def divint(a,b):
    print a/b
def divflt(a,b):
    print (float(a)/float(b))



if __name__=="__main__":main()