class Permute
{
   static String swap(String str,int i,int j)
   {
        char []ch=str.toCharArray();
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
        return String.valueOf(ch);
   }
   static void permute(String str,int l,int r)
   {
       if(l>=r)
           System.out.println(str);
       else
       {
           for(int i=l;i<=r;i++)
           {
               str=swap(str,i,l);
               permute(str,l+1,r);
               str=swap(str,i,l);
            }
       }
   }
   public static void main(String []args)
   {
       String str="abc";
       permute(str,0,str.length()-1);
   }
}
