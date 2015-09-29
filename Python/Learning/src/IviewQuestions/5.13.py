import os
def main():
    try:
        names=os.listdir("T:\\")
        print names
    except Exception,e:
        print str(e)




if __name__ == "__main__":main()