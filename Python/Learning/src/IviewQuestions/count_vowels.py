
def main():
    print "in main"
    inpt=raw_input("Please enter the string\t")
    counts={i:0 for i in 'aeiouAEIOU'}
    for char in inpt:
        if char in counts:
            counts[char]+=1;
    for key,value in counts.items():
        print(key,value)

if __name__=="__main__":main()
