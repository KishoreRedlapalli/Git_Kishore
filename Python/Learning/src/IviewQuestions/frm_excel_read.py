from xlrd import open_workbook
import csv
global count
count=0

with open('C:\\pylearn\\test.csv','rt',encoding='UTF-8') as f:
    reader=csv.reader(f)
    for row in reader:
        print ("\nrow number: "+ str(count) +" is \n")
        print (row)
        count=count+1
        if (count > 0):
            print "in if"
            
        
        
        
        
        
    

    
    