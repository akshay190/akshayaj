import java.lang.*;
import java.util.*;
public class p1{
	public static void main(String args[]){
String st;
Scanner sc=new Scanner(System.in);
int xd=sc.nextInt();

st=xd.string();
int x=st.length();
if(x<11){
int num=Integer.parseInt(st);
int index=st.indexOf("4");
if(index==-1){
	System.out.println(num);
}

else{
	int q=1;
	for(int i=index;i<x-1;i++)
		q=q*10;
	int n1=num-q,n2=q;
	num=n1;
	while(q!=0){
		int z=(num/q)%10;
		if(z==4)
		{
			n1=n1-q;
			n2+=q;
		}
		
		q=q/10;
	}
	
	
	
	
	
	
	
	
	System.out.println(n1+"  "+n2);
	

	}
}
}
}