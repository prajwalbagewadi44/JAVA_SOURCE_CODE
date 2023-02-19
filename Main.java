import java.lang.*;
import java.util.*;

interface client
{
    void input(); // public+abstract 
    public abstract void output();
}
class Developer implements client 
{
    int msg_no;
    String msg;
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the msg_no=");
        msg_no=s.nextInt();
        System.out.println("enter the msg=");
        msg=s.nextLine();
    }
    void output()
    {
        System.out.println("msg_no="+msg_no);
        System.out.println("msg="+msg);
    }
}
class Main
{
    
    public static void main(String[]args)
    {
        client obj=new Developer();
        obj.input();
        obj.output();
    }
}
