my_list = [1,2,2,3,5,6,3,4,4,4,6,7,8,9,10,4]
my_list.sort()
uniq_elem = []
print my_list

for i in range(0, len(my_list)-1):
    if my_list[i] != my_list[i+1]:
        uniq_elem.append(my_list[i])

print uniq_elem