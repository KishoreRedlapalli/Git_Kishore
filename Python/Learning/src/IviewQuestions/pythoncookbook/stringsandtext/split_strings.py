import re
def main():
    split_strings()
def split_strings():
    '''You need to split a string into fields, but the delimiters (and spacing around them) aren?t consistent throughout the string'''
    line="asdf fjdk; afed, fjek,asdf,  foo"    
    #print re.split(r'[;,\s]\s*', line) #delimiter being a ,; or whitespace followed by any amount of extra whitespace, not the use of square brackets
    #print re.split(r'[;,\s]\s', line) #delimiter being a ,; or whitespace followed by one whitespace
    #print re.split(r'[;,\s]\s\s', line) #delimiter being a ,; or whitespace followed by two whitespace

    print re.split(r'(;|,|\s)\s*', line)
    name1="kishore"
    print re.match(r'\w[a-z][a-z]',name1)
    print re.split(r'\w[a-z][a-z]',name1)


if __name__ == "__main__":main()