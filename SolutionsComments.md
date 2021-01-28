Autor: Rodrigo Espeso, 2020/11/29

# Technical Challenge Interview

### 0. Configuration
I created a parent Maven project to include the needed dependencies in the pom.xml so the 4 projects inherit them.
Actually the only defined dependency is JUnit4.
I used JDK 1.8 in the projects.

### 1. Calculator
I modified the Node class adding methods to be able to calculate several operations in one statement using chaining.
I changed the type of the operator field to BinaryOperator, so I extracted the implementation of the operation making Node more abstract. The known operations could be referenced through CommonOperations and this interface could be inherited to add more operations as functions implementing BinaryOperators.

### 2. FizzBuzz
I used Predicates in the mapping process of a [1, 100] Stream of integers to get the "FizzBuzz" list.


### 3. FlyingCar
Following OOP principles, I moved "drive()" and "fly()" implementations to interfaces as defaults functions, so they can be implemented by Car, Aeroplane and FlyingCar classes. If the methods are not overwritten, the implementation will remains as the original, so a FlyingCar will fly as a aeroplane and drive as a car.

### 4. Shapes
Using Decorator Pattern, I built a structure of Decorators to add functionality to the "draw()" method. 
