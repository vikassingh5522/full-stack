	// WAP to convert the string into title case

		str -->  HELLO   gooD  DaY   to   aLl     0
		o.p -->  Hello   Good  Day   To   All
#include<stdio.h>
int main()
{
	char str[50];
	int i;

	printf("\n Enter any string: ");
	gets(str);

	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]!=32 && str[i-1]==32)
		{
			if(str[i]>=97 && str[i]<=122)
			{
				str[i]=str[i]-32;
			}
		}
		else if(str[i]>=65 && str[i]<=90)
		{
			str[i]=str[i]+32;
		}
	}

	if(str[0]!=32 && (str[0]>=97 && str[0]<=122) )
	{
		str[0]=str[0]-32;
	}
	printf("\n string is: %s",str);
	return 0;
}

//-------------------------------------------------------------------------------------------------------

	// WAP to interchange the first and last character of every word in the string

	str --> hello   best  morning  student
        o/p --> oellh   tesb  gorninm  ttudens
                                           | 
  ------hello---best--morning--student-----0
                                           |
#include <stdio.h>
int main()
{
	char str[40], tmp;
	int i,j;
	printf("\n Enter the string: ");
	gets(str);
	printf("\n Entered string: %s",str);

	for(i=0;str[i]!='\0';i++)
	{
		for(j=i;str[j]==32;j++); 
		i=j;	
		if(str[i]=='\0')
		{
			break;
		} 	
		for(j=i;(str[j]!=32 && str[j]!='\0');j++);
		j=j-1;
		printf("\n i=%d \t j=%d",i,j);
		
		tmp=str[i];
		str[i]=str[j];
		str[j]=tmp;
		
		i=j;	
	}
	printf("\n string after interchange: %s",str);
	return 0;
}
//------------------------------------------------------------------------------------------------------

	// WAP to reverse every word in the string at same location 
	
	str --> hello   best  morning  student
	o/p --> olleh   tseb  gninrom  tneduts

#include <stdio.h>
int main()
{
	char str[40], tmp;
	int i,j,t;
	printf("\n Enter the string: ");
	gets(str);
	printf("\n Entered string: %s",str);

	for(i=0;str[i]!='\0';i++)
	{
		for(j=i;str[j]==32;j++); 
		i=j;	
		if(str[i]=='\0')
		{
			break;
		} 	
		for(j=i;(str[j]!=32 && str[j]!='\0');j++);
		j=j-1;
		printf("\n i=%d \t j=%d",i,j);
		t=j;
		while(i<=j)
		{
		    tmp=str[i];
		    str[i]=str[j];
		    str[j]=tmp;
		    i++;
		    j--;
		}
		i=t;	
	}
	printf("\n string after interchange: %s",str);
	return 0;
}

///------ Another Way --------
	              |
	str: ----olleh-----students----perform----task-----0
		      |

	t: olleh\0
	    |   | 
#include <stdio.h>
int main()
{
	char s[50],t[30],tmp;
	int i,j,k;
	printf("\n Enter the string: ");
	gets(s);

	i=0;
	while(1)
	{
		for( ;s[i]==32;i++);	
		if(s[i]=='\0')
		{
			break;
		}
		j=i;
		for(k=0;(s[j]!=32&&s[j]!='\0');j++,k++)
		{
			t[k]=s[j];
		}
		t[k]='\0';
		
		for(j=0,k--; j<=k; j++, k--)
		{
			tmp=t[j];
			t[j]=t[k];
			t[k]=tmp;
		}
		for(j=0;t[j]!='\0';j++,i++)
		{
			s[i]=t[j];
		}
	}
	printf("\n String is: %s",s);
	return 0;
}
	
//----------------------------------------------------------------------------------------------------

	// WAP to search entered word in the entered string
                     |
 string: hello  students i am reading students notice now, all students from list of topper students xyz
                           | 
 word: students
         | 		
	output --> students words present 4 times.
#include <stdio.h>
int main()
{
	char s[50],w[30];
	int i,j,k,wl,len,flg,cnt=0;

	printf("\n Enter any String: ")	;
	gets(s);
	printf("\n Enter any word: ");
	gets(w);
	for(wl=0;w[wl]!='\0';wl++);

	i=0;
	do
	{
		for( ;s[i]==32;i++);
		if(s[i]=='\0') 
			break;

		for(j=i,len=0;( s[j]!=32 && s[j]!='\0'); j++,len++);	
		printf("\n length: %d",len);
		if(len==wl)
		{
			flg=0;
			for(k=0;w[k]!='\0';k++,i++)
			{
				if(s[i]!=w[k])
				{
					flg=1;
					break;
				}
			}	
			if(flg==0)
			{
				cnt++;
			}
		}
		i=j;
	}while(1);

	if(cnt!=0)
		printf("\n \"%s\" PRESENT %d TIMES",w,cnt);
	else
		printf("\n \"%s\" not PRESENT ",w);
	return 0;	
}

//---------------------------------------------------------------------------------------------------------

	//WAP to sort the string in alpha. order

		str ---> good day to all of you0
#include <stdio.h>
int main()
{
	char str[40];
    int i,j,tmp;
	printf("\n Enter the String: ");
	gets(str);
	printf("Entered String is: %s",str);

	for(i=0;str[i+1]!='\0';i++)
	{
		for(j=i+1;str[j]!='\0';j++)
		{
			if(str[i]>str[j])
			{
				tmp=str[i];
				str[i]=str[j];
				str[j]=tmp;
			}
		}
	}
	printf("\n Sorted String is: %s",str);
	return 0;
}

 --- Note: you have to modify this program for the ucase, lcase characters.

//----------------------------------------------------------------------------------------------------------

	// WAP to remove repeated character from string

	str --> good day to all of you
	output-> god aytlfu

#include <stdio.h>
int main()
{
	char str[40];
    	int i,j,k;
	printf("\n Enter the String: ");
	gets(str);
	printf("Entered String is: %s",str);

	for(i=0;str[i+1]!='\0';i++)
	{
		for(j=i+1;str[j]!='\0';j++)
		{
			if(str[i]==str[j])
			{
				for(k=j;str[k]!='\0';k++)
				{
					str[k]=str[k+1];
				}
			}
		}
	}
	printf("\n Output String is: %s",str);

	return 0;
}
//-----------------------------------------------------------------------------------------

	// Enter alphanumeric string and replace every digit with equivalent string.

	 str --> hello ajay, bring 2 apples, 3 kg bananas.
	 output--> hello ajay, bring two apples, three kg bananas.

/*
	HINT: 

#include <stdio.h>
int main()
{
    char str[50];
	int i;
	char numbers[10][8] = {
        "zero", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine"
    };

	for(i=0;i<10;i++)
	{
		printf("\n %s",numbers[i]);
	}
	
	printf("\n Enter the String: ");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
	    if(str[i]>=48&&str[i]<=57)
	    {
		    printf("\n %d - %s",str[i]%48, numbers[str[i]%48]);
	    }
	}
	return 0;
}

*/
//-----------------------------------------------------------------------------------------------

	// split string in to 2 diferent strings in such way that one string having all words with
	// even character count and another with odd.

	str --> hello all good day to all of you
		
		    ---> s1: good to of
	output ==> |
		   ----> s2: hello all day all you


//------------------------------------------------------------------------------------------------

	// merge two string as per the word length

	s1 --> hello good day
	s2 --> hi happy morning students

	output : str --> hi day good hello happy morning students
