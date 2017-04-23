//Team VIP
//Chester Huang, Irene Lam, Jason Lam
//APCS2 pd5
//Lab#03 - RUVIP?
//2017-04-24

import cs1.Keyboard;

import java.util.*;

public class HelpDesk {
    //Instance Variables
    private ArrayPriorityQueue _data; //Queue of all tickets that have yet to be processed
    private ArrayList<Integer> _ID; //List of all ID's (to ensure a unique ID)
    
    //Constructor
	public HelpDesk() {
	    _data = new ArrayPriorityQueue();
	    _ID = new ArrayList<>();
	}
    
    public void addTicket() {
	//ID of user
	int newID = (int) (Math.random() * 100000000);
	while (_ID.contains(newID))
	    newID = (int) (Math.random() * 100000000);
	
	//Name of user
	System.out.print("Please enter your name: ");
	String name = Keyboard.readString();
	
	//VIP status of user
	System.out.println("\nWhat are you?\n\t0. Boss\n\t1. Manager\n\t2. Staff\n\t3. Member\n\t4. Family Member/ Acquaintance\n\t5. Passing Stranger");
	int priority = Keyboard.readInt();
	
	//Problem of user
	System.out.println("\nPlease describe your problem.");
	String problem = Keyboard.readString();
	
	//Adding the ticket
	Ticket toAdd = new Ticket(newID, priority, name, problem);
	_data.add(toAdd);
	
	//End message to keep up relations
	System.out.println("Your ticket has successfully been added to the queue! Please check back later for your solution");
    }

    //Solving a ticket
    public void solveTicket() {
	//Checks if there are any tickets that need to be solved
	if (_data.isEmpty())
	    System.out.println("There are no tickets in the queue! Job well done.");
	else {
	    //Establishes the ticket that is being worked on (aka the first ticket in the queue)
	    Ticket workingTic = _data.peekMin();
	    
	    //Prints the problem of the ticket for the user for ease of reference
	    System.out.println(workingTic.getName() + " has the following problem: " + workingTic.getProblem());
	    
	    //Retrieving solution
	    System.out.println("Please describe the solution to the aforementioned problem");
	    String solution = Keyboard.readString();
	    workingTic.setSolution(solution);
	    
	    //Removing ticket from queue
	    _data.removeMin();
	    
	    //Keeping up relations with the employee
	    System.out.println("Your solution has been added. Thank you for your hard work!");
		}
    }
    
    //Tests the above method
    public static void main(String[] args) {
	HelpDesk hd = new HelpDesk();
	hd.addTicket();
	hd.addTicket();
	System.out.println();

	//Prints all tickets for ease of viewing
	System.out.println(hd._data);
	
	hd.solveTicket();
    }
}
