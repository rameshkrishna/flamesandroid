package flames.android.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Fthree extends f2{
	
	@Override

	 public void onCreate(Bundle savedInstanceState)
	 {
		 char r;
	        super.onCreate(savedInstanceState);
	   	 setContentView(R.layout.f3s);
	   	Button gre;
        gre=(Button)findViewById(R.id.gre);
	     	
	         r=work();
	         
	         if (r=='F'){
	        	 gre.setOnClickListener(new OnClickListener(){
	        	        public void onClick(View v){
	        	        	Intent i=new Intent(Fthree.this,F.class);
	        	        	startActivity(i);
	        	        	
	        	        }
	        	        });
	         }
	         else if(r=='L') {
	        	 gre.setOnClickListener(new OnClickListener(){
	        	        public void onClick(View v){
	        	        	Intent i=new Intent(Fthree.this,L.class);
	        	        	startActivity(i);}
	        	        });
	         }
	         else if(r=='A') {
	        	 gre.setOnClickListener(new OnClickListener(){
	        	        public void onClick(View v){
	        	        	Intent i=new Intent(Fthree.this,A.class);
	        	        	startActivity(i);
	        	        	
	        	        }
	        	        });
	         }
	         else if(r=='M') {
	        	 gre.setOnClickListener(new OnClickListener(){
	        	        public void onClick(View v){
	        	        	Intent i=new Intent(Fthree.this,M.class);
	        	        	startActivity(i);
	        	        	
	        	        }
	        	        });
	         }
	         else if(r=='E') {
	        	 gre.setOnClickListener(new OnClickListener(){
	        	        public void onClick(View v){
	        	        	Intent i=new Intent(Fthree.this,E.class);
	        	        	startActivity(i);
	        	        	
	        	        }
	        	        });
	         }
	         else if(r=='S') {
	        	 gre.setOnClickListener(new OnClickListener(){
	        	        public void onClick(View v){
	        	        	Intent i=new Intent(Fthree.this,S.class);
	        	        	startActivity(i);
	        	        	
	        	        }
	        	        });
	         }
	         
	         
	         
	       		 
}
	public char work(){
		char r=' ';
		String nam1=new String(s1);
	 	  String nam2=new String(s2);
	 	// nam1 = nam1.toLowerCase();
	 	//nam2 = nam2.toLowerCase();
String name1_split[] = s1.split(" ");
String name2_split[] = s2.split(" ");
nam1="";
nam2="";
for(int i=0;i<name1_split.length;i++)
{
nam1 = nam1+name1_split[i];
System.out.println(nam1);
}
for(int i=0;i<name2_split.length;i++)
{
nam2 = nam2+name2_split[i];
System.out.println(nam2);
}
StringBuffer name1=new StringBuffer(nam1);
StringBuffer name2=new StringBuffer(nam2);

 int a=nam1.length(),b=nam2.length();
 for(int i=0;i<a;i++)
{
	char h=name1.charAt(i);
	//System.out.println(c);
	for(int j=0;j<b;j++)
	{
		char d=name2.charAt(j);
		if(h==d)
		{
			 ////k++;
			 name1.deleteCharAt(i);
			 name2.deleteCharAt(j);
			 ////System.out.println(s1 +" " +s2);
			 a=name1.length();
			 //m=a;
			 b=name2.length();
			 i=0;
			 j=0;
			// continue label;
		}
				}
			}
int count=a+b;
String temp1=new String();
temp1="FLAMES";
String newStr=new String();
StringBuffer temp=new StringBuffer(temp1);
//String temp2str=new String();

// count=4;//get this values from comparison of two strings
int c=6;//length of flames initial later it will decrement by one in loop
if(count<6&&count>0)
{
	System.out.println("temp if count less than 6");
	System.out.print(temp);
	for(int i=0;c>=count;i++)
	{
			
			if(c==count){
				temp.deleteCharAt(count-1);	
				c--;
			}
			else {
				temp.deleteCharAt(count-1);
				newStr = temp.substring(count-1, temp.length());
  	newStr=newStr+temp.substring(0,count-1);
  	//copies the front string before the char deleted from the strin to the end of the new string
  System.out.print("in less than 6");
  System.out.println(newStr);
  temp=new StringBuffer(newStr);
  		c--;
			}

}
}
if(count>0)
{
     System.out.println(temp);
     // and also handle the case when count =6 conflct b/w the lenght of flame 0+6/6 is worst case.
       for(int k=1;c>0;k++){
       	//System.out.println(k+c);
       	if((k+c)%count==0){
       		
       		System.out.println(temp);
       		System.out.print(k+c);
       		System.out.print(k);
       		System.out.print(c);
       		System.out.println(k%c);
       		if(temp.length()>1)
       		{
       		if(k%c==0)//added this one to directly delete the last character from the string
       		{
       			char s=temp.charAt(temp.length()-1);
       			System.out.println(s);
       			temp.deleteCharAt(temp.length()-1);
       		}
       		else{
       			char s=temp.charAt((k%c)-1);
       			System.out.println(s);
       		temp.deleteCharAt((k%c)-1);
       	}
       	System.out.println(temp);
       	if((k%c)!=0)//add this condtion to when the directly the last character is deleted from the string..SO we need to start from the first..
       	{

       	newStr = temp.substring((k%c)-1, temp.length());
       	//added this line to copy the string from the next characeter deleted
       	//System.out.println(newStr);
       	//temp=temp+newStr;
       	newStr=newStr+temp.substring(0,(k%c)-1);
       	//copies the front string before the char deleted from the strin to the end of the new string
       System.out.println(newStr);
       temp=new StringBuffer(newStr);
       }
       



       	//for(int i=0,f=(k%c)-1;i<temp.length()-1;i++,f++){
       	//	 System.out.print(f);
       	//	 System.out.println(temp.length());
       	//	 F[i]=temp.charAt(f);
       	//	 System.out.println(F[i]);
       	//}
       	//for(int i=F.length()-1,j=0;i<(k%c);i++,j++)
       	//{

       	//		F[i]=temp.charAt(j);
       	//		System.out.println(F[i]);

       	//}
       		//temp=F.toStringBuffer();

       		//temp.deleteCharAt(k%c);
       		//System.out.println(temp);
       	}
       	c--;
       }
       }
       
       //System.out.println(c);
   	 r=temp.charAt(0);
   	
   	//System.out.println(ch);
	}
return r;

		}
	
	 }


