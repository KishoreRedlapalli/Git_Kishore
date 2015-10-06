from xml.etree.ElementTree import iterparse

def main():
    print "in main"

def parse_and_remove(filename,path):
    path_parts=path.split('/')
    print 'path_parts is ' + str(path_parts)
    doc=iterparse(filename,(start,end))
    next(doc)
    tag_stack=[]
    elem_stack=[]
    for event,elem in doc:
        if event=='start':
            tag_stack.append(elem.tag)
            elem_stack.append(elem)
        elif event=='end':
            if tag_stack==path_parts:
                yield elem
                elem_stack[-2].remove(elem)
            try:
                tag_stack.pop
                elem_stack.pop
            except IndexError:
                pass


if __name__=="__main__":main()
