Create a simple interface that allows an object to be saved to some sort of storage medium.

Implement the following:

1.  ISaveable (interface)

    -  It has two methods:

        -  write(), takes no arguments and returns a List containing objects of type String.

        -  read(), takes a List of type String and doesn't return anything.

2.  Player (class)

    -  It has four fields. Two Strings called name and weapon. Two ints called hitPoints and strength.

    -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and strength with the newly passed in values. It initialises weapon with the default weapon "Sword".

    -  And eleven methods:

        -  Getters and setters for all four fields.

        -  write(), same as interface. Return a List of the fields in the order they appear in toString().

        -  read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List is not null and the size() is greater than 0 before storing the values.

        -  toString(), Players overriding toString() method. It takes no arguments and returns a String in the following format:

Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}

3.  Monster (class)

    -  It has three fields. One String called name and Two ints called hitPoints and strength.

    -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and strength with the newly passed in values.

    -  And six methods:

        -  Only getters for the three fields.

        -  write(), same as interface. Return a List of the fields in the order they appear in toString().

        -  read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List is not null and the size() is greater than 0 before storing the values.

        -  toString(), Monsters overriding toString() method. It takes no arguments and returns a String in the following format:

Monster{name='Werewolf', hitPoints=20, strength=40}

TIP:  Player and Monster need to implement ISaveable.

TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.

TIP:  Be extremely careful about spaces and spelling in the returned String from the toString() method.

NOTE:  All fields are private.

NOTE:  Both constructors are public.

NOTE:  All methods are public. 

NOTE:  There are no static members.

NOTE:  Do not add a main method to the solution code.

NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.