__author__ = 'kredlapa'
class Car:
    def __init__(self,make,model,year):
        self.make=make
        self.model=model
        self.year=year

    def get_make(self):
        return self.make
    def get_model(self):
        return self.model
    def get_year(self):
        return self.year

def main():
    car=Car('audi','t8','2010')
    car2=Car('audi1','t9','2011')

    for c in Car:
        print c.year;



if __name__ == "__main__":main()