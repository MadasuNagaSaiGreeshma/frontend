class Loops
{
public static void main(String[] args)
{  
/* 1 for (int i=0;i<10;i++) {
System.out.println("Bright IT Career");
}
}
}
output:
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career*/

/* 2 int i = 1;
while(i <= 20) {
System.out.println(i);
i++;
}    
}
}
output:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20*/

/* 3 int a = 10;
int b = 10;
int c = 5;
if (a == b)
{
System.out.println("a is equal to b"); 
}
if (a == c)
{
System.out.println("a is equal to c");
}
}
}
output:
a is equal to b*/

/* 4 int n = 20;  
System.out.println("Odd Numbers up to " + n + ":");
for (int i = 1; i <= n; i++) {
if (i % 2 != 0) { 
System.out.print(i + " ");
}
}
System.out.println("\nEven Numbers up to " + n + ":");
for (int i = 1; i <= n; i++) {
if (i % 2 == 0) {
System.out.print(i + " ");
}
}
}
}
output:
Odd Numbers up to 20:
1 3 5 7 9 11 13 15 17 19
Even Numbers up to 20:
2 4 6 8 10 12 14 16 18 20*/

/* 5 import java.util.Scanner;
public class Loops{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter the first number: ");
int num1 = s.nextInt();
System.out.print("Enter the second number: ");
int num2 = s.nextInt();
System.out.print("Enter the third number: ");
int num3 = s.nextInt();
int largest;
if (num1 >= num2 && num1 >= num3) {
largest = num1;
} 
else if (num2 >= num1 && num2 >= num3) {
largest = num2;
        } else {
largest = num3;
        }
System.out.println("The largest number is: " + largest);
s.close();
}
}
output:
Enter the first number: 10
Enter the second number: 20
Enter the third number: 30
The largest number is: 30*/

/* 6 int number = 10; 
System.out.println("Even numbers between 10 and 100:");
while (number <= 100) 
{ 
if (number % 2 == 0) 
{ 
System.out.println(number); 
}
number++;         
}
}
}
output:
Even numbers between 10 and 100:
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100*/

/* 7 int i = 1; 
do 
{
System.out.println(i);            
i++;         
} 
while (i <= 10); 
}
}
output:
1
2
3
4
5
6
7
8
9
10*/

 
/* 8 import java.util.Scanner;
public class Loops
{
public static void main(String args[])
{
int n,i,rem,sum= 0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
i = n;
while (n > 0)
{
rem = n % 10;
sum += rem*rem*rem;
n /= 10;
}
if(i == sum){
System.out.println(i +"is an Armstrong number.");
}else{
System.out.println(i +"is not an Armstrong number.");}
}
}
output:
Enter the number:
153
153 is an Armstrong number.   */


/* 12 import java.util.Scanner;
public class Loops {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter gender (M/F):");
char genderChar = s.next().charAt(0); 
switch (genderChar) {
case 'M':
case 'm':
System.out.println("Male");
break;
case 'F':
case 'f':
System.out.println("Female");
break;
default:
System.out.println("Transgender:");
break;
} 
}
}
output:
Enter gender (M/F): f
Female
Enter gender (M/F): m
Male */

/* 10 import java.util.Scanner;
public class Loops{
public static void main(String args[])
{
int n ,i,count=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n % i==0){
count++;
}
}
if(count==2)
{
System.out.println( n +  "is a prime");
}
else{
System.out.println(n +  "is not a prime");
}
}
}
output:
Enter the value of n:3
3is a prime

D:\29>java Loops
Enter the value of n:6
6is not a prime             */

/* 13 int a=10;
int b=20;
int c=30;
if((a>b)&&(a>c))
{
System.out.println("a is largest");
}
else if((b>c)&&(b>a)){
System.out.println("b is largest");
}
else{
System.out.println("c is largest");
}
}
}
output:
c is largest   */

/* 11 import java.util.Scanner;
public class Loops
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
switch(n%2)
{
case 0:
System.out.println(n + "is even number");
break;
case 1:
System.out.println(n + "is odd number");
break;
default:
System.out.println("Invalid Input");
}
s.close();
}
}
output:
Enter the value of n:
12
12is even number

D:\29>java Loops
Enter the value of n:
15
15is odd number       */

/* 10 import java.util.Scanner;
public class Loops
{
public static void main(String args[])
{
int n,i,reversed=0,digit;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
i=n;
while(n>0)
{
digit=n%10;
reversed=(reversed*10)+digit;
n=n/10;
}
if(i==reversed)
{
System.out.println(i+ "is a palindrome number");
}
else
{
System.out.println(i+ "is not a palindrome number");
}
}
}
output:
Enter the value of n:
191
191is a palindrome number       */




