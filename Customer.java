import java.util.regex.*;
import java.util.*;
import car.car;
import person.data;
interface One
{
     public int verify(int a,String b,String c);
}

public class Customer implements One
{
   public int  verify(int id,String name,String password) 
    {
        int b=0,idd;
        String uname,pw;
        Scanner ip = new Scanner(System.in);
        while(b!=1)
        {
         System.out.println("Enter id no.");
         idd=ip.nextInt();
         try{
         System.out.println("Enter password");
         }
         catch(NullPointerException e){
                System.out.println(e.getMessage());
         }
         ip.nextLine();   
         pw = ip.nextLine();
            if(id == idd && pw.equals(password))
            {
                System.out.println("Login successful");
                b=1;
            }
            else
            {
                System.out.println("Enter valid id/password");
            }

        }
        return b;
    } 
}

 class Index extends Customer
{
    
    
  /*  class car
    {
    int type;
    String dname;
    String mobno;
    long licno;
    String cname;
    car(int type,String cname,String dname,String mobno,long licno)
    {
        this.type = type;
        this.cname = cname;
        this.dname=dname;
        this.mobno=mobno;
        this.licno=licno;
    }
    }
 */

    // class data
    // {
    //     int id;
    //     String name;
    //     String mail;
    //     String mob;
    //     String pass;

    //     data(int id,String name,String mail,String mob,String pass)
    //     {
    //         this.id = id;
    //         this.name = name;
    //         this.mail= mail;
    //         this.mob=mob;
    //         this.pass=pass;
    //     }
    // }
    public int addval(int id[],String name[],String mail[],String mob[],String pass[],ArrayList<data> li)
    {
        
        for(int i=0;i<3;i++)
        {
            li.add(new data(id[i],name[i],mail[i],mob[i],pass[i]));

        }
        return 0;
    }
    public int addcval(int type[],String cname[],String dname[],String mobno[],long licno[],boolean pos[], ArrayList<car> cli) {

        for (int i = 0; i < 4; i++) {
            cli.add(new car(type[i],cname[i] ,dname[i], mobno[i], licno[i],pos[i]));
        }
        return 0;
    }
    
    public int addval1(int id,String name,String mail,String mob,String pass,ArrayList<data> ui)
    {
    
    
     ui.add(new data(id,name,mail,mob,pass));

    
    return 3;
    }

    
    // public int logn(int id,String pass,ArrayList<data> li)
    // {
    //     int check=-1;
    //     for(int i=0;i<3;i++)
    //     {
    //         data d= li.get(i);
    //         if(d.id==id && d.pass.equals(pass))
    //         {
    //             check=i;
    //         }
    //     }
    //     return check;
    // }

    public int Pickdrop(int pick,int drop,int type)
    {
        int distance=0;
        int price;
        if(pick==drop)
        {
            //enter valid location
            distance=0;
            price=0;
        }
        else if(pick==1&&drop==2 || pick==2&&drop==1)
        {
            distance=7;
        }
        else if(pick==1&&drop==3 || pick==3&&drop==1)
        {
            distance=9;
        }
        else if(pick==1&&drop==4 || pick==4&&drop==1)
        {
            distance=6;
        }
        else if(pick==2&&drop==3 || pick==3&&drop==2)
        {
            distance=9;
        }
        else if(pick==2&&drop==4 || pick==4&&drop==2)
        {
            distance=10;
        }
        else if(pick==3&&drop==4 || pick==4&&drop==3)
        {
            distance=6;
        }
        if(type==1)
        {
            if(distance==6)
            {
            price=130;
            }
            else if(distance==7)
            {
            price=150;
            }
            else if(distance==9)
            {
            price=210;
            }
            else 
            {
            price=240;
            }

        }
        else
        {
            if(distance==6)
            {
            price=150;
            }
            else if(distance==7)
            {
            price=170;
            }
            else if(distance==9)
            {
            price=230;
            }
            else 
            {
            price=260;
            }
        }

        return price;
    }

public static boolean isValide(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
  
    
    public static boolean isValid(String s) 
    { 
        // 1) Begins with 0 or 91 
        // 2) Then contains 7 or 8 or 9. 
        // 3) Then contains 9 digits 
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
  
        // Pattern class contains matcher() method 
        // to find matching between given number  
        // and regular expression 
        Matcher m = p.matcher(s); 
        return (m.find() && m.group().equals(s)); 
    } 
    public static void main(String[] args) 
    {

        Index i = new Index();
        Scanner scanner = new Scanner(System.in);
        int id[] = {1,2,3};
        String name[]={"joe","leo","ino"};
        String mail[]={"joe@mail","leo@mail","ino@mail"};
        String mob[]={"8789654321","8744447984","9431454643"};
        String pass[]={"joe12","leo12","ino12"};
        int type[]={1,1,2,2};
        String cname[]={"Swift","Wagnor","verna","city"};
        String dname[]={"salman k","beastmaster","smoothcriminal","vin diesel"};
        String mobno[]={"9876451234","8876546543","9812358756","8880754634"};
        boolean pos[]={true,false,true,true};
        long licno[]={77777,44444,11111,22222};

        
        login log = new login();

        ArrayList<data> li = new ArrayList<data>();
        ArrayList<data> ui = new ArrayList<data>();
        ArrayList<car> cli = new ArrayList<car>();
        i.addval(id, name, mail, mob, pass,li);
        i.addcval(type,cname, dname, mobno, licno, pos,cli);
        int pickup,dropup;
        int n,ID,check=-1;
        int stype,isvia=0,flg=0;
        int scar=0,book;
        String passw,via=null;
        int idu,c=0;
        String mobu=null;
        String nameu=null,mailu=null,passu=null;
        System.out.println("-----------------Welcome----------------");
        System.out.println("Enter number for operation");
        System.out.println("Press 1 for Login");
        System.out.println("Press 2 for registration");
        int price=0;
        n=scanner.nextInt();
        if(n==1)
        {
            System.out.println("----------------------\n");
            System.out.println("\nEnter user ID");
            ID=scanner.nextInt();
            System.out.println("\nenter password");
            scanner.nextLine();
            passw=scanner.nextLine();
            check=log.logn(ID,passw,li);

        }
        else if(n==2)
        {
            

            Random r = new Random();
            idu = r.nextInt(100);
            scanner.nextLine();
            while(c==0)
            {
            System.out.println("\nEnter your mobile number");
            mobu=scanner.nextLine();
            if(isValid(mobu))
            c=1;
            else
            System.out.println("\nEnter a valid number");
            
            }
           c=0;
            while(c==0)
            {
            System.out.println("\nEnter your name");
            nameu=scanner.nextLine();
            if(nameu.isEmpty()==true)
            {
                c=0;
                System.out.println("\nthis should not be empty");
            }
            else
            {
                c=1;
            }
            }
            
            while(c==1)
            {
                System.out.println("\nEnter your email");
                mailu=scanner.nextLine(); 
                if(isValide(mailu))
                {
                    c=2;
                }
                else
                {
                    System.out.println("\nEnter a valid email-address");
                }
            }
            System.out.println("\nyour login id generated is "+idu);

            
            while(c==2){
               System.out.println("\nEnter your password");
             passu=scanner.nextLine();
            if(passu.isEmpty()==true)
            {
                c=2;
                System.out.println("\npassword should not be empty");
            }
            else{
                c=3;
            }
            }
            
            int a;
            a = i.verify(idu,nameu,passu);
            check=0;
            
        }
        else
        {
            System.out.println("enter vaid number");
        }
        if(check!=-1)
        {
            System.out.println("You has succesfully login");
            System.out.println("\n------------------------\n");    
            System.out.println("Chosse your pickup location");
            System.out.println("\n------------------------\n");    

            System.out.println("1. poonam mall, Wardhman nagar");
            System.out.println("2. Ladies club chowk, civil lines");
            System.out.println("3. Shatabdi nagar chowk ");
            System.out.println("4. Dhigori, umred road ");
            pickup=scanner.nextInt();
            System.out.println("\n------------------------\n");    

            System.out.println("Chosse your Dropup location");
            System.out.println("\n------------------------\n");    

            System.out.println("1. poonam mall, Wardhman nagar");
            System.out.println("2. Ladies club chowk, civil lines");
            System.out.println("3. Shatabdi nagar chowk ");
            System.out.println("4. Dhigori, umred road ");
            dropup=scanner.nextInt();
            System.out.println("\n------------------------\n");    

            System.out.println("Do you want to take via route?\n1. Yes\n2. No");
            isvia=scanner.nextInt();
            if(isvia==1)
            {
                System.out.println("Enter the location\n");
                scanner.nextLine();
                via=scanner.nextLine();
                flg=1;
            }
            System.out.println("Enter type of car you want\n");
            System.out.println("1. Regular");
            System.out.println("2. Premium");
            System.out.println("\n------------------------\n");    

            stype=scanner.nextInt();
            if(stype==1)
            {
                int flag=0;
                while(flag!=1){
                for(int j=0;j<2;j++)
                {
                    car ca= cli.get(j);
                    System.out.println("\n------------------------\n");  
                      
                    System.out.println("available cars are\n");
                   
                    if(ca.pos==true){
                    System.out.println(j+" "+ca.cname);
                    }
                    else
                    {
                        System.out.println(ca.cname+" is not available");
                    }

                }
                
                
                
                int h=0;
                while(h==0)
                {
                    scar=scanner.nextInt();
                    car va =cli.get(scar);
                    if(va.pos==true)
                    {
                        h=1;
                    }
                    else
                    {
                        h=0;
                        System.out.println("this car is not available\n");
                    }   
                }
                car ca=cli.get(scar);
                System.out.println("\n------------------------\n");    

                System.out.println("car name "+ca.cname+"\ndriver name is "+ca.dname+"\nmoblie number is "+ca.mobno+"\nlicence number is "+ca.licno);
                price=i.Pickdrop(pickup,dropup,stype);
                if(flg==1)
                {
                    price=price+100;}
                System.out.println("\nyour fare for ride is "+price+"$");
                System.out.println("\nDo you to want to confirm booking");
                System.out.println("\n1. Rebook");
                System.out.println("\n2. confirm");
                book=scanner.nextInt();
                if(book==2)
                {
                    flag=1;
                }
                }
                
            }
            else
            {
                int flag=0;
            
                while(flag!=1)
                {
                for(int j=2;j<4;j++)
                {
                    car ca= cli.get(j);
                    System.out.println("\n------------------------\n");    
                    System.out.println("available cars are\n");
                      
                    if(ca.pos==true){
                    System.out.println(j+" "+ca.cname);
                    }
                    else
                    {
                        System.out.println(ca.cname+" is not available");
                    }
                }
                scar=scanner.nextInt();
                car ca=cli.get(scar);
                System.out.println("\n------------------------\n");    

                System.out.println("car name "+ca.cname+"\ndriver name is "+ca.dname+"\nmoblie number is "+ca.mobno+"\nlicence number is "+ca.licno);
                price=i.Pickdrop(pickup,dropup,stype);
                if(flg==1)
                {
                    price=price+100;}
                System.out.println("\nyour fare for ride is "+price);
                System.out.println("\nDo you to want to confirm booking");
                System.out.println("\n1. confirm");
                System.out.println("\n2. Rebook");
                book=scanner.nextInt();
                if(book==1)
                {
                    flag=1;
                }
                }
            }
            
            data da=li.get(check);
            car ca=cli.get(scar);
            System.out.println("\n------------------------\n");    

            System.out.println(da.name+" Thank you for booking "+ca.cname);
            System.out.println(da.mail);
            
        }
        scanner.close();
    }
}