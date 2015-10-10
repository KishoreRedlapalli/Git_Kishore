__author__ = 'KishoreRP'
class Person:
    def __init__(self,name,job=None,pay=0):
        self.name=name
        self.job=job
        self.pay=pay
    def lastname(self):
        return self.name.split()[-1]
    def __str__(self):
        return'[Person:%s, %s, %s]'%(self.name,self.pay,self.job)

class Manager(Person):
     def __init__(self,name,pay):
         Person.__init__(self,name,'mgr',pay)

def main():
    bob=Person('bob smith')
    sue=Person('Sue Jones',job='dev',pay=1000)
    print(bob)
    print(sue)
    #print(bob.name,bob.job)
    #print(sue.name,sue.job)
    #print(bob.lastname())
    #print(sue.lastname())
    tom=Manager('Thomas Jony',10000)
    tom.lastname()
    print(tom)

if __name__ == "__main__":main()

