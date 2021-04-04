Implement the command() method in the Main class to allow players to type full words, or phrases, then move to the correct location based upon their input.

The player should be able to type commands such as "Go West", "run South", "I need to Quit this game" or just "East" and the program will move to the appropriate location if there is one.

The console should display its current location, then it should prompt the user with: "Available exits are ", and its available exits. For example:

You are standing at the end of a road before a small brick building

Available exits are Q, S, E, N, W, 

A move in a valid direction should print (keep in mind N, S, E and W variants - showing N below):

You are standing at the end of a road before a small brick building

Available exits are Q, S, E, N, W, 

You are in the forest

Available exits are Q, S, W, 

An attempt to move in an invalid direction should print a message and remain in the same place. The printed message should be: "You cannot go in that direction". For Example:

You are standing at the end of a road before a small brick building

Available exits are Q, S, E, N, W, 

You cannot go in that direction

You are standing at the end of a road before a small brick building

Available exits are Q, S, E, N, W, 

Output for quit (Q) command should be displayed as:

You are standing at the end of a road before a small brick building

Available exits are Q, S, E, N, W, 

You are sitting in front of a computer learning Java

Single letter commands (N, W, S, E, Q) should still be available.

TIP: Declare a Map called vocabulary as a field with private access modifier, the object is of type HashMap. Create its key-value pair in the constructor by using the put() method. Both key and value are of type String. Use vocabulary to store the original commands aliases (eg. NORTH = N, SOUTH = S, ...).

TIP: Instantiate (create) the Scanner object inside the method.

NOTE: Ignore "No line found" in the output if you get an error message. It is not the reason for the error. Instead, check spelling/spaces/format in the printed message.