Description:

The purpose of this application is to help a company called Bill's Burgers manage the process of selling their hamburgers. And in order to match Bill's menu, you will need to create three(3) classes, Hamburger, DeluxeBurger, and HealthyBurger. 

For the base Hamburger class, there will need to be four variables to represent the four basic ingredients of the hamburger, name, meat, price, and breadRollType. The price variable should be of type double, while the other three are of type String. A constructor will be needed to accept these four values as parameters when creating a new hamburger.

There will also need to be separate variables for four(4) possible additions to the hamburger. Those should be declared with these names: addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, and addition4Price. The name variables should be of type String and the price variables should be of type double.

Five(5) methods are also needed inside the Hamburger class. Four(4) for adding up to four additions to the hamburger and one(1) for printing out an itemized listing of the final hamburger with addons, if any, and the total price. Remember that a name and price must be accepted as parameters in the first four methods so that the price of the hamburger is adjusted accordingly. These methods should be named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger. The first four methods do not return values, but the last method does return the total price of the hamburger of type double, which includes the base price of the hamburger plus any additional items. 

For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters. Instead, the constructor creates a deluxe burger with all the fixings and chips and a drink for a base price of $19.10. The constructor can be configured in any way, as long as chips and drink are added for the total price just mentioned. In this class, the four(4) methods defined in the Hamburger class for including additional toppings must each be overridden so that a message is printed stating that no additional items can be added to a deluxe burger.

And for the third class, HealthyBurger, there will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price. The names are type String and the prices are type double. The constructor for this class accepts two(2) parameters for meat and price. Those are set in the constructor along with an appropriate name for the type of burger. 

Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and price for the addition, allowing for up to two(2) addons to the basic healthy burger. And finally the itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate to the type of burger along with any addons. The method also returns the total price of the healthy burger of type double.

Example input:

Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
hamburger.addHamburgerAddition1("Tomato", 0.27);
hamburger.addHamburgerAddition2("Lettuce", 0.75);
hamburger.addHamburgerAddition3("Cheese", 1.13);
System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
healthyBurger.addHamburgerAddition1("Egg", 5.43);
healthyBurger.addHealthyAddition1("Lentils", 3.41);
System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

DeluxeBurger db = new DeluxeBurger();
db.addHamburgerAddition3("Should not do this", 50.53);
System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

Example output:

Basic hamburger on a White roll with Sausage, price is 3.56
Added Tomato for an extra 0.27
Added Lettuce for an extra 0.75
Added Cheese for an extra 1.13
Total Burger price is 5.71
Healthy hamburger on a Brown rye roll with Bacon, price is 5.67
Added Egg for an extra 5.43
Added Lentils for an extra 3.41
Total Healthy Burger price is  14.51
Cannot not add additional items to a deluxe burger
Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54
Added Chips for an extra 2.75
Added Drink for an extra 1.81
Total Deluxe Burger price is 19.10
