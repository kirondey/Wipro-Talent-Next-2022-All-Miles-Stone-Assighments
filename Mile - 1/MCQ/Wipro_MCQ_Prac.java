 Q1.public class Test {
	public static void main(String[] args) {
		int no = 10;
		if(no % 2)	/* Line 1 */
		    System.out.println("Even");
		else
		    System.out.println("Odd");
	}
}


A. Compile Time Error 
B. Runtime Error
C. It will print 'Even'
D. It will print 'Odd'                

Ans. A



	  

Q2.public class Test {
	public static void main(String[] args) {
	  while(1)  /* Line 1 */
	    System.out.println("Inside While");
	}
}



A. Compile Time Error 
B. Runtime Error
C. It will print 'Inside While'	

Ans.A





Q3.public class Test {
	public static void main(String[] args) {
		int a = 1;
		switch(a) {
			case 1:
				System.out.println("A");
			case 2:
				System.out.println("B");
			default:
				System.out.println("C");
		}
	}
}


A. Compile Time Error 
B. It will print 'A'
C. It will print 'ABC' 
D. It will print 'AB'	

Ans.C

Q4.
public class Test {
	public static void main(String[] args) {
		int a = 1;
		switch (a) {
			default:
				System.out.println("C");
			case 1:
				System.out.println("A");
			case 2:
				System.out.println("B");
		}
	}
}

A. Compile Time Error 
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'ABC'	

Ans.C

Q5.
public class Test {
	public static void main(String[] args) {
		int a = 1;
		switch (a) {
			case 1,2:  /* Line 1 */
				System.out.println("A");
			case 3:
				System.out.println("B");
			default:
				System.out.println("C");
		}
	}
}

A. Compile Time Error  
B. It will print 'A'
C. It will print 'ABC' 
D. It will print 'AB'

Ans.A

Q6.

public class Test {
	public static void main(String[] args) {
		float a = 1;
		switch(a) {
			case 1:
				System.out.println("A");
			case 3:
				System.out.println("B");
			default:
				System.out.println("C");
		}
	}
}

A. Compile Time Error 
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'ABC'

Ans.A

Q7.
public class Test {
	public static void main(String[] args) {
		int i = 1;
		do while (i > 1)
		  System.out.println("Hai");
		while (i < 1);
	}
}

A. Compile Time Error  
B. No output  
C. It will print 'Hai' 
D. Run Time Error

Ans.B

Q7.
public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)
			i++;
		System.out.println(i);
	}
}

A. Compile Time Error 
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'ABC'

Ans.A.
Q8.

public class Test {
	public static void main(String[] args) {
		System.out.print(10 + 20);
		System.out.print("10" + 20);
		System.out.print("10" + 20 + 30);
	}
}

A. Compile Time Error  
B. 301020102030
C. 30 30 60
D. 30 10 20 10 30

Ans.B

Q9.
public class Test {
	public static void main(String[] args) {
		switch (1) {
			case 1:
			  System.out.print("A");
			case 2:
			  for (int i = 1; i <= 10; i++)
				break;
			case 3:
			  System.out.print("B");
		}
	}
}

A. Compile Time Error 
B. It will print 'AB' 
C. It will print 'A' 
D. It will print 'B'

Ans.B

Q10.
public class Test {
	public static void main(String[] args) {
		int n = 1;
		do {
			n--;
		} while (n > 2);
		System.out.println(n);
	}
}

A. -1  
B. 0 
C. 1
D. 2

Ans.B

Q11.
public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
				switch (i) {
					case 1:
					  System.out.print("A");
					case 2:
					  System.out.print("B");
					case 3:
					  System.out.print("C");
			}
		}
	}
}

A. ABCBCC 
B. ABC
C. Compile Time Error
D. ABCBBC

Ans.A

Q12.
public class Test {
	 public static void main(String[] args) {
		 int a = 10;
		 String s = null;
		 s=(a > 20) ? "small" : (a < 10) ? "big" : "tiny";
		 System.out.println(s);
	 }
}

A. Compile Time Error
B. tiny 
C. small
D. big

s=((a > 20) ? "small" : ((a < 10) ? "big" : "tiny"));
   -------    ------    -----------------------------
   exp1       exp2               exp3


((a < 10) ? "big" : "tiny"));
 --------   ----     -----
  exp31     exp32    exp33


?: -> 2 times
Associativity : right to left
In the absence of brackets how the expression will be bracektized 
that is decided by associativity.

((10/2)*4) =20
L->R

Ans.B



Q13.

public class Test {
	public static void main(String[] args) {
		int x = 100;
		double y = 100.1;
		boolean b = (x = y); /* Line 1 */
		System.out.println(b);
	}
}

A. Compile Time Error 
B. true
C. false
D. null

Ans.A

Q14.
public class Test {
	static boolean b;
	public static void main(String[] args) {
		short hand = 42;
		if (hand < 50 & !b)  /* Line 1 */
			hand++;
		if (hand > 50);  /* Line 2 */
		else if (hand > 40) {
			hand += 7;
			hand++;
		} else
			--hand;
		System.out.println(hand);
	}
}

A. 41
B. 51 
C. 50
D. 42

Ans.B

Q15.
public class Test {
	public static void main(String[] args) {
		boolean bool = true;
		if (bool = false) /* Line 1 */
		{
			System.out.println("A");
		} else if (bool) /* Line 2 */
		{
			System.out.println("B");
		} else if (!bool) /* Line 3 */
		{
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}

A. A 
B. B
C. C 
D. D 

Ans.C


Q16.
public class Test {
	 public static void main(String[] args) {
		  int Output = 10;
		  boolean b1 = false;
		  if ((b1 == true) && ((Output += 10) == 20)) {
				System.out.println("We are equal " + Output);
		  } else {
				System.out.println("Not equal! " + Output);
		  }
	 }
}

A. Compile Time Error  
B. Compilation and output of "We are equal 10"
C. Compilation and output of "Not equal! 20"
D. Compilation and output of "Not equal! 10"


Q17.

public class Test {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for (int z = 0; z < 5; z++) {  z=0,1,2,3,4 -> 5
		  if ((++x > 2) && (++y > 2))  x=6  y=3
                {
				x++;
			}
		}
		System.out.println(x + " " + y);
	}
}

A. 5 2 
B. 5 3
C. 6 3 
D. 6 4

Ans.C

Q18.

public class Test {
	public static void main(String[] args) {
		boolean b = true;
		if (b) {
			System.out.println("Inside If");
			break;
		}
		System.out.println("End");
	}
}

A. Compile Time Error  
B. It will print 'Inside If'
C. It will print 'Inside If' and 'End'
D. It will print 'End'

Q19.

public class Test {
	public static void main(String[] args) {
		int a = 1;
		int b = a++ + ++a + a;        U Got:1 + 3 + 3  a:3
		System.out.println(a+" "+b);
	}
}


A. 4 7 
B. 3 6
C. 3 7 
D. 6 4 

Ans.C


String:
======
Q1.

public class Test {
	String s = "hai";
	public static void main(String[] args) {
		System.out.println(s);
	}
}


A. It will print 'hai'.
B. Compile Time Error 
C. Run Time Error
D. No Output                 

Ans.B  

Q2.
Given the following declarations 

	String s1=new String("Hello") 
	String s2=new String("there"); 
	String s3=new String(); 

Which of the following are legal operations? 


A. s3=s1 + s2; 
B. s3=s1 - s2; 
C. s3=s1 & s2; 
D. s3=s1 && s2; 

Ans.A

Q3.

public class Test {
	public static void main(String[] args) {
		String s = "Java";
		s.concat(" World");
		System.out.print(s);
		s = s.concat(" World");
		System.out.print(s);
	}
}


A. Java World World
B. JavaJava World 
C. Java World Java World
D. Compile Time Error 

Ans.B


Q4.
public class Test {
	public static void main(String[] args) {
	  String s1 = "abc";
	  String s2 = "def";
	  String s3 = s1.concat(s2.toUpperCase()); 
	  System.out.println(s1 + s2 + s3); 
	}
}


A. abcdefabcDEF 
B. abcabcDEFDEF 
C. abcdefabcdef 
D. None of the above
	
Ans.A


Q5.
public class Test {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.print(s1.equals(s2));
		System.out.print(s1==s2);
	}
}


A. true true
B. true false
C. false true
D. true true     

Ans.B


Q6.
public class Test {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		System.out.print(s1.equals(s2));
		System.out.print(s1 == s2);
	}
}


A. true true 
B. false false 
C. true false 
D. false true

Ans.A

Q7.

public class Test {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		System.out.print(s1.equals(s2));
		System.out.print(s1==s2);
	}
}


A. true true
B. true false
C. false true
D. true true 

Ans.B


Q8.
public class Test {
	public static void main(String[] args) {
		String s = "foo";
		Object o = s; /* Line 1 */
		if (s.equals(o)) {
			System.out.print("AAA");
		} else {
			System.out.print("BBB");
		}
		if (o.equals(s)) {
			System.out.print("CCC");
		} else {
			System.out.print("DDD");
		}
	}
}

A. AAACCC 
B. AAADDD 	
C. BBBCCC 	
D. BBBDDD

Ans.A


Q9.
public class Test {

	public static void main(String[] args) {
		int result = 0;
		Test oc = new Test();
		Object o = oc; /* Line 1 */ 
		if (o == oc)
			result = 1;
		if (o != oc)
			result = result + 10;
		if (o.equals(oc))
			result = result + 100;
		if (oc.equals(o))
			result = result + 1000;
		System.out.println(result);
	}
}


A. 101
B. 1101
C. 10
D. 1000



Q10.
public class Test {
	public static void main(String argv[]) {
		Test e = new Test();
	}

	Test() {
		String s = "Java";
		String s2 = "java";
		//place test here{
		   System.out.println("Equal");
		} else {
		  System.out.println("Not Equal");
		  } 	
          }  
    }


A. if(s==s2) 
B. if(s.equals(s2)) 
C. if(s.equalsIgnoreCase(s2)) 
D. if(s.noCaseMatch(s2))


Inheritance
------------
Q1.
class SuperClass{
	SuperClass(){
		System.out.print("A");
	}
}
class SubClass extends SuperClass{
	SubClass(){
		System.out.print("B");
	}
}
public class Test {
	public static void main(String[] args) {
    SubClass obj=new SubClass();		
    }
}


A. Compile Time Error 
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'BA'		                

Ans.C
	  
Q2.

class SuperClass{
	SuperClass(){
		System.out.print("A");
	}
	SuperClass(int a){
		System.out.print("C");
	}   }
class SubClass extends SuperClass{
	SubClass(int a){
		System.out.print("B");
	}   }
public class Test {
	public static void main(String[] args) {
    SubClass obj=new SubClass(50);	}
}


A. Compile Time Error 
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'ABC'

Ans.C



Q3.
class SuperClass{
	SuperClass(){
		System.out.print("A");
	}
	SuperClass(int a){
		System.out.print("C");
	} 
}
class SubClass extends SuperClass{
	SubClass(int a){
		super(10);
		System.out.print("B");
	} 
}
public class Test {
	public static void main(String[] args) {
    SubClass obj=new SubClass(50);
 }
}


A. It will print 'CB'  
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'BA'

Ans.A

Q4.

public class Test {
	Test(){
		super();
		System.out.println("A");
	}
	public static void main(String[] args) {
    Test obj=new Test();	
    }
}


A. Compile Time Error 
B. It will print 'A'  
C. Run Time Error
D. No Output   

Ans.B


Q5.
class SuperClass{
	SuperClass(){
		System.out.print("A");
	}
	SuperClass(int a){
		System.out.print("C");
	}  
}
class SubClass extends SuperClass{
	SubClass(int a){
		System.out.print("B");
		super(10);
	}  
}
public class Test {
	public static void main(String[] args) {
    SubClass obj=new SubClass(50);
 }
}

A. Compile Time Error  
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'BA'

Ans.A

Q6.
public class Test {
	void myMethod(){
		super();
		System.out.println("A");
	}
	public static void main(String[] args) {
    Test obj=new Test();	
    }
}


A. Compile Time Error 
B. It will print 'A'  
C. Run Time Error
D. No Output		

Ans.A

Q7.
class SuperClass{
	private SuperClass(){
		System.out.print("A");
	}
	SuperClass(int a){
		System.out.print("C");
	} 
}
class SubClass extends SuperClass{
	SubClass(int a){
		System.out.print("B");
	} 
 }
public class Test {
	public static void main(String[] args) {
    SubClass obj=new SubClass(50); 
 } 
}

A. Compile Time Error  
B. It will print 'A'
C. It will print 'AB' 
D. It will print 'BA'

Ans.A

Q8.

public class Test {
	Test(int a){
		System.out.print("A");
	}
	Test(){
		super();
		this();
	}
	public static void main(String[] args) {
   	Test obj=new Test(); 
  }
 }


A. Compile Time Error 
B. It will print 'A'  
C. Run Time Error
D. No Output   

Ans.A

Q9.
class SuperClass{
	void myMethod(){
		System.out.print("A");
	} 
}
class SubClass extends SuperClass{
	void myMethod(){
		System.out.print("B");
	} 
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    obj.myMethod();  
  } 
}



A. Compile Time Error  
B. It will print 'A'
C. It will print 'B' 
D. It will print 'AB'

Ans.C

Q10.
class SuperClass{
	int a=10;
}
class SubClass extends SuperClass{
	int a=20;
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    System.out.println(obj.a);
    }
}


A. Compile Time Error 
B. It will print '10'  
C. Run Time Error
D. It will print '20'

Ans.B

Q11.
class SuperClass{
	String s=myMethod();
	String myMethod(){
		return "A";
	}
 }
class SubClass extends SuperClass{
	String myMethod(){
		return "B";
	} 
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    System.out.println(obj.s);
   }
}


A. Compile Time Error  
B. It will print 'A'
C. It will print 'B' 
D. Run Time Error	

Ans.C

Q12.
class SuperClass{ 	
}
class SubClass extends SuperClass{	
}
public class Test {
	public static void main(String[] args) {
    SubClass obj=new SuperClass();	
    }
}


A. Compile Time Error  
B. No Error
C. Run Time Error
D. No Output

Ans.A

Q13.
class SuperClass{
	String myMethod(){
		return "B";
	}
}
class SubClass extends SuperClass{
	void myMethod(){
	    System.out.println("A");
	}
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    obj.myMethod();   
 }
}


A. Compile Time Error  
B. It will print 'A'
C. It will print 'B' 
D. Run Time Error

Ans.A
/*
Object level type casting

Q14.
class SuperClass{	
}
class SubClass extends SuperClass{	
}
public class Test {
	public static void main(String[] args) {
    SubClass obj=(SubClass)new SuperClass();	
    }
}


A. Compile Time Error 
B. No Error
C. Run Time Error   
D. No Output	


*/

Q15.
class SuperClass{
	protected void myMethod(){
		System.out.println("A");
	}
}
class SubClass extends SuperClass{
	void myMethod(){
	    System.out.println("B");
	}
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    obj.myMethod();  
 }
}


A. Compile Time Error  
B. It will print 'A'
C. It will print 'B' 
D. Run Time Error

Ans.A

Q16.

class SuperClass{
	final void myMethod(){
		System.out.println("A");
	}
}
class SubClass extends SuperClass{
	void myMethod(){
	    System.out.println("B");
	}
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    obj.myMethod();  
 }
}


A. Compile Time Error  
B. It will print 'B'
C. Run Time Error  
D. It will print 'A'

Ans.A

Q17.
class SuperClass{
	static void myMethod(){
		System.out.println("A");
	}
}
class SubClass extends SuperClass{
	void myMethod(){
	    System.out.println("B");
	}
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    obj.myMethod(); 
  }
}


A. Compile Time Error  
B. It will print 'A'
C. It will print 'B' 
D. Run Time Error

Ans.A

Q18.
final class SuperClass{
	void myMethod(){
		System.out.println("A");
	}
}
class SubClass extends SuperClass{
	void myMethod(){
	    System.out.println("B");
	}
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    obj.myMethod();
 }
}


A. Compile Time Error  
B. It will print 'B'
C. Run Time Error  
D. It will print 'A'

Ans.A

Q19.
class SuperClass{
	static void myMethod(){
		System.out.println("A");
	}
}
class SubClass extends SuperClass{
	static void myMethod(){
	    System.out.println("B");
	}
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    obj.myMethod();
 }
}


A. Compile Time Error  
B. It will print 'A' 
C. It will print 'B' 
D. Run Time Error	

Ans.B

Q20.
class SuperClass{
	int b=20;
}
class SubClass extends SuperClass{
	int a=10;
}
public class Test {
	public static void main(String[] args) {
    SuperClass obj=new SubClass();	
    System.out.println(obj.a);
 }
}


A. Compile Time Error  
B. It will print 'B'
C. Run Time Error  
D. It will print 'A'

Ans.A


Abstract class:
===============
Q1.
abstract class Test{
	void show();
}
public class Test extends Test{
    void show(){
    	System.out.println("Show");
    }
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show();
 }
}


A. Compile Time Error 
B. It will print 'Show'
C. No Output
D. Runtime Error                


Ans. A

	  
Q2.

abstract class Test{
	final abstract void show();
}
public class Test extends Test{
    void show(){
    	System.out.println("Show");
    }
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show();
 }
}


A. Compile Time Error  
B. It will print 'Show'
C. No Output 
D. Runtime Error

Ans.A

Q3.
abstract class Demo{
	abstract void show();
}
public class Test extends Demo{
    void show(){
    	System.out.println("Show");
    }
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.show();
  }
}


A. Compile Time Error 
B. It will print 'Show'
C. No Output
D. Runtime Error	

Ans. A


Q4.
abstract class Demo{
	abstract void show();
}
public class Test extends Demo{
    void show(){
    	System.out.println("Show");
    }
	public static void main(String[] args) {
		Demo obj=new Test();
		obj.show();
 }
}

A. Compile Time Error  
B. It will print 'Show' 
C. No Output 
D. Runtime Error
	
Ans.B


Q5.
abstract class Demo{
	abstract void show1();
	abstract void show2();
}
public class Test extends Demo{
    void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		Demo obj=new Test();
		obj.show1();
 }
}


A. Compile Time Error 
B. It will print 'Show'
C. No Output
D. Runtime Error

Ans.A

Q6.
abstract class Demo{	
}
public class Test extends Demo{
    void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show1();
	}
  }


A. Compile Time Error  
B. It will print 'Show1' 
C. No Output 
D. Runtime Error

Ans. B

Q7.

abstract class Test{
	abstract void show1();
}
abstract class Test1 extends Test{ }
public class Test extends Test1{
    void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show1();
 }
}


A. Compile Time Error 
B. It will print 'Show1' 
C. No Output
D. Runtime Error

Ans.B


Q8.
abstract class Test{
	static abstract void show1();
}
public class Test extends Test{
    void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show1();
	}
 }


A. Compile Time Error  
B. It will print 'Show1' 
C. No Output 
D. Runtime Error

Ans.A

Q9.
abstract class Test{
	public abstract void show1();
}
public class Test extends Test{
    void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show1();
 	}
 }


A. Compile Time Error 
B. It will print 'Show1' 
C. No Output
D. Runtime Error

Ans.A

Q10.
abstract class Test{
	abstract void show1();
}
abstract class Test1{ }
public class Test extends Test , Test1{
    void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show1();
   }
 }


A. Compile Time Error  
B. It will print 'Show1' 
C. No Output 
D. Runtime Error

Ans.A

Q11.

public abstract class Test{
	abstract void show2();
    void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		Test obj=null;
		obj.show1();
	}
 }


A. Compile Time Error 
B. It will print 'Show1' 
C. No Output
D. Runtime Error 

Ans.D

Q12.
abstract class Base{ 
    abstract public void myfunc(); 
    public void another(){ 
		System.out.println("Another method"); 
    }  
} 
public class Test extends Base{ 
    public static void main(String argv[]){ 
		Test a = new Test(); 
		a.amethod(); 
    } 
    public void myfunc(){ 
         System.out.println("My Func"); 
    } 
    public void amethod(){ 
		myfunc();
   }
 } 

A. Compile Time Error 
B. It will print 'My Func'  
C. It will print 'Another method'  
D. No Output
 
Ans.B


Interface
==========
Q1.

interface MyInterface{
	int a=10; 
	void show();
}
public class Test implements  MyInterface{
	public void show() {
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show();
	}
}

A. Compile Time Error 
B. 10
C. 11
D. Runtime Error                

Ans.A	  

Q2.
interface MyInterface{
	void show();
}
public class Test implements  MyInterface{
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show();
	}
}

A. Compile Time Error  
B. It will print 'Show'
C. No Output 
D. Runtime Error

Ans.A

Q3.
interface One{
	void show1();
}
interface Two{
	void show2();
}
public class Test implements  One,Two{
	public void show1(){
		System.out.println("Show1");
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show1();
	}
}


A. Compile Time Error 
B. It will print 'Show'
C. No Output
D. Runtime Error	


Ans.A

Q4.
interface MyInterface{
	int a=20;
}
public class Test implements  MyInterface{
	public void show1(){
		System.out.println(MyInterface.a);
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show1();
	}
}

A. Compile Time Error  
B. It will print '20' 
C. No Output 
D. Runtime Error
	
Ans.B

Q5.
interface MyInterface{
	void Show();
}
public class Test implements  MyInterface{
	void Show(){
		System.out.println("Show");
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.Show();
	}
}


A. Compile Time Error 
B. It will print 'Show'
C. No Output
D. Runtime Error

Ans.A

Q6.
final interface MyInterface{
	void Show();
}
public class Test implements  MyInterface{
	public void Show(){
		System.out.println("Show");
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.Show();
	}
}


A. Compile Time Error  
B. It will print 'Show' 
C. No Output 
D. Runtime Error

Ans.A

Q7.

interface MyInterface{
	abstract void show1();
}
abstract class Demo implements MyInterface{ }
public class Test extends Demo{
    public void show1(){
    	System.out.println("Show1");
    }
	public static void main(String[] args) {
		MyInterface obj=new Test();
		obj.show1();
 }
}

A. Compile Time Error 
B. It will print 'Show1' 
C. No Output
D. Runtime Error

Ans.B


Q8.
interface Inter1{
	int a=10;
}
interface Inter2{
	int a=20;
}
public class Test implements Inter1,Inter2{
   public static void main(String[] args) {
	   Test obj=new Test();
		System.out.println(obj.a);
 }
}

A. Compile Time Error  
B. 10 
C. 20 
D. Runtime Error

Ans.A

Q9.
interface MyInterface1{
	int a=10;
}
interface MyInterface2 extends MyInterface1{
	int a=20;
}
public class Test implements MyInterface2{
   public static void main(String[] args) {
	   Test obj=new Test();
		System.out.println(obj.a);
 }
}

A. Compile Time Error 
B. 10
C. 20 
D. Runtime Error

Ans.C

Q10.
interface MyInterface{

}
abstract class Demo implements MyInterface{
    
	abstract void show();
}
public class Test extends Demo{
    void show(){
		System.out.println("Show");
	}
   public static void main(String[] args) {
	   MyInterface obj=new Test();	
	   obj.show();
 }
}


A. Compile Time Error  
B. It will print 'Show' 
C. No Output 
D. Runtime Error

Ans.A

Q11.
interface MyInterface{
	int a=10;
	MyInterface(){
		System.out.println(a);	
	}
}
public class Test implements MyInterface{
   public static void main(String[] args) {
	   MyInterface obj=new Test();		
 }
}

A. Compile Time Error  
B. It will print '10' 
C. No Output 
D. Runtime Error

Ans.A

Q12.
interface One{
	int a=10;
}
interface Two{
	int a=20;
}
interface Three extends One,Two{
}
public class Test implements Three{
    public static void main(String[] args) {
       Test obj=new Test();
	  // Your Text	 
 }
}
Select the option to paste instead of '//Your 
Text' then it should display the value of 'a'
from Two interface.


A. System.out.println(obj.a);
B. System.out.println(Two.a); 
C. System.out.println(Three.a);
D. Not Possible


Exception
=========
Q1.
public class Test{
    public static void main(String[] args) {
    	try 
    	{ 
    	    int x = 0; 
    	    int y = 5 / x; 
    	} 
    	catch (Exception e) 
    	{
    	    System.out.println("Exception"); 
    	} 
    	catch (ArithmeticException ae) 
    	{
			System.out.println(" Arithmetic Exception"); 
    	} 
    	System.out.println("finished");
 }
}


A.finished	
B.Exception
C.Compilation fails.
D.Arithmetic Exception
               
Ans.C

Q2.
public class Test{
    public static void main(String[] args) {
    	try 
    	{ 
    	  int y = 5 / 0; 
    	  System.out.print("Try"); 
    	} 
    	catch (ArithmeticException ae) 
    	{
    	System.out.print("Arithmetic Exception"); 
    	}
    	catch (Exception e) 
    	{
    	System.out.print(" Exception"); 
    	} 
    	System.out.print(" finished");
 }
}


A.Try Arithmetic Exception finished	
B.Exception finished
C.Arithmetic Exception finished
D.Try Exception finished
   
Ans.C

Q3.
public class Test {  
    public static void main(String [] args) {
        try {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) {
            System.out.print("B");  
        } 
        finally {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() {
        throw new Error(); 
    } 
}


A.ABCD
B.Compilation fails.
C.'C' is printed before exiting with an error message.
D.'BC' is printed before exiting with an error message.

Ans.C


Q4
public class Test {  
    public static void main(String [] args) {
        try {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) {
            System.out.print("B");  
        } 
        catch (Error ex) {
            System.out.print("E");  
        }
        finally {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() {
        throw new Error(); 
    } 
}


A.AECD
B.Compilation fails.
C.ECD 
D.ABCD
   
public class Test {  
    public static void main(String [] args) {
        try {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Throwable ex) {
            System.out.print("B");  
        } 
        catch (Error ex) {
            System.out.print("E");  
        }
        finally {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() {
        throw new Error(); 
    } 
}


A.AECD
B.Compilation fails. 
C.ECD 
D.ABCD

Ans.B
      



public class Test {  
    public static void main(String [] args) {
        try {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Error ex) {
            System.out.print("E");  
        }
        catch (Throwable ex) {
            System.out.print("B");  
        } 
        finally {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() {
        throw new Error(); 
    } 
}

A.AECD 
B.Compilation fails. 
C.ECD 
D.ABCD

Ans.B

Java Collections:
=================
1. Which of these packages contain all the collection classes?

a) java.lang
b) java.util 
c) java.net
d) java.awt

Ans.B

Q2.

Which of these interface is not a part of Java's  collection framework?

a) List
b) Set
c) SortedMap
d) SortedList  

Ans.D

Q3.

Which collection class allows you to grow or 
shrink its size and provides indexed access to its
elements, but whose methods are not synchronized? 

A. java.util.HashSet	
B. java.util.LinkedHashSet
C. java.util.List	
D. java.util.ArrayList  

Ans. D


Q4.

Which interface provides the capability to store 
objects using a key-value pair? 

A. Java.util.Map  	
B. Java.util.Set
C. Java.util.List	
D. Java.util.Collection

Ans. A

/*
Q5.

import java.util.Arrays;
public class Test {
	public static void main(String args[]) {
		int array[] = new int [5];
		for (int i = 5; i > 0; i--)
			array[5-i] = i;
		Arrays.fill(array, 1, 4, 8);
		for (int i = 0; i < 5 ; i++)
		  System.out.print(array[i]);
		}
	}

A. 12885
B. 12845
C. 58881  
D. 54881

*/

Q6.

import java.util.Vector;
public class Test {
	public static void main(String args[]) {
		Vector obj = new Vector(4,2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		obj.removeAllElements();
		System.out.println(obj.isEmpty());
		}
	}


A. true   
B. false
C. 1
D. 0

Ans.A

Q7.

import java.util.Stack;
public class Test {
	public static void main(String args[]) {
		Stack obj = new Stack();
		obj.push(new Integer(3));
		obj.push(new Integer(2));
		obj.pop();
		obj.push(new Integer(5));
		System.out.println(obj);
		}
	}


A. [3, 5]  
B. [3, 2]
C. [3, 2, 5]
D. [3, 5, 2]

Ans. A

Q8.

Which of these interface declares core method that 
all collections will have?

a) set
b) EventListner
c) Comparator
d) Collection  

Ans.D

Q9.

Which of these interface handle sequences?

a) Set
b) List  
c) Comparator
d) Collection

Ans.B


Q10.
Which of these interface must contain a unique
element?
a) Set  
b) List
c) Array
d) Collection

Ans.A

Q11.


import java.util.TreeMap;
public class Test {
	public static void main(String args[]) {
	  TreeMap obj = new TreeMap();
	  obj.put("A", new Integer(1));
	  obj.put("B", new Integer(2));
	  obj.put("C", new Integer(3));
	  System.out.println(obj.entrySet());
	  }
	}


A. [A, B, C]
B. [1, 2, 3]
C. {A=1, B=2, C=3}
D. [A=1, B=2, C=3]  


Q12.

Which of these return type of hasNext() method of 
an iterator?

a) Integer
b) Double
c) Boolean  
d) Collections Object

Ans.C

Q13.

Which of these methods is used to obtain an
iterator to the start of collection?

a) start()
b) begin()
c) iteratorSet()
d) iterator()  

Ans.d 

Q14.

Which of these iterators can be used only with List?

a) Setiterator
b) ListIterator  
c) Literator
d) None of the mentioned


Ans. b

Q15.
import java.util.*;
public class Test {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));
		Iterator i = list.iterator();
		Collections.reverse(list);
		while(i.hasNext())
		 System.out.print(i.next() + " ");
		}
	}


A. 2 8 5 1
B. 1 5 8 2   
C. 2
D. 2 1 8 5

Ans.B

Q16.
import java.util.*;
public class Test {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));
		Iterator i = list.iterator();
		Collections.sort(list);
		while(i.hasNext())
		 System.out.print(i.next() + " ");
		}
	}


A. 2 8 5 1
B. 1 2 5 8  
C. 2
D. 2 1 8 5

Ans.B 

Garbage Collection
===================

Q1.Which of the following is the correct syntax for 
suggesting that the JVM performs garbage 
collection

 
1) System.free(); 
2) System.setGarbageCollection(); 
3) System.out.gc(); 
4) System.gc(); 
5) Runtime.getRuntime().gc();  


Ans. 4 and 5


Q2.Which operator is used by Java run time 
implementations to free the memory of an object 
when it is no longer needed?

A. delete
B. free
C. new
D. None of the mentioned  

Ans. d

Q3.
Which function is used to perform some action when 
the object is to be destroyed? 

A. finalize() 
B. delete()
C. main()
D. None of the mentioned 

Ans.a 

==================================================================================
Q1.

Arrays
======
Which are valid array declaration?

int a[]={1,2,3}; /* Line 1 */
int a[3]={1,2,3}; /* Line 2 */
int a[]=new int[3]; /* Line 3 */
int a[3]=new int[3]; /* Line 4 */


A. Line 1 and 3 
B. Line 2 and 4
C. Line 1,2 and 3
D. All the above
                
Ans. A
	  
Q2.
public class Test {
  public static void main(String argv[]) {
  int anar[] = new int[] { 1, 2, 3 }; /* Line 1 */ 
  System.out.println(anar[1]);
  }
}


A. It will print '2' 
B. It will print '1'
C. Compile Time Error
D. Runtime Error

Ans. A

Q3.
public class Test {
	public static void main(String argv[]) {
		int a[] = { 10, 20, 30 }, b[];
		b = a; /* Line 1 */ 
		System.out.println(b[2]);
	}
}


A. 30 
B. NaN
C. An Error at 'b=a'
D. 0  

Ans. A

Q4.
public class Test {
	public static void main(String argv[]) {
		int anar[] = new int[5];
		System.out.println(anar[0]);
	}
}


A. It will print '0' 
B. It will print '5'
C. It will print 'null'
C. Runtime Error
	
Ans. A

Q.5
What will be the output?
  Just assume that I am going to run like this 
  'java Test one two'

public class Test {
	public static void main(String argv[]) {
		System.out.println(argv[2]);
	}
}


A. null
B. No output
C. Runtime Error (ArrayIndexOutOfBoundsException)  
D. Compile Time Error		

Ans. A

Q.6
public class Test {
	public static void main(String argv[]) {
	  int arr[] = new int[10];
	  int i = 5;
	  arr[i++] = i++ + i++;
	  System.out.print(arr[5] + ":" + arr[6]);
	}
}


A. It will print '13 : 0' 
B. It will print ' 0 : 13'
C. It will print '13 : 13'
C. It will print '14 : 14'

Ans. A

Q7.
public class Test {
	void myMethod(int arr[]) {
		arr[0] = 10;	}
	public static void main(String args[]) {
	 int[] small = { 1, 2, 3 };
	 new Test().myMethod(small); /* Line 1 */
	 System.out.println(small[0]); 	
   }  
 }


A. 0
B. 1
C. 10 
D. Compile Time Error




Q8.
public class Test {
	public static void main(String argv[]) {
	  int arr[] = new int[10];
	  int i = 5;
	  arr[i++] = i++ + i++;
	  System.out.print(arr[5] + ":" + arr[6]);	
   }
}


A. It will print '13 : 0' 
B. It will print ' 0 : 13'
C. It will print '13 : 13'
C. It will print '14 : 14'


Java Blocks
============
public class Test {
	static void main() {
		System.out.print("A");
	}

	public static void main(String[] args) {
		main();
		System.out.print("B");
	}
}

A. It will print 'A B'  
B. It will print 'A'
C. It will print 'B'
D. Compile Time Error                

	  

public class Test {
	public static void main(String[] args) {
		Test p = new Test();
		p.start();
	}

	void start() {
		boolean b1 = false;
		boolean b2 = fix(b1);
		System.out.println(b1 + " " + b2);
	}

	boolean fix(boolean b1) {
		b1 = true;
		return b1;
	}
}


A. true true
B. true false
C. false true 
D. false false




public class Test {
	public static void main(String[] args) {
		Test s = new Test();
		s.start();	}
	void start() {
	 int a = 3; int b = 4;
	 System.out.print(" " + 7 + 2 + " ");
	 System.out.print(a + b);
	 System.out.print(" " + a + b + " ");
	 System.out.print(foo() + a + b + " ");
	 System.out.println(a + b + foo());
	}
	String foo() { return "foo"; }
}


A. 9 7 7 foo 7 7foo
B. 72 7 34 foo34 7foo 
C. 9 7 7 foo34 34foo
D. 72 34 34 foo34 34foo 




public class Test {
	public int aMethod() {
		static int i = 0;  /* Line 1 */
		i++;
		return i;
	}
	public static void main(String args[]) {
		Test test = new Test();
		test.aMethod();
		int j = test.aMethod();
		System.out.println(j);
	}
}


A. Compile Time Error 
B. 0
C. 1 
D. 2           



public class Test {
	static int s;
	public static void main(String[] args) {
		Test p = new Test();
		p.start();
		System.out.println(s);
	}
	void start() {
		int x = 7;
		twice(x);
		System.out.print(x + " ");
	}
	void twice(int x) {
		x = x * 2;
		s = x;
	} 
}


A. 7 7
B. 7 14 
C. 14 0
D. 14 14




public class Test {
	void Test() {
	   System.out.println("Am I Constructor");
	}

	public static void main(String[] args) {
		Test obj = new Test();
	}
}


A. No output 
B. Compile Time Error
C. It will print 'Am I Constructor' 
D. Runtime Error       




public class Test {
	static int j;
	static void methodA(int i) {
	 boolean b;
	 do {
	  b = i < 10 | methodB(4); /* Line 1 */
	  b = i < 10 || methodB(8); /* Line 2 */
	   } while (!b);
	}
	static boolean methodB(int i) {
		j += i;
		return true;
	}
	public static void main(String[] args) {
		methodA(0);
		System.out.println(j);
	}
 }


A. 0
B. 4 
C. 8
D. 12                



public class Test {
	Test() {
		System.out.print("A");
		this(5); /* Line 1 */
	}
	Test(int i) {
		System.out.print(i);
	}
	public static void main(String[] args) {
		Test obj = new Test();
	}
}


A. Compile Time Error 
B. It will print 'A5'
C. It will print '5A' 
D. Runtime Error       




public class Test {
	Test() {
		System.out.print("A");
	}
	{
		System.out.print("B");
	}
	public static void main(String[] args) {
		Test obj = new Test();
	}
}



A. AB
B. BA 
C. Compile Time Erro
D. No Output 




public class Test {
	Test() {
		System.out.print("A");
	}
	{
		System.out.print("B");
	}
	public static void main(String[] args) {
		Test obj1 = new Test();
		Test obj2 = new Test();
	}
}


A. BABA 
B. BAA
C. ABAB 
D. A	       




public class Test {
	static {
		System.out.print("A");
	}
	public static void main(String[] args) {
		System.out.print("B");
	}
}


A. AB 
B. BA 
C. Compile Time Error
D. No Output



public class Test {
	int myMethod() {
	  return 1;
	  System.out.println("A"); /* Line 1 */
	}
	public static void main(String[] args) {
		new Test().myMethod();
	}
}


A. Compile Time Error 
B. No output
C. It will print 'A' 
D. Runtime Error