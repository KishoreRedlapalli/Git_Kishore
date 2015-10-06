import os,platform
os.getcwd()
sys_drv=os.getenv("SystemDrive")
print(sys_drv+"\n")
os.chdir(sys_drv+"\\pylearn\\")
data_file=open("sketch.txt","r+")

for each_line in data_file:
    print(each_line)
    data_file.write(each_line)
    
data_file.flush
data_file.close


    
    