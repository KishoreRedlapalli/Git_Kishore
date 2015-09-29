__author__ = 'KishoreRP'
def main():
    lists_test()

def lists_test():
    input_tmp = int(raw_input().strip())

    list_tmp = []

    for t in range(input_tmp):
        args = raw_input().strip().split(" ")
        if args[0] == "append":
            list_tmp.append(int(args[1]))
        elif args[0] == "insert":
            list_tmp.insert(int(args[1]), int(args[2]))
        elif args[0] == "remove":
            list_tmp.remove(int(args[1]))
        elif args[0] == "pop":
            list_tmp.pop()
        elif args[0] == "sort":
            list_tmp.sort()
        elif args[0] == "reverse":
            list_tmp.reverse()
        elif args[0] == "print":
            print list_tmp

if __name__=="__main__":main()

