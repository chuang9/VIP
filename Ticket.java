import java.util.*;

public class Ticket implements Comparable {
    
    private int ID;
    private int VIPLevel;
    private String name;
    private String problem;
    private String solution;
    private boolean solved;
    
    public Ticket(int newID, int priority, String newUser, String newProblem) {
	ID = newID;
	VIPLevel = priority;
	name = newUser;
	problem = newProblem;
	solution = null;
	solved = false;
    }

    public int compareTo(Object otherTick) {
	return VIPLevel - ((Ticket) otherTick).getVIP();
    }

    public int getID() {
	return ID;
    }

    public int getVIP() {
	return VIPLevel;
    }

    public String getName() {
	return name;
    }

    public String getProblem() {
	return problem;
    }

    public String getSolution() {
	return solution;
    }

    public boolean isSolved() {
	return solved;
    }

}
