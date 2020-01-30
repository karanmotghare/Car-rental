package car;
public class car
{
public int type;
public String dname;
public String mobno;
public long licno;
public String cname;
public boolean pos;
public car(int type,String cname,String dname,String mobno,long licno,boolean pos)
{
    this.type = type;
    this.cname = cname;
    this.dname=dname;
    this.mobno=mobno;
    this.licno=licno;
    this.pos=pos;
}
}