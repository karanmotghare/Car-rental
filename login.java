import java.util.ArrayList;

import person.data;
public class login{
    public int logn(int id,String pass,ArrayList<data> li)
    {
        // ArrayList<data> li= new ArrayList<>();
        int check=-1;
        for(int i=0;i<3;i++)
        {
            data d= li.get(i);
            if(d.id==id && d.pass.equals(pass))
            {
                check=i;
            }
        }
        return check;
    }
}