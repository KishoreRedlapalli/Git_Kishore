import os.path
import os
import argparse
import sys

def main():
    print "in main"
    prntdircntnts()

def prntdircntnts():
    print "prntdircntnts"
    #print sys.argv[1]
    try:
        #parser=argparse.ArgumentParser(description="blabla")
        #parser.add_argument("test")
        #parser.parse_args
        for root,dirs,files in os.walk("C:\\Kish\\Books"):
            for dirname in dirs:
                print os.path.join(root, dirname) 
            for filename in files:
                if filename.endswith(".txt"):
                    print os.path.join(root, filename)
                           
    except Exception,e:
        print str(e)

if __name__=="__main__":main()