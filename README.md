# VIP
Team VIP (Chester Huang, Irene Lam, Jason Lam)

## Class HelpDesk
Uses class Ticket to provide various features

## Method Explanations in Ticket

1. boolean isSolved() - returns whether the problem of Ticket is solved
2. int getID() - returns the unique ID of the Ticket
3. int getVIP() - returns the VIP level of the Ticket (0 being the top priority, and each increasing increment of lower priority)
4. String getProblem() - returns the problem of the Ticket
5. String getSoution() - returns the solution of the Ticket if isSolved, otherwise returns null
6. String getName() - returns the name associated with the Ticket
