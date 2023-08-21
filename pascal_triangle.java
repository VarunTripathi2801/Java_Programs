import java.util.*;
class pascal_triangle
{
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of rows:\n");
      n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            
            System.out.print(comb(i,j)+" ");
        }
        System.out.println();}}
    

        static int comb(int n1,int r) // using combination formula nCr
        {
            if(r==0||n1==r)
            {
                return 1;
            }
            else
            {
                return (comb(n1-1,r-1)+comb(n1-1,r)); // 2 row ka 3 element=(1 row ka 2 element+ 1 row ka 3 element) 
            }
        }
    
}
  

