package Practice;

import java.lang.reflect.Field;

public class MyString {
    private String s;
    private String s1 = "你是帅比";
    private String s2 = new String("你是帅比");

    MyString(String s){
        this.s=s;
    }

    public void fun1() {
        System.out.println("before challenge");
        System.out.println(s1);
        System.out.println(s2);
    }

    public void challenge() throws Exception {
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] valueCharArr = (char[]) valueField.get(s1);
        valueCharArr[2] = '丑';

        System.out.println("after");
        System.out.println(s1);
        System.out.println(s2);
    }

    public String removeChat(String s,int pos){
        return s.substring(0,pos)+s.substring(pos+1);
    }

    public String myReplace(String s,char old,char r)
    {
        return s.replace(old,r);
    }

    public String reverse(String s)
    {
        String newSting= new StringBuffer(s).reverse().toString();
        return newSting;
    }

    public void search(String s){
        int index=s.indexOf(s);
        if(index==-1)
        {
            System.out.println("can't find this string");
        }
        else {
            System.out.println("this position of this string is "+index);
        }
    }

    public void breakOut(String s,String delimeter){
        String[] temp=s.split(delimeter);
        for (String myS:temp
             ) {
            System.out.print(myS);
            System.out.print(" ");
        }
    }

    public void Up(String s)
    {
        String upCase=s.toUpperCase();
        System.out.println(upCase);
    }


}
