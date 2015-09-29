__author__ = 'KishoreRP'
# Enter your code here. Read input from STDIN. Print output to STDOUT
def main():
    a=int(raw_input())
    b=int(raw_input())
    add(a,b)
    subtract(a,b)
    mult(a,b)
def add(a,b):
    print a+b
def subtract(a,b):
    print a-b
def mult(a,b):
    print a*b


if __name__=="__main__":main()