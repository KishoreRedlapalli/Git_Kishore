
def main():
    print "in main";
    #list_1=['hello','are','you','there','zz','sorting test']
    #print sorted(list_1)
    my_str=raw_input("Enter a string\t")
    words=my_str.split()

    print words.sort(reverse=True)

    for word in words:
        print word




if __name__=="__main__":main()
