# GameZone Store Management

## Description

For this project, I made a video game store called GameZone. My store sells video games and gaming accessories. I used Java to create a program that keeps track of different products, their prices, and other information.

I made a superclass called Product and two subclasses called VideoGame and Accessory. Both subclasses inherit the name and price variables from Product. VideoGame has its own console variable, and Accessory has its own type variable.

I used constructors to create objects, getter methods to get information, and setter methods to change information. I also used the super keyword to call constructors and methods from the superclass. Each class has a toString() method that displays information about the product.

## UML Diagram

```text
                Product
--------------------------------
- name: String
- price: double
--------------------------------
+ Product()
+ Product(String, double)
+ getName(): String
+ getPrice(): double
+ setName(String): void
+ setPrice(double): void
+ toString(): String


        VideoGame extends Product
--------------------------------
- console: String
--------------------------------
+ VideoGame()
+ VideoGame(String, double, String)
+ getConsole(): String
+ setConsole(String): void
+ toString(): String


        Accessory extends Product
--------------------------------
- type: String
--------------------------------
+ Accessory()
+ Accessory(String, double, String)
+ getType(): String
+ setType(String): void
+ toString(): String
```

## How My Program Works

The StoreRunner class creates different video games and accessories and prints their information. It also changes the prices of some products using setter methods and prints the new prices using getter methods.

I also created some objects using no-argument constructors to show the default values.

## Classes

- Product: The superclass that stores the name and price of a product.
- VideoGame: A subclass that stores information about video games, including the console.
- Accessory: A subclass that stores information about gaming accessories and their type.
- StoreRunner: The main class that creates objects and runs the program.

## What I Learned

This project helped me understand how inheritance works and how subclasses can use variables and methods from a superclass. I also got more practice with constructors, instance variables, accessor methods, mutator methods, and the super keyword.
