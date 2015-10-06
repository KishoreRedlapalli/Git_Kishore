import odbchelper

def main():
    params={"server":"mpilgrim", "database":"master", "uid":"sa", "pwd":"secret"}
    print odbchelper.buildConnectionString(params)
    print odbchelper.buildConnectionString.__doc__

if __name__ == "__main__":main()