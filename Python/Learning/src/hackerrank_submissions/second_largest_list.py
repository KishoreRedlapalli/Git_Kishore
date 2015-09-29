__author__ = 'KishoreRP'
def main():
    lists_second_largest()

def lists_second_largest():
    n=int(raw_input())
    list1 = map(int, raw_input().split(" "))
    largest=len(list1)
    second_largest=len(list1)

    for i2 in list1:
        if i2>second_largest:
            second_largest=i2
        elif i2>largest:
            tmp=second_largest
            second_largest=largest
            largest=tmp

    print second_largest





if __name__=="__main__":main()
