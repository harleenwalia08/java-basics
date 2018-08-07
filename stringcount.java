import java.util.*;
import java.io.*;
class stringcount
{
public static void main(String args[])
{
int count=0;
int freq[]=new int[123];
for(int i=0;i<str.length();i++)
{
freq[(int)str.charAt(i)]++;
}
for(int i=0;i<123;i++)
{
if(freq[i]!=0)
{
System.out.println((char)i);
System.out.println(freq[i]);
}
}
}
}