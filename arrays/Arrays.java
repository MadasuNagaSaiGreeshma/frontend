/* class Arrays
{
public static void main(String[] args)
{    */
/* 1 int a[]=new int[3];
int sum=0;
a[0]=1;
a[1]=1;
a[2]=1;
sum=a[0]+a[1]+a[2];
System.out.println("the sum is:"+sum);
}
}
output:
the sum is:3          */


/* 2 int a[]=new int[3];
int sum=0;
int length=a.length;
float avg;
a[0]=4;
a[1]=4;
a[2]=4;
sum=a[0]+a[1]+a[2];
avg=sum/length;
System.out.println("the avg is:"+avg);
}
}
output:
the avg is:4.0      */


/* 3 import java.util.Scanner;
class Arrays
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of  elements");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements"+n);
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the element to find:");
int b=s.nextInt();
int index = -1;
for (int i = 0; i < n; i++) {
if (a[i] == b) {
index = i-1;
System.out.println("the index is:"+i);
}
}
}
}  
output:
D:\29>java Arrays
Enter the number of  elements
5
Enter the elements5
1 2 3 4 5
Enter the element to find:
3
the index is:2   */      


/* 4 import java.util.Scanner;
class Arrays
{
public static void main(String[] args)
{
int n,i;
boolean found=false;
Scanner s=new Scanner(System.in);
System.out.print("Enter the number to search:");
n=s.nextInt();
int a[]={24,21,29,17,3,7,2};
for(i=0;i<a.length;i++)
{
if(a[i]==n)	
{
found=true;
}
}
if(found)
{
System.out.println("the number is specified:");
}
else{
System.out.println("The number is not specified:");
}
}	
}
Output:
Enter the number to search:29
the number is specified:               */


/* 5 import java.util.Scanner;
class Arrays
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
int a[]={10,20,30,40,50,60,70,80,90};
System.out.print("Enter the element to remove from array:");
n=s.nextInt();
int c[]=new int[a.length-1];
for(int i=0,j=0;i<a.length;i++)
{
if(a[i]!=n)
{
 c[j]=a[i];
 j++;
}
}
System.out.println("Array after removal:"); 
for(int val: c )
{
System.out.println(val+ " ");
}
}
}
output:
Enter the element to remove from array:30
Array after removal:
10
20
40
50
60
70
80
90                  */



/* 6 import java.util.Scanner;
class Arrays
{
public static void main(String[] args)
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("Enter the values of an array:"); 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Display the values of an array a:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Display the values of an array b:");
for(i=0;i<n;i++)
{
System.out.println(b[i]=a[i]);
}
s.close();
}
}
output:
Enter the size of an array:2
Enter the values of an array:10 20
Display the values of an array a:
10
20
Display the values of an array b:
10
20               */


/* 7 import java.util.Scanner;
class Arrays
{
public static void main(String args[])
{
int n,position;
Scanner s=new Scanner(System.in);
int a[]={21,22,23,24,25,26,27,28};
System.out.print("Enter the value to insert in an array:");
n=s.nextInt();
System.out.print("Enter the position (0 to " + a.length + ") to insert: ");
position=s.nextInt();
int ar[]=new int[a.length+1];
for(int i=0,j=0;i<ar.length;i++)
{
if(i == position)
{
 ar[i]=n;
}
else{
ar[i]=a[j];
j++;
}
}
System.out.println("After the array insertion:"); 
for(int val: ar)
{
System.out.println(val+ " ");
}
}
}
output:
D:\29>java Arrays
Enter the value to insert in an array:29
Enter the position (0 to 8) to insert: 8
After the array insertion:
21
22
23
24
25
26
27
28
29                  */



/* 8 int arr[]={15,25,35,45,65,55,75,95};
int max=arr[0], min=arr[1];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
max=arr[i];
if(arr[i]<min)
min=arr[i];
}
System.out.println("The max Value is:"+max);
System.out.println("The min value is:"+min);
}
}
output:
The max Value is:95
The min value is:15	*/


/* 9 import java.util.Scanner;
class Arrays{
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.println("Enter number of required values:");
int n = s.nextInt();
int arr[] = new int[n];
for (int i = 0; i < n; i++) {
System.out.println("Enter"+ (i+1)+" element " + ":");
arr[i] = s.nextInt();
}
System.out.println("Original elements:");
for (int i = 0; i < n; i++) {
System.out.println(arr[i]);
}
System.out.println("Reverse elements are:");
for (int i = n - 1; i >= 0; i--) {
System.out.println(arr[i]);
}
}
}
output:
Enter number of required values:
5
Enter 1 element :
1
Enter 2 element :
2
Enter 3 element :
3
Enter 4 element :
4
Enter 5 element :
5
Original elements:
1
2
3
4
5
Reverse elements are:
5
4
3
2
1             */


/* 10 int arr[]={3,1,3,2};
for(int i=0; i<arr.length-1;i++)
{
for(int j=1; j<arr.length; j++)
{
System.out.println("the values are:"+a);
if(arr[i]==arr[j])
{
System.out.println("duplicates are found"+arr[i]);
}
else{
System.out.println("duplicates are not found");}
}
}
}
}                         */

/* 11 import java.util.Scanner;
class Arrays{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter size of first array: ");
int n = s.nextInt();
int a1[] = new int[n];
System.out.println("Enter elements of first array:");
for(int i=0; i<n; i++) {
a1[i] = s.nextInt();
}
System.out.print("Enter size of second array: ");
int m = s.nextInt();
int[] a2 = new int[m];
System.out.println("Enter elements of second array:");
for(int i=0; i<m; i++) {
a2[i] = s.nextInt();
}
System.out.print("Common values are: ");
for(int i=0; i<n; i++) {
for(int j=0; j<m; j++) {
if(a1[i]==a2[j]) {
System.out.print(a1[i] + " ");
break;
}
}
}
}
}
output:
Enter size of first array: 5
Enter elements of first array:
1 2 3 4 5
Enter size of second array: 5
Enter elements of second array:
1 3 5 7 9
Common values are: 1 3 5            */

/* 12 import java.util.Scanner;
class Arrays
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = sc.nextInt();
}
System.out.print("Array without duplicates: ");
for(int i=0; i<n; i++) 
{
boolean isDuplicate = false;
for(int j=0; j<i; j++) {
if(arr[i]==arr[j]) 
{
isDuplicate = true;
break;
}
}
if(!isDuplicate)
{
System.out.print(arr[i] + " ");
}
}
}
}   
output:
Enter size: 5
Enter elements:
1 2 3 4 5
Array without duplicates: 1 2 3 4 5
D:\29>java Arrays
Enter size: 10
Enter elements:
1 2 3 4 5 3 4 5 2 6
Array without duplicates: 1 2 3 4 5 6               */


/* 13,14 int[] a = {30,29,28,27,26,25,24,23,22,21,20};
int c;
for (int i = 0; i < a.length; i++) 
{
for (int j = i + 1; j < a.length; j++) 
{
if (a[i] < a[j]) 
{
c = a[i];
a[i] = a[j];
a[j] = c;
}
}
}
System.out.println("Second largest number is: " + a[1]);
}
}
output:
D:\29>java Arrays
Second largest number is: 29           */



/* 15 int a[] = {12,13,41,44,29,3,33,45,48,18,21};
System.out.println("Even numbers:");
printEven(a);
System.out.println("Odd numbers:");
printOdd(a);
} 
static void printEven(int[] a)
{
for (int num: a) {
if (num % 2 == 0) {
System.out.print(num + " ");
}
} System.out.println();
}
static void printOdd(int[] a) { 
for (int num : a) 
{
if (num % 2 != 0)
{
System.out.print(num + " ");
}
}
System.out.println();
}
}
output:
Even numbers:
12 44 48 18
Odd numbers:
13 41 29 3 33 45 21                  */


/* 16 import java.util.Scanner;
class Arrays
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter size of elements: ");
int n = sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{
arr[i] = sc.nextInt();
}
int min = arr[0], max = arr[0];
for(int i=1; i<n; i++) {
if(arr[i]<min) {
min = arr[i];
}
if(arr[i]>max) 
{
max = arr[i];
}
}
System.out.println("Difference between max & min is: " + (max - min));
}
}
output:
Enter size of elements: 5
Enter elements:
10 20 30 40 50
Difference between max & min is: 40                 */



/* 19 import java.util.Scanner;
class Arrays{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size:");
int n = sc.nextInt(); 
int[] arr = new int[n];
System.out.println("Enter 99 numbers from 1 to 100 (one number is missing):");
int sum = 0;
for (int i=0; i < n; i++) {
arr[i] = sc.nextInt();
sum += arr[i];
}
int total = 100 * 101 / 2;
System.out.println("Missing number: " + (total - sum));
}
}
output:
Enter the size:
7
Enter 99 numbers from 1 to 100 (one number is missing):
 1 2 3 4 5 6 7
Missing number: 5022              */

/* 18 public class Arrays{
public static boolean containsBoth(int[] array, int element1, int element2) {
boolean foundElement1 = false;
boolean foundElement2 = false;
for (int num : array) {
if (num == element1) {
foundElement1 = true;
}
if (num == element2) {
foundElement2 = true;
}
if (foundElement1 && foundElement2) 
{
return true;
}
}
return false;
}
public static void main(String[] args) {
int[] myArray = {1, 3, 5, 7, 9};
System.out.println(containsBoth(myArray, 3, 9)); 
System.out.println(containsBoth(myArray, 3, 4));
}
}        */
































     







