# VIP
Team VIP (Chester Huang, Irene Lam, Jason Lam)

## Design of Class HelpDesk
Contains an ArrayPriorityQueue of Tickets to model incoming requests for help.
In creating a new Ticket, the interface prompts for inputs such as the requester's name, their VIPLevel, and their problem.
A random and unique ID is also assigned to each Ticket.

Uses 6 different VIPLevels, determined by the status of the ticket submitter:

0. Boss
1. Manager
2. Staff
3. Member
4. Acquantince
5. Stranger


To solve a Ticket, the one of highest priority is taken from the queue. The information about the ticket is printed and there is a prompt to add a solution. Upon submitting the solution, the ticket is removed from the queue and added to an ArrayList where all other solutions are also stored.





## Method Explanations in Ticket

1. boolean isSolved() - returns whether the problem of Ticket is solved
2. int getID() - returns the unique ID of the Ticket
3. int getVIP() - returns the VIP level of the Ticket (0 being the top priority, and each increasing increment of lower priority)
4. String getProblem() - returns the problem of the Ticket
5. String getSoution() - returns the solution of the Ticket if isSolved, otherwise returns null
6. String getName() - returns the name associated with the Ticket
