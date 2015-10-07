import os
import sys
import re
import urllib2
import time
import pywin
import win32api
#from validate_email import validate_email #doesn't check for occurence of a . after @, cant use since it needs to be installed explicitly on all test machines,# fail!!

def validateUNCPath():
    print "inside validateUNCPath method"
    cntr=0
    uncFlag=0

    try:
        for x in xrange(10):
                if os.path.exists("\\\\perflab-blr.amd.com\\PerformanceLab"):
                    cntr+=1
                    time.sleep(5)
                    print "after sleep"

        '''if cntr>1:
            uncFlag=0
            print "Successful Tries being "+str(cntr)+ " , returning " +str(uncFlag)
            return uncFlag
        else:
            uncFlag=1
            print "Successful Tries being "+str(cntr)+ " , returning " + str(uncFlag)
            return uncFlag   '''
    except Exception as ee:
        uncFlag=1
        print "\n In Exception of validateUNCPath, returning  "+ str(uncFlag)+ " exception message being "+str(ee.args)
        return uncFlag

def validateEmail(emailAddr):
    #method to validate an email Address
    if emailAddr.strip():
        if not re.match(r"^[A-Za-z0-9\.\+_-]+@[A-Za-z0-9\._-]+\.[a-zA-Z]*$",emailAddr.strip()):
            print str(emailAddr)+" is an InCorrectEmailAddress"
            return 1
        else:
            print str(emailAddr)+" is a valid email address"
            return 0
    else:
            print "Empty Email Address passed"    
            return 1
            
def main():
    print "inside main"
    validateUNCPath() 
    use="Usage: %prog [-i1 | --input1] <inputdirname1> [-i2 | --input2] <outputexcelfilename>"
    
    parser = OptionParser(usage = use, version="%prog 1.0.0")
    parser.add_option("-i", "--input", dest="inputdir", action="store", type="string", help="Directory which has the list of input files to be processed", metavar="inputdir")
    parser.add_option("-o", "--output", dest="outputfile", action="store", type="string", help="mention Output Excel file name, can include path", metavar="outputexcelfilename")
    options, args = parser.parse_args()
    if not options.inputdir or options.inputdir == "": 
        parser.error("option --Input needs to be set to a directory that contains list of input files corresponding to valid xml report file of BasemarkCL ")
        exit
    if not options.outputfile or options.outputfile == "": 
        print "option --Output file and directory not specified. default file being created with file format - 'BasemarkCL_'+str(platform.node())+'_'+str(date.today())+'.xls'"
        finalOutputXls = 'BasemarkCL_'+str(platform.node())+'_'+str(date.today())+'.xls'
    else:
        finalOutputXls = options.outputfile
    # Check sanity of input directory
    if not os.path.isdir(options.inputdir):
        parser.error(options.inputdir + " is not found, please reenter")
        exit
    
    print "Done!!"


if __name__ == "__main__": main()
    