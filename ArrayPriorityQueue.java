//Irene Lam
//APCS2 pd5
//HW#32 -- Getting Past the Velvet Rope
//2017-04-20

import java.util.*;

public class ArrayPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {
    private ArrayList<T> _data = new ArrayList<>();
    
    public void add(T str) {
	//int newID, int priority, String newUser, String newProblem
	if (isEmpty())
	    _data.add(str);
		else {
		    boolean placed = false;
		    int low = 0;
		    int high = _data.size();
		    while (low <= high) {
			int middle = (low + high) / 2;
			
			if (high == low) {
			    _data.add(low, str);
			    placed = true;
			    break;
			}
			if (str.compareTo(_data.get(middle)) == 0 ) {
			    _data.add(middle, str);
			    placed = true;
			    break;
			}
			if (str.compareTo(_data.get(middle)) > 0)
			    low = middle + 1;
			if (str.compareTo(_data.get(middle)) < 0)
			    high = middle;
		    }
		    if (!placed)
			_data.add(str);
		}
    }
    
    public boolean isEmpty() {
	return _data.size() == 0;
    }
    
    public T peekMin() {
	return isEmpty() ? null : _data.get(0);
    }
    
    public T removeMin() {
        return isEmpty() ? null : _data.remove(0);
    }
    
    public String toString() {
	String ans = "";
	for (T i : _data)
	    ans += i;
	return ans;
    }
    
    /*
      public static void main(String[] args) {
      ArrayPriorityQueue test = new ArrayPriorityQueue();

      test.add(1);
      test.add(1);
      test.add(3);
      test.add(0);
      
      System.out.println(test);
      System.out.println("peekMin = " + test.peekMin());
      System.out.println("removeMin = " + test.removeMin());
      System.out.println(test);
      
      System.out.println("removeMin = " + test.removeMin());
      System.out.println(test);
      
      System.out.println("removeMin = " + test.removeMin());
      System.out.println(test);
      
      System.out.println("removeMin = " + test.removeMin());
      System.out.println(test);
      
      System.out.println("peekMin = " + test.peekMin());
      
      }
    */
}
