package com.kishor.inheritance;

public class A implements MemberTest{

	  public static void main(String[] args) {
		  System.out.println();
	      C c = new E();
	      D d = new E();
	      c.print(c);
	      d.print(d);
	  }

	}

	class B {
	  public void print(B b){
	    System.out.println("B");
	  }
	}

	class C extends B {
	  public void print(){
	    System.out.println("C");
	  }
	}

	class D extends C {
	  public void print(D d){
	    System.out.println("D");
	  }
	}

	class E extends D {
	  public void print(E e){
	    System.out.println("E");
	  }
	}
