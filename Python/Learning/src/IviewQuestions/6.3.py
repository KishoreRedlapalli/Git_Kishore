#from urllib.request import urlopen
import urllib
from xml.etree.ElementTree import parse

u=urllib.urlopen('http://planet.python.org/rss20.xml')
doc=parse(u)

'''for item in doc.iterfind('channel/item'):
    
    title=item.findtext('title')
    date=item.findtext('date')
    link=item.findtext('item')

    #print title
    #print date
    #print link'''

for item in doc.find('channel'):
    title=item.findtext('title')
    date=item.findtext('date')
    link=item.findtext('item')

    print title
    print date
    print link



    
    