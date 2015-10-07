import sys
def main():
    li=["a","b","my example with blanks","with special chars"]
    print "whole list"
    print li
    print li[0] #first element
    print li[1] #2nd element
    print li[-1] #last element
    print li[-2] #last element -1
    print li[55] #exception, list index out of range

if __name__ == "__main__":main()