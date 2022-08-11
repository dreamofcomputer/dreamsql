import java.util.*;
public class dreamjavasql{
    public void startsh(){
        System.out.println("dream java sql");
        System.out.println("dreamofcomputer");
        System.out.println("");
    }
    public static void main(String[] args){
        dreamjavasql runmain=new dreamjavasql();
        runmain.startsh();
        String sqlname="";
        System.out.println("how sql long?");
        Scanner nwhileinput=new Scanner(System.in);
        int sqllong=nwhileinput.nextInt();
        ArrayList<String> sqlcode = new ArrayList<String>();
        int cjsql=0;
        while (cjsql<sqllong){
            sqlcode.add("null");
            cjsql=cjsql+1;
        }
        System.out.println("");
        //this is /djs
        int a=1;
        while (a==1){
            System.out.println("djs>");
            Scanner input=new Scanner(System.in);
            String inputtest=input.next();
            switch(inputtest){
                case "new":
                    //this is /djs/new sql
                    System.out.println("djs>new sql>");
                    String newsqltest=input.next();
                    switch(newsqltest){
                        case "name":
                            String newsqlname=input.next();
                            sqlname=newsqlname;
                            break;
                    }
                    break;
                case "showsqlname":
                    System.out.println("");
                    System.out.println(sqlname);
                    System.out.println("");
                    break;
                case "code":
                    //this is /djs/code
                    System.out.println("djs>code>");
                    String inputcode=input.next();
                    switch(inputcode){
                        case "text":
                            //this is /djs/code/text
                            System.out.println("djs>code>text>");
                            String texttest=input.next();
                            switch(texttest){
                                case "write":
                                    //this is djs/code/text/write
                                    System.out.println("djs>code>text>write>");
                                    int wn=input.nextInt(); //wn为插入区域+1
                                    //this is djs>code>text>write>wn>
                                    wn=wn-1;
                                    System.out.println("djs>code>text>write>"+wn+">");
                                    String tsqlsj=input.next();
                                    sqlcode.set(wn,tsqlsj);
                                    System.out.println(">>ok");
                                    System.out.println("");
                                break;
                            }
                        break;
                    }
                    break;
                case "showsql":
                    System.out.println("");
                    System.out.println("sql name:"+sqlname);
                    System.out.println(sqlcode);
                    System.out.println("");
                    break;
                case "exit":
                    a=2;
                    break;
            }
        }
    }
}