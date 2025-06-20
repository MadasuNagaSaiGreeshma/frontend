/* 1 class Statics
{
static int a=10;
static int b=20;
int c=30;
int d=40;
static
{
System.out.println("Static method 1");
}
static
{
System.out.println("Static method 2");
}
{
System.out.println("Instance method 1");
}
{
System.out.println("Instance method 2");
}
static void add()
{
int a=10;
int b=20;
System.out.println(a+b);
}
static void sub()
{
int a=30;
int b=20;
System.out.println(a-b);
}
void mul()
{
int c=10;
int d=10;
System.out.println(c*d);
}
void div()
{
int c=10;
int d=10;
System.out.println(c/d);
}
public static void main(String[] args)
{
Statics h=new Statics();
h.add();
h.sub();
h.mul();
h.div();
}
}
output:
Static method 1
Static method 2
Instance method 1
Instance method 2
30
10
100
1                                  */



/* 2 class Statics
{
    int a = 7;
    int b = 9;

    static void sta() 
    {
        Statics s = new Statics();  
        System.out.println(s.a);     
        System.out.println(s.b);         
    }

    public static void main(String[] args)
    {   
        System.out.println("Main Method");
        sta(); 
    }
}
output:
Main Method
7
9             */



/* 3 class Statics
{ 
    static int a=29;
    static int b=3;

    void ins()
    {
        System.out.println(a);
    }
    void inst()
    {
        System.out.println(b);
    }
public static  void main(String[]  args)
{
    
System.out.println("Static  Method");

Statics s= new Statics();
s.ins();
s.inst();

}
}

output:
Static  Method
29
3                                      */



/* 4 class Statics
{
    void instance() 
    {
        System.out.println("Instance method ");
    }

    static void staticmethod() 
    {

        Statics s = new Statics();
        s.instance();
    }

    public static void main(String[] args) {
        System.out.println(" Main Method");
        staticmethod();  
    }
}


Output:

Main Method
Instance method                                     */




/* 5 class Statics{
    
    static void a()
     {
        System.out.println("Static main  Method"); 
    }

    void ins() 
    {
        a();
    }

    public static void main(String[] args) {
        Statics s = new Statics();
        s.ins(); 
    }
}

Output:
Static main Method                           */



/* 6 class Statics
{    
    static int a = 100;
    static int b = 200;
    int c = 300;
    int d = 400;

    public static void main(String[] args) {
        System.out.println("Static Variables:");
        System.out.println( a);
        System.out.println(b);

        Statics s = new Statics();

        System.out.println("Instance Variables:");
        System.out.println(s.c );
        System.out.println(s.d);
    }
}


Output:

Static Variables:
100
200
Instance Variables:
300
400                  */





/* 7 class Statics
{
static void a()
    {
        System.out.println("Welcome to");
    }
    void ins()
    {
        System.out.println("SVIET CLG");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method");
        a();
        Statics s=new Statics();
        s.ins();
    }
}

Output:

Main method
Welcome to
SVIET CLG               */





