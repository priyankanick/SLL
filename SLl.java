import java.util.Scanner;
class SingleL {
          node head;
          node ptr;node ptr1;
          private class node
	 {
           int data;
  	   node link;
         }
 public void create()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the quantity you want to create");
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
    {
	node newnode=new node();
        System.out.println("enter data");
        int x=sc.nextInt();
        newnode.data=x;
        newnode.link=null;
	if(head==null)
	   head=newnode;
	else
	 {
	   node ptr=head;
	   while(ptr.link!=null)
            {   
        	ptr=ptr.link;
            }
           ptr.link=newnode;
        }
    }	   
 }
public void display()
{
  if(head==null)
  System.out.println("empty list");
  else
  {
     ptr=head;
    while(ptr!=null)
    {
      System.out.print(ptr.data +"->");
      ptr=ptr.link;
    }
     System.out.println("null");
 }
}
public void firstinsert() {
  node newnode=new node();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the data");
  int p=sc.nextInt();
  newnode.data=p;
  newnode.link=head;
  head=newnode;
}	
public void any_pos_insert() {
  node newnode=new node();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the data");
  int p=sc.nextInt();
  newnode.data=p;
  newnode.link=null;
  System.out.println("enter the position ");
  int pos=sc.nextInt();
   ptr=head;
   ptr1=head;
  for(int i=1;i<pos;i++)
  {
    ptr1=ptr;
    ptr=ptr.link;   
 }
   newnode.link=ptr1.link;
   ptr1.link=newnode;
}
  
public void lastinsert() {
  node newnode=new node();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the data");
  int p=sc.nextInt();
  newnode.data=p;
  newnode.link=null; 
  ptr=head;
  while(ptr.link!=null)
  ptr=ptr.link;
  ptr.link=newnode;
}

public void delfirst()
{
 if(head == null)
 {
   System.out.println("empty list");
   return;
 }
 head=head.link;
}

public void dellast()
{
  if(head == null)
 {
   System.out.println("empty list");
   return;
 }
ptr=head;
ptr1=head;
while(ptr.link!=null)
{
    ptr1=ptr;
    ptr=ptr.link;
}
ptr1.link=ptr.link;
}

public void delanypos()
{
  if(head == null)
 {
   System.out.println("empty list");
   return;
 } 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the position for delete");
 int pos=sc.nextInt();
 ptr=head;
  ptr1=head;
 for(int i=1;i<pos;i++)
 {
   ptr1=ptr;
   ptr=ptr.link;
}
 ptr1.link=ptr.link;
}
}
class SLl {
  public static void main(String[] args)
   {
      SingleL obj=new SingleL();
      obj.create();
      obj.display(); 
      
      obj.firstinsert();
      obj.display();
      
       obj.delanypos();
      obj.display();
     
      obj.any_pos_insert();
      obj.display();

      obj.lastinsert();
      obj.display();
      
      obj.delfirst();
      obj.display();
       obj.dellast();
      obj.display();
     
      
   }
}     