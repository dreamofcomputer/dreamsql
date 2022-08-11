#print
print("dream python sql 1.0")
print("dreamofcomputer\n")
#start
sqllong=input("sqllong>")
print("")
sqlname="null"
sql=[None]*int(sqllong)
def write(sqlclass,sqlsj,sqlwn):
    sqlwn=sqlwn-1
    if sqlclass=="int":
        sql[sqlwn]=int(sqlsj)
    if sqlclass=="text":
        sql[sqlwn]=sqlsj
while True:
    #/dps
    sqltxt=input("dps>")
    if sqltxt=="set":
        #/dps/set
        wsqltxt=input("dps>set>")
        if wsqltxt=="sql -in":
            intxt=input("class>")
            wntxt=input("id>")
            sjtxt=input(">>")
            write(intxt,sjtxt,int(wntxt)-1)
            print(">>ok\n")
        if wsqltxt=="sql -out":
            sqltxtp=input("path>")
            f=open(sqltxtp,"a")
            sn=0
            sqlid=1
            f.write("sqlname:"+sqlname)
            f.write("\n")
            f.write("id|the sql")
            f.write("\n")
            f.write("----------")
            f.write("\n")
            while sn<int(sqllong):
                f.write(str(sqlid)+"|"+str(sql[sn]))
                f.write("\n")
                sn=sn+1
                sqlid=sqlid+1
            f.close()
            print(">>ok\n")
        if wsqltxt=="set -n":
            sqlname=input("newname")
            print(">>ok\n")
    if sqltxt=="show":
        #/dps/show
        ssqltxt=input("dps>show>")
        if ssqltxt=="dps -sh":
            shown=0
            sqlid=1
            print("sqlname:"+sqlname)
            print("id|the sql")
            print("----------")
            while shown<int(sqllong):
                print(str(sqlid)+"|"+str(sql[shown]))
                shown=shown+1
                sqlid=sqlid+1
            print("")
        if ssqltxt=="dps -se":
            shtxt=input("sqlshell>")
            if shtxt=="read":
                pathn=input("path>")
                f=open(pathn,"r")
                f.close()
                print("")
    if sqltxt=="show -h":
        print("")
        print("show 输出操作")
        print("show>dps -sh 输出sql")
        print("show>dps -se 打开shell")
        print("show>sqlshell>read 在shell中输入,读取sql")
        print("set 设置操作")
        print("set>sql -in 写入sql")
        print("set>sql -out 导出sql")
        print("set>set -n 改sql名字")
        print("show -h 操作指南")
        print("exit 退出")
        print("")
    if sqltxt=="exit":
        break