
package caesar.cipher;

import java.util.Scanner;
import java.io.*;
class mycypher {
    private String s1;
    private char key[]=new char[100];
    private int my_char[]=new int[100];
    private int arr[]=new int[100];
    private int n=2;
    Scanner in=new Scanner(System.in);
    public void get()
    {
        System.out.println("Enter your string here:");
        s1=in.nextLine();
    }
    public void getkey()
    {
        System.out.println("Enter your key here:");
        key=in.nextLine().toCharArray();
    }
    public String encode()
    {
        this.getkey();
        this.get();
        char[] ch_arr=s1.toCharArray();
        char[] ch_arr2=new char[100];
        for(int i=0; i<key.length;i++)
        {
            arr[i]=Character.getNumericValue(key[i]);
        }
        for(int i=0,j=0;i<ch_arr.length;i++,j++)
        {
            if(arr[j]==0)
            {
                j=0;
            }
            if(arr.length>ch_arr.length)
            {
                char c=ch_arr[i];
                if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
                {
                    ch_arr2[i] = (char) (ch_arr[i] + arr[j]);
                    i=i+n;
                }
                else
                {
                    ch_arr2[i]=c;
                    j--;
                }
            }
        }
        String s2=new String(ch_arr2);
        return s2;
    }
}
public class CaesarCipher{
    public static void main(String[] args) {
    mycypher m1=new mycypher();
    String str;
    str=m1.encode();
    System.out.println("Encoded string is:"+str);
    }
} 
