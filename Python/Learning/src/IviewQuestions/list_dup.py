my_list=[1,2,2,3,5,6,3,4,4,4,6,7,8,9,10]
my_list.sort()
for i in range(0,len(my_list)-1):
    if my_list[i]==my_list[i+1]:
        print str(my_list[i]) + 'is a duplicate'