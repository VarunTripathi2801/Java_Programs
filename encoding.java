import java.util.*;
class encoding
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s="ABCD";
        String s1="";
        int a;
        for(int i=0;i<(s.length());i++)
        {
            char ch=s.charAt(i);
            if(ch!=' '&&Character.isDigit(ch)==false)
            {
                
                a=((int)ch)+2;
                s1=s1+((char)a);
            }
        }
        System.out.println(s1);
    }
}

