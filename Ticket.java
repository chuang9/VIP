import java.util.*;

public class Ticket implements Comparable {
    
    private int ID;
    private int VIPLevel;
    private String name;
    private String problem;
    private String solution;
    private boolean solved;
    
    //Overloaded constructor	
    public Ticket(int newID, int priority, String newUser, String newProblem) {
	ID = newID;
	VIPLevel = priority;
	name = newUser;
	problem = newProblem;
	solution = null;
	solved = false;
    }

    //Compare method to gauge importance of two Tickets	
    public int compareTo(Object otherTick) {
	return VIPLevel - ((Ticket) otherTick).getVIP();
    }
	
    //Mutator method for solution	
    public void setSolution(String newSolution) {
	    solution = newSolution;
	    solved = true;
    }

    //Accessor method for ID	
    public int getID() {
	return ID;
    }

    //Accessor method for VIP status		
    public int getVIP() {
	return VIPLevel;
    }

    //Accessor method for name of user		
    public String getName() {
	return name;
    }

    //Accessor method for the problem of the ticket		
    public String getProblem() {
	return problem;
    }

    //Accessor method for the solution of the ticket		
    public String getSolution() {
	return solution;
    }

    //Accessor method for whether the ticket is solved		
    public boolean isSolved() {
	return solved;
    }

}
