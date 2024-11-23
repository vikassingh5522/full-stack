// --------------------------------- struck and linklist program----------------------------------------
// --self referable structure

// #include<stdio.h>
// #include<stdlib.h>
// struct student
// {
// 	int altno;
// 	float hsc;
// 	float cet;
// 	struct student *next;
// };
// void main()
// {
// 	struct student *start, *last, *tmp;
// 	int opt;
// 	start=NULL;
// 	while(1)
// 	{
// 		printf("\n ---------- Menu ----------\n");
// 		printf("\n 1.Insert \n 2.Display \n 3.Stop");
// 		printf("\n Select your option: ");
// 		scanf("%d",&opt);
// 		switch(opt)
// 		{
// 			case 1:
// 				tmp=(struct student*)malloc(sizeof(struct student));
// 				printf("\n Enter the alt no, hsc percentage and cet marks of student: ");
// 				scanf("%d %f %f",&tmp->altno,&tmp->hsc,&tmp->cet);
// 				tmp->next=NULL;
// 				if(start==NULL)
// 				{
// 					start=tmp;
// 					last=tmp;
// 				}
// 				else
// 				{
// 					last->next=tmp;
// 					last=tmp;
// 				}
// 				break;
// 			case 2:
// 				tmp=start;
// 				while(tmp)
// 				{
// 					printf("\n Alt No: %d \t HSC Marks: %0.2f \t CET Marks: %0.2f",tmp->altno,tmp->hsc,tmp->cet);
// 					tmp=tmp->next;
// 				}
// 				break;
// 			case 3:
// 				exit(0);
// 			default:
// 				printf("\n Incorrect Option...!!!");
// 		}
// 	}
// }

// -------------------------------------------------------------------------------------------------------------------------------------------------------

// #include<stdio.h>
// #include<stdlib.h>
// struct Node
// {
// 	int data;
// 	struct Node *next;
// };
// int main()
// {
// 	struct Node *start, *last, *tmp, *t;
// 	int i, opt,cnt=0,pos, val;
// 	start=NULL;
// 	while(1)
// 	{
// 		printf("\n ======= Menu ======== \n");
// 		printf("\n 1.insert \n 2.delete \n 3.display \n 4.stop");

//         printf("\n select your option: ");
// 		scanf("%d",&opt);
// 		switch(opt)
// 		{
// 			case 1: // insert
// 				tmp=(struct Node*)malloc(sizeof(struct Node));
// 				printf("\n Enter the Data: ");
// 				scanf("%d",&tmp->data);
// 				tmp->next=NULL;
// 				if(start==NULL)
// 				{
// 					start=tmp;
// 					last=tmp;
// 				}
// 				else
// 				{
// 					last->next=tmp;
// 					last=tmp;
// 				}
// 				cnt++;
// 				break;
//             case 2:  //delete
//                     printf("\n ---- Sub-Menu ----\n");
//                     printf("\n 1.Delete From Start \n 2.From Last \n 3.From Position \n 4.using Value");
//                     printf("\n select option: ");
//                     scanf("%d",&opt);
//                     if(opt==1) //delete from start
//                     {
//                         tmp=start;
//                         start=tmp->next; // start=start->next;
//                         free(tmp);
//                         cnt--;
//                     }
//                     else if(opt==2)  // from last
//                     {
//                         tmp=start;
//                         while(tmp->next!=last)
//                         {
//                             tmp=tmp->next;
//                         }
//                         tmp->next=NULL;
//                         free(last);
//                         last=tmp;

//                         cnt--;
//                     }
//                     else if(opt==3)  //position
//                     {
//                         printf("\n Enter the Node Position: ");
//                         scanf("%d",&pos);
//                         if(pos>cnt)
//                         {
//                             printf("\n Improper Position");
//                         }
//                         else
//                         {
//                             if(pos==1)
//                             {
//                                 tmp=start;
//                                 start=tmp->next; // start=start->next;
//                                 free(tmp);
//                             }
//                             else if(pos==cnt)
//                             {
//                                 tmp=start;
//                                 while(tmp->next!=last)
//                                 {
//                                     tmp=tmp->next;
//                                 }
//                                 tmp->next=NULL;
//                                 free(last);
//                                 last=tmp;
//                             }
//                             else   
//                             {
//                                 tmp=start;
//                                 i=1;
//                                 while(i<(pos-1))
//                                 {
//                                     tmp=tmp->next;
//                                     i++;
//                                 }
//                                 t=tmp->next;
//                                 tmp->next=t->next;
//                                 free(t);
//                             }
//                         }
//                         cnt--;
//                     }
//                     else if(opt==4)   // using value
//                     {
//                         printf("\n Enter the value: ");
//                         scanf("%d",&val);
//                         if(start->data==val)
//                         {
//                                 tmp=start;
//                                 start=tmp->next; // start=start->next;
//                                 free(tmp);
//                         }
//                         else if(last->data==val)
//                         {
//                                 tmp=start;
//                                 while(tmp->next!=last)
//                                 {
//                                     tmp=tmp->next;
//                                 }
//                                 tmp->next=NULL;
//                                 free(last);
//                                 last=tmp;
//                         }
//                         else
//                         {
//                             tmp=start;
//                             while(tmp->data!=val)
//                             {
//                                 t=tmp;
//                                 tmp=tmp->next;
//                             }
//                             t->next=tmp->next;
//                             free(tmp);
//                         }
//                         cnt--;
//                     }
//                     else
//                     {
//                         printf("\n Incorrect Option: ");
//                     }
//                 break;
// 			case 3:  //stop
// 			    printf("\n Node Count: %d\n",cnt);
// 				tmp=start;
// 				while(tmp)
// 				{
// 					printf("%7d",tmp->data);
// 					tmp=tmp->next;
// 				}
// 				break;
// 			case 4:   
// 				exit(0);
// 			default:
// 				printf("\n Incorrect Option...!!!");
// 		}
// 	}
// 	return 0;
// }


//----------------------------------------------------------------------------------------------------------------------------------
// Implementing (insert-HW) and Delete Operations

#include <stdio.h>
#include <stdlib.h>
// Node structure
struct Node
{
	int data;
	struct Node *next;
};
int main()
{
	struct Node *start = NULL, *last = NULL, *tmp, *t;
	int i, opt, cnt = 0, pos, val;

	while (1)
	{
		printf("\n ======= Menu ======== \n");
		printf("\n 1. Insert \n 2. Delete \n 3. Display \n 4. Stop");
		printf("\n Select your option: ");
		scanf("%d", &opt);
		switch (opt)
		{
		// Insert Operation
		case 1:
			tmp = (struct Node *)malloc(sizeof(struct Node));
			printf("\n Enter the Data: ");
			scanf("%d", &tmp->data);
			tmp->next = NULL;
			if (start == NULL)
			{
				start = tmp;
				last = tmp;
			}
			else
			{
				last->next = tmp;
				last = tmp;
			}
			cnt++;
			break;

		// Delete Operation
		case 2:
			printf("\n ---- Sub-Menu ----\n");
			printf("\n 1. Delete From Start \n 2. Delete From Last \n 3. Delete From Position \n 4. Delete using Value");
			printf("\n Select option: ");
			scanf("%d", &opt);

			// Delete from Start
			if (opt == 1)
			{
				if (start == NULL)
				{
					printf("\n List is Empty!\n");
					break;
				}
				tmp = start;
				start = tmp->next;
				free(tmp);
				cnt--;
			}
			// Delete from Last
			else if (opt == 2)
			{
				if (start == NULL)
				{
					printf("\n List is Empty!\n");
					break;
				}
				tmp = start;
				if (tmp == last)
				{
					free(last);
					start = last = NULL;
				}
				else
				{
					while (tmp->next != last)
					{
						tmp = tmp->next;
					}
					tmp->next = NULL;
					free(last);
					last = tmp;
				}
				cnt--;
			}
			// Delete from Position
			else if (opt == 3)
			{
				printf("\n Enter the Node Position: ");
				scanf("%d", &pos);
				if (pos > cnt || pos < 1)
				{
					printf("\n Invalid Position!\n");
				}
				else
				{
					if (pos == 1)
					{
						tmp = start;
						start = tmp->next;
						free(tmp);
					}
					else
					{
						tmp = start;
						for (i = 1; i < pos - 1; i++)
						{
							tmp = tmp->next;
						}
						t = tmp->next;
						tmp->next = t->next;
						if (t == last)
						{
							last = tmp;
						}
						free(t);
					}
					cnt--;
				}
			}
			// Delete using Value
			else if (opt == 4)
			{
				printf("\n Enter the value: ");
				scanf("%d", &val);

				if (start == NULL)
				{
					printf("\n List is Empty!\n");
					break;
				}
				tmp = start;
				// Deleting the first node
				if (start->data == val)
				{
					start = tmp->next;
					free(tmp);
				}
				// Deleting the last node
				else if (last->data == val)
				{
					while (tmp->next != last)
					{
						tmp = tmp->next;
					}
					tmp->next = NULL;
					free(last);
					last = tmp;
				}
				// Deleting any other node
				else
				{
					t = NULL;
					while (tmp && tmp->data != val)
					{
						t = tmp;
						tmp = tmp->next;
					}
					if (tmp)
					{
						t->next = tmp->next;
						free(tmp);
					}
					else
					{
						printf("\n Value not found!\n");
						break;
					}
				}
				cnt--;
			}
			else
			{
				printf("\n Incorrect Option!\n");
			}
			break;
		// Display the list
		case 3:
			if (start == NULL)
			{
				printf("\n List is Empty!\n");
			}
			else
			{
				printf("\n Node Count: %d\n", cnt);
				tmp = start;
				while (tmp)
				{
					printf("%d ", tmp->data);
					tmp = tmp->next;
				}
				printf("\n");
			}
			break;
		// Exit the program
		case 4:
			exit(0);
		default:
			printf("\n Incorrect Option!\n");
		}
	}
	return 0;
}
