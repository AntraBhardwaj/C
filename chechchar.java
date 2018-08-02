package number;
import java.util.*;
public class Checkchar {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch=0;
		Scanner ch1= new Scanner(System.in);
		ch= ch1.next().charAt(0);
		ch1.close();
     
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
    	  System.out.println("vowel");
      }
      
     else 
      {
    	 System.out.println("consonant");
      }
	}

}
