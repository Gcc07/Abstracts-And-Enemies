## Why can’t you instantiate the Enemy class?
### You can't instantiate the Enemy class because it is abstract, meaning it isn't intended to have objects created from it.

## What would happen if a subclass did not implement update() or attack()?
### An error would occur. Child classes that extend from abstract classes must use all abstract methods from the parent class.

## How does using Enemy[] demonstrate polymorphism?
### When you use a parent class as a array type, the child classes (skeleton, slime, etc.) are recognized as the parent class, even though they aren't technically the same class. (ie. a single class being recognized as multiple forms.)

## Why is it helpful for Enemy to have a concrete method like takeDamage()?
### It's helpful for Enemy to have takeDamage() because it means the functionality is implemented without child classes having to specify the functionality or do anything with it. (They just automatically inherit it with no caveats.)

## Could this design be implemented using interfaces alone? Why or why not?
### I don't believe so. Interfaces cannot have constructors and also can't used protected variables, meaning the inhearent structure isn't a 1 to 1 transfer. As for the general structure of the code, I feel like only the methods could be transferred.
