/*
  Jason Chua
  APCS2 pd5
  HW22 -- Standardization
  2016-03-31

/*****************************************************
 * skeleton for class Latkes
 * Implements stack of Strings using array as underlying container.
 * new in Version 2: typed for generics
 *****************************************************/
import java.util.ArrayList;

public class ALStack<T> implements Stack<T> {

    private ArrayList<T> _stack;
    private int _stackSize;


    //constructor
    public ALStack() {
        _stack = new ArrayList<T>();
        _stackSize = 0;
    }

    //overloaded constructor allows for intial capacity declaration
    public ALStack( int size ) {
        this();
        _stack = new ArrayList<T>(size);
    }

    public boolean isEmpty() {
        return _stackSize == 0;
    }

    public boolean isFull() {
        return _stackSize == _stack.size();
    }

    public T peek() {
        if (isEmpty())
            return null;
        return _stack.get(_stackSize-1);
    }

    public T pop() {
        if (isEmpty())
            return null;
        T ret = _stack.remove(_stackSize-1);
        _stackSize--;
        return ret;
    }

    public void push(T x) {
        _stack.add(x);
        _stackSize++;
    }

    //main method for testing
    public static void main( String[] args ) {


        Latkes<String> tastyStack = new Latkes<String>(10);
        tastyStack.push("aoo");
        tastyStack.push("boo");
        tastyStack.push("coo");
        tastyStack.push("doo");
        tastyStack.push("eoo");
        tastyStack.push("foo");
        tastyStack.push("goo");
        tastyStack.push("hoo");
        tastyStack.push("ioo");
        tastyStack.push("joo");
        tastyStack.push("coocoo");
        tastyStack.push("cachoo");
        //cachoo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //coocoo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //joo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //ioo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //hoo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //goo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //foo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //eoo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //doo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //coo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //boo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //aoo
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        //stack empty by now; SOP(null)
        System.out.println( "peek: " + tastyStack.peek() );
        System.out.println( "pop: " + tastyStack.pop() );
        System.out.println( tastyStack.pop() );
        /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }//end main()

}//end class Latkes
