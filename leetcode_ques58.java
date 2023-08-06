import java.util.*;
class leetcode_ques58
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
        leetcode_ques58 obj=new leetcode_ques58();
        int n=obj.lengthOfLastWord(str);
        System.out.println(n);
    }
    public int lengthOfLastWord(String s) 
    {
        int len=0;
        String wrd="";
        s.trim();
        System.out.println(s);
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(len != 0)
                    len=wrd.length();
                wrd="";
            }
            else   
                wrd=wrd+ch;
        }
        return len;
    }
}
