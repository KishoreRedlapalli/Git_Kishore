__author__ = 'kredlapa'
def charcount(filename):
    return len(open(filename).read())

def wrdcount(filename):
    return len(open(filename).read().split())


def linecount(filename):
    return len(open(filename).read().splitlines())

f = open("C:\\tmp\\sketch.txt", "rb")
print charcount("C:\\tmp\\sketch.txt")
print wrdcount("C:\\tmp\\sketch.txt")
print linecount("C:\\tmp\\sketch.txt")
#for tmp in f.readline():
#    print tmp

