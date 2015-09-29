import os
if not os.path.exists('test.txt'):
    with open('test.txt','wb') as f:
        f.write('\nbla bla\n')
        print "in if"
else:
    with open('test.txt','ab') as f:
        f.write("\r\nbla bla")
        print "in else"

