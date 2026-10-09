# My Java Learning Summary

A summary of everything I've practised in this project, organised by topic, from Java basics up to OOP and file I/O.

---

## Table of Contents

1. [Java Basics](#1-java-basics)
2. [Control Flow](#2-control-flow)
3. [Loops](#3-loops)
4. [Arrays](#4-arrays)
5. [Strings](#5-strings)
6. [Methods](#6-methods)
7. [Classes & Objects](#7-classes--objects)
8. [Constructors](#8-constructors)
9. [Variable Scope](#9-variable-scope)
10. [Static Members](#10-static-members)
11. [toString()](#11-tostring)
12. [Passing Objects to Methods](#12-passing-objects-to-methods)
13. [Array of Objects](#13-array-of-objects)
14. [Inheritance & `super`](#14-inheritance--super)
15. [Method Overriding](#15-method-overriding)
16. [Abstraction](#16-abstraction)
17. [Interfaces](#17-interfaces)
18. [Polymorphism](#18-polymorphism)
19. [Encapsulation](#19-encapsulation)
20. [Access Modifiers](#20-access-modifiers)
21. [Aggregation vs Composition](#21-aggregation-vs-composition)
22. [Wrapper Classes](#22-wrapper-classes)
23. [ArrayList](#23-arraylist)
24. [Exception Handling](#24-exception-handling)
25. [File I/O](#25-file-io)
26. [Mini Projects](#26-mini-projects)
27. [Bugs to Fix / Lessons Learned](#27-bugs-to-fix--lessons-learned)

---

## 1. Java Basics

| Concept | File(s) |
|---|---|
| Variables & data types (`int`, `double`, `boolean`, `char`, `String`) | `JavaBasic/ControlFlow/MySelf.java`, `JavaBasic/Basics/UserInput.java` |
| User input with `Scanner` | `JavaBasic/Basics/UserInput.java` |
| `Math` class (`sqrt`, `pow`, `PI`) | `JavaBasic/Basics/MathClass.java` |
| Random numbers with `Random` | `JavaBasic/Basics/RandomNumber.java` |
| Formatted output with `printf` | `JavaBasic/Basics/MathClass.java`, `JavaBasic/ControlFlow/NestedIf.java` |

```java
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();    // reads a whole line
int age = scanner.nextInt();         // reads an int
double price = scanner.nextDouble(); // reads a double
scanner.close();

Random random = new Random();
int number = random.nextInt(1, 101); // 1 to 100

System.out.printf("Area: %.2f%n", Math.PI * Math.pow(r, 2));
```

> **Tip:** After `nextInt()`/`nextDouble()`, call `scanner.nextLine()` to consume the leftover newline before reading a line of text.

---

## 2. Control Flow

| Concept | File(s) |
|---|---|
| `if / else if / else` | `JavaBasic/ControlFlow/IfStatement.java`, `JavaBasic/ControlFlow/WeightConverter.java` |
| Nested `if` | `JavaBasic/ControlFlow/NestedIf.java` |
| Logical operators `&&`, `\|\|`, `!` | `JavaBasic/ControlFlow/LogicalOperators.java` |
| Ternary operator `? :` | `JavaBasic/ControlFlow/TernaryOperator.java`, `JavaBasic/ControlFlow/TemperatureConverter.java` |
| Enhanced `switch` (arrow `->`) | `JavaBasic/MiniProjects/CalculatorProgram.java`, `JavaBasic/MiniProjects/BankingProgram.java` |
| `switch` with pattern matching (`case Integer i when ...`) | `JavaBasic/ControlFlow/Switch.java` |
| `switch` as an expression that returns a value | `JavaBasic/MiniProjects/SlotMachine.java` |

```java
// Ternary: variable = (condition) ? ifTrue : ifFalse;
double tax = (income >= 40000) ? income * 0.25 : income * 0.15;

// Enhanced switch
switch (operator) {
    case '+' -> result = num1 + num2;
    case '^' -> result = Math.pow(num1, num2);
    default  -> System.out.println("Invalid Operator!");
}

// Switch expression (returns a value)
return switch (row[0]) {
    case "🍋" -> bet * 20;
    default   -> 0;
};
```

---

## 3. Loops

| Concept | File(s) |
|---|---|
| `for` loop | `JavaBasic/Loops/ForLoop.java` |
| `while` loop | `JavaBasic/Loops/WhileLoop.java`, `JavaBasic/MiniProjects/BankingProgram.java` |
| `do-while` loop (runs at least once) | `JavaBasic/MiniProjects/NumberGuessingGame.java` |
| `break` (stop) and `continue` (skip) | `JavaBasic/Loops/BreakAndContinue.java` |
| Nested loops | `JavaBasic/Loops/NestedLoop.java`, `NestedLoopExc.java`, `NestedLoopExc2.java` |
| Enhanced `for-each` loop | `JavaBasic/Arrays/DoubleDimensionArray.java`, `JavaBasic/Methods/VarArgs.java` |

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) continue; // skip 5
    if (i == 8) break;    // stop at 8
    System.out.println(i);
}

do {
    guess = scanner.nextInt();
} while (guess != randomNumber);
```

---

## 4. Arrays

| Concept | File(s) |
|---|---|
| 1D array: declare, fill, loop | `JavaBasic/Arrays/Array.java`, `JavaBasic/Arrays/InventoryCheck.java`, `JavaBasic/Arrays/TransactionAudit.java` |
| Array sized from user input | `JavaBasic/Arrays/Tempreature.java` |
| Search an array | `JavaBasic/Arrays/SerachAnArray.java` |
| 2D arrays | `JavaBasic/Arrays/DoubleDimensionArray.java`, `DoubleDimensionArrayExcercise.java` |
| 2D arrays in a quiz game | `JavaBasic/MiniProjects/MovieQuizGame.java` |

```java
int[] numbers = new int[3];            // empty array of size 3
int[] stock = {15, 8, 22, 0};          // array literal

String[][] groceries = {
    {"Apple", "Banana"},
    {"Carrot", "Celery"}
};
groceries[1][1] = "KitKat";            // [row][column]

for (String[] row : groceries)
    for (String item : row)
        System.out.print(item + " ");
```

---

## 5. Strings

| Concept | File(s) |
|---|---|
| `length`, `charAt`, `indexOf`, `toUpperCase`, `trim`, `replace`, `isEmpty`, `equalsIgnoreCase` | `JavaBasic/Strings/StringMethod.java` |
| `substring` | `JavaBasic/Strings/SubtringMethod.java`, `OOP/Inheritance/CreditCardPayment.java` |
| `String.join` | `JavaBasic/MiniProjects/SlotMachine.java` |
| Text blocks `"""` | `JavaBasic/MiniProjects/RollDice.java`, `WriteFile/Main.java` |

```java
String email = "nabil@gmail.com";
String name   = email.substring(0, email.indexOf("@"));  // "nabil"
String domain = email.substring(email.indexOf("@") + 1); // "gmail.com"

String last4 = cardNumber.substring(cardNumber.length() - 4);
```

> **Rule:** compare Strings with `.equals()`, never `==`.

---

## 6. Methods

| Concept | File(s) |
|---|---|
| Creating & calling methods, parameters, return values | `MethodOOP1.java`, `MethodOOP2.java` |
| Method overloading (same name, different parameters) | `MethodOOP3.java`, `MethodOOP4.java` |
| Varargs `(double... numbers)` | `JavaBasic/Methods/VarArgs.java` |
| Breaking a program into helper methods | `JavaBasic/MiniProjects/BankingProgram.java`, `JavaBasic/MiniProjects/SlotMachine.java` |

```java
static double calculateTotal(double price) { ... }
static double calculateTotal(double price, double discount) { ... }
static double calculateTotal(double price, double tax, double shipping) { ... }

// Varargs removes the need for many overloads
static double average(double... numbers) {
    double sum = 0;
    for (double n : numbers) sum += n;
    return sum / numbers.length;
}
```

**Method signature = name + parameter list.** The return type is not part of it.

---

## 7. Classes & Objects

A **class** is a blueprint; an **object** is an instance created with `new`.

- **Attributes** (fields) = what an object *has*
- **Methods** = what an object *can do*

| Example | File(s) |
|---|---|
| First class with attributes + methods | `JavaBasic/ControlFlow/MySelf.java` |
| Multiple objects from one class | `OOP/ClassesAndObjects/CoffeCup.java` + `OOP/ClassesAndObjects/Main.java` |
| Objects with state that changes | `OOP/ClassesAndObjects/DeliveryVan.java` + `OOP/ClassesAndObjects/Main2.java` |
| Calling methods on other classes | `Test.java`, `Test1.java`, `Test2.java` |

```java
CoffeCup order1 = new CoffeCup();
CoffeCup order2 = new CoffeCup();
order1.drink();
order2.spill();
```

---

## 8. Constructors

A **constructor** is a special method that runs when an object is created. It has the same name as the class and no return type.

| Concept | File(s) |
|---|---|
| Basic constructor with `this` | `OOP/Constructors/Book.java` + `OOP/Constructors/Constructor.java`, `OOP/Constructors/HotelRoom.java` + `OOP/Constructors/Main3.java` |
| **Overloaded constructors** | `OOP/Constructors/Pizza.java` + `OOP/Constructors/OverloadedConstructor.java` |
| Overloaded constructors with defaults | `OOP/Constructors/Vehicle.java` + `OOP/Constructors/Main5.java`, `OOP/Constructors/InventoryItem.java` + `OOP/Constructors/Main4.java` |

```java
Pizza(String bread) { this.bread = bread; }
Pizza(String bread, String crust) { ... }
Pizza(String bread, String crust, String toppings) { ... }
```

`this.name = name;` means "set this object's field `name` to the parameter `name`".

---

## 9. Variable Scope

| Scope | Declared | Visible |
|---|---|---|
| **Local** | inside a method | only inside that method |
| **Instance (field)** | inside the class, outside methods | the whole class (access with `this.`) |

Files: `OOP/VariableScope/VariableScope.java`, `OOP/VariableScope/ShoppingCart.java`, `OOP/VariableScope/DiceRoll.java`

```java
int number = 3;       // field
DiceRoll() {
    int number = 1;   // local, "shadows" the field
    System.out.println(number);      // 1
    System.out.println(this.number); // 3
}
```

> Writing a type in front (`double x = ...`) creates a **new local variable**. Leave the type off to update the field.

---

## 10. Static Members

`static` belongs to the **class**, not to each object, so every object shares it.

| Example | File(s) |
|---|---|
| Static counter shared by all objects | `OOP/Static/Friend.java` + `OOP/Static/main1.java` |
| Static utility methods + static field | `OOP/Static/CurrencyConverter.java` + `OOP/Static/Main8.java` |

```java
static int numberOfFriends;
Friend(String name) { numberOfFriends++; }

Friend.displayFriends();                    // call via class name
CurrencyConverter.convertUsdToEur(100);     // no object needed
```

---

## 11. toString()

Override `toString()` to control what prints when you `System.out.println(object)`.

Files: `OOP/ToString/UserProfile.java` + `OOP/ToString/toString.java`, `OOP/Inheritance/Employee.java`, `CompositionExc1/Processor.java`

```java
@Override
public String toString() {
    return username + " | " + email + " | " + role;
}
```

Without it, Java prints something like `OOP.UserProfile@1b6d3586`.

---

## 12. Passing Objects to Methods

Objects can be passed as arguments, so one object can work with another.

| Example | File(s) |
|---|---|
| Barista prepares a `Coffee` | `OOP/ObjectPassing/Barista.java`, `OOP/ObjectPassing/Coffee.java`, `OOP/ObjectPassing/Main6.java` |
| Bank transfers between two `Account`s | `OOP/ObjectPassing/Bank.java`, `OOP/ObjectPassing/Account.java`, `OOP/ObjectPassing/Main7.java` |
| Pass-by-value theory task | `OOP/ObjectPassing/Order.java` |

```java
void transfer(Account sender, Account recipient, double amount) {
    sender.withdraw(amount);
    recipient.deposit(amount);
}
```

> **Java is always pass-by-value.** For objects, the value passed is a *copy of the reference*. You can change the object's fields, but reassigning the parameter (`order = new Order()`) does not affect the caller's variable.

---

## 13. Array of Objects

Files: `OOP/ArrayOfObjects/Product.java` + `OOP/ArrayOfObjects/ArrayOfObject.java`, `OOP/ArrayOfObjects/Student.java` + `OOP/ArrayOfObjects/GradeManager.java`

```java
Product[] cart = new Product[3];
cart[0] = new Product(101, "Mouse", 200.00, 1);

double total = 0;
for (Product p : cart) total += p.getTotalPrice();
```

---

## 14. Inheritance & `super`

A child class `extends` a parent and gets its fields and methods (the **"is-a"** relationship).

| Example | File(s) |
|---|---|
| `Car` / `Bicycle` extend `Vehicles` | `OOP/Inheritance/Vehicles.java`, `OOP/Inheritance/Car.java`, `OOP/Inheritance/Bicycle.java`, `OOP/Inheritance/Inheritance.java` |
| `CreditCardPayment` / `EWalletPayment` extend `PaymentMethod` | `OOP/Inheritance/PaymentMethod.java`, `OOP/Inheritance/Main9.java` |
| `super(...)` calls the parent constructor | `OOP/Inheritance/SalariedEmployee.java` + `OOP/Inheritance/Main10.java` |
| `super.toString()` calls the parent method | `OOP/Inheritance/SalariedEmployee.java` |

```java
public class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(String name, int id, double salary) {
        super(name, id);       // must be the first line
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Salary: " + salary;
    }
}
```

A class can `extend` **only one** parent.

---

## 15. Method Overriding

A child class provides its own version of a parent method. Use `@Override` so the compiler checks it.

Files: `OOP/Inheritance/EWalletPayment.java` (overrides `speak()`), `DynamicPolymorphism/Cat.java`, `DynamicPolymorphism/Dog.java`

| Overloading | Overriding |
|---|---|
| Same name, **different parameters** | Same name, **same parameters** |
| Same class | Parent → child |
| Decided at compile time | Decided at runtime |

---

## 16. Abstraction

**Abstraction** hides implementation details and shows only what matters.

- An `abstract` class **cannot be instantiated** (`new Shape()` ❌)
- It can have **abstract methods** (no body) that children **must** implement
- It can also have **concrete methods** that children inherit

| Example | File(s) |
|---|---|
| `Shape` → `Circle`, `Rectangle`, `Triangle` | `Abstraction/` |
| `BankAccount` → `SavingsAccount`, `CurrentAccount` | `OOP/Abstraction/BankAccount.java`, `OOP/Abstraction/Abstract.java` |
| Toll booth: `Vehicle1` → `Car1`, `Lorry1` | `OOP/Abstraction/Vehicle1.java`, `OOP/Abstraction/Main12.java` |
| Payment gateway (in progress) | `PaymentGateway/` |

```java
public abstract class Vehicle1 {
    abstract double calculateToll();   // each child decides

    public void printReceipt() {       // shared by all children
        System.out.println("Total Toll Fee: RM " + calculateToll());
    }
}
```

---

## 17. Interfaces

An **interface** is a contract that says what a class *must do*. A class can `implement` **many** interfaces but `extend` only one class.

Files: `OOP/Interfaces/Prey.java`, `OOP/Interfaces/Predator.java`, `OOP/Interfaces/Rabbit.java`, `OOP/Interfaces/Hawk.java`, `OOP/Interfaces/Fish.java`, `OOP/Interfaces/Interface.java`

```java
public interface Prey     { void flee(); }
public interface Predator { void hunt(); }

public class Fish implements Prey, Predator {
    public void hunt() { ... }
    public void flee() { ... }
}
```

| Abstract class | Interface |
|---|---|
| `extends` (only 1) | `implements` (many) |
| Can have fields + constructors | Constants only |
| "is-a" with shared code | "can-do" capability |

---

## 18. Polymorphism

**Poly = many, morph = forms.** A parent-type variable can hold any child object, and the right overridden method runs **at runtime** (dynamic polymorphism).

Files: `DynamicPolymorphism/`, `OOP/Abstraction/Main12.java`

```java
Animal animal;
if (choice == 1) animal = new Cat();
else             animal = new Dog();
animal.speak();   // "meow" or "woof", decided at runtime

Vehicle1 lorry = new Lorry1("B5678B", 5.00, 4);
lorry.printReceipt(); // uses Lorry1's calculateToll()
```

---

## 19. Encapsulation

Make fields `private` and control access with **getters/setters**. This protects data and allows validation.

| Example | File(s) |
|---|---|
| Car with getters/setters | `Encapsulation/Car.java`, `OOP/Encapsulation/Car2.java` + `OOP/Encapsulation/Encapsulation.java` |
| Validation in the constructor and setter | `OOP/Encapsulation/BankAccounts.java` + `OOP/Encapsulation/Main13.java` |

```java
private double balance;

public double getBalance() { return balance; }

public void setDeposit(double amount) {
    if (amount >= 0) balance += amount;
    else System.out.println("Invalid Deposit Amount");
}
```

---

## 20. Access Modifiers

Files: `package1/A.java`, `package1/B.java`, `package2/C.java`, `package2/Asub.java`

| Modifier | Class | Package | Subclass | World |
|---|:-:|:-:|:-:|:-:|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| *(no modifier)* | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

---

## 21. Aggregation vs Composition

Both are **"has-a"** relationships (one object contains another).

| | Aggregation | Composition |
|---|---|---|
| Relationship | Weak "has-a" | Strong "has-a" |
| Child lifetime | Exists **independently** | **Dies with** the parent |
| How it's built | Passed **in** from outside | Created **inside** the constructor |
| Example | `Library` has `Book[]` | `Car` has `Engine`, `Computer` has `Processor` |
| Files | `Aggregation/` | `Composition/`, `CompositionExc1/` |

```java
// Aggregation: books already exist and are handed to the library
Library library = new Library("NYC Library", 1992, books);

// Composition: the engine is created by the car
Car(String model, String color, String engine) {
    this.engine = new Engine(engine);
}
```

---

## 22. Wrapper Classes

Wrappers turn primitives into objects (`int` → `Integer`, `double` → `Double`, `char` → `Character`...).

File: `WrapperClass/Main.java`

```java
Integer boxed = 7;                      // auto-boxing   (int → Integer)
int unboxed = boxed;                    // auto-unboxing (Integer → int)
int parsed = Integer.parseInt("12");    // String → int (parsing)
String s = String.valueOf('@');         // char → String
```

---

## 23. ArrayList

A resizable list from `java.util`. Unlike arrays, it grows as you add items.

File: `ArrayList/Main.java`

```java
ArrayList<String> food = new ArrayList<>();
food.add("Nasi Lemak");
System.out.println(food);   // [Nasi Lemak]
```

Common methods to learn next: `get(i)`, `set(i, x)`, `remove(i)`, `size()`, `contains(x)`, `Collections.sort(list)`.

---

## 24. Exception Handling

An **exception** is an event that interrupts the normal flow of a program (dividing by zero, file not found, wrong input type).

File: `ExceptionHandling/Main.java`

```java
try {
    int number = scanner.nextInt();       // risky code
} catch (InputMismatchException e) {
    System.out.println("This is not a number!");
} finally {
    System.out.println("This will always run!");
}
```

---

## 25. File I/O

| Task | Class | File |
|---|---|---|
| Read text line by line | `BufferedReader` + `FileReader` | `ReadFile/Main.java` |
| Write text | `FileWriter` | `WriteFile/Main.java` |

Other options noted: `FileInputStream` (binary files), `RandomAccessFile` (read/write parts of large files).

```java
// try-with-resources closes the file automatically
try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.out.println("File doesn't exist!");
}
```

---

## 26. Mini Projects

| Project | What it practises | File |
|---|---|---|
| 🏦 Banking Program | `while` menu loop, `switch`, static methods, validation | `JavaBasic/MiniProjects/BankingProgram.java` |
| 🎰 Slot Machine | arrays, `Random`, methods that return arrays, switch expressions | `JavaBasic/MiniProjects/SlotMachine.java` |
| 🎲 Dice Roller | `Random`, text blocks, `switch` | `JavaBasic/MiniProjects/RollDice.java` |
| 🎬 Movie Quiz Game | 1D + 2D arrays, nested loops, scoring | `JavaBasic/MiniProjects/MovieQuizGame.java` |
| 🔢 Number Guessing Game | `do-while`, `Random` | `JavaBasic/MiniProjects/NumberGuessingGame.java` |
| 🧮 Calculator | `char` input, enhanced switch, `Math.pow` | `JavaBasic/MiniProjects/CalculatorProgram.java` |
| ⚖️ Weight / 🌡️ Temperature Converter | if/else, ternary, `printf` | `JavaBasic/ControlFlow/WeightConverter.java`, `TemperatureConverter.java` |
| 🛣️ Toll Booth System | abstract class, polymorphism | `OOP/Abstraction/Vehicle1.java`, `Car1.java`, `Lorry1.java`, `Main12.java` |
| 🏨 Hotel Room Manager | constructors, object state | `OOP/Constructors/HotelRoom.java`, `OOP/Constructors/Main3.java` |
| 🎓 Grade Manager | array of objects | `OOP/ArrayOfObjects/Student.java`, `OOP/ArrayOfObjects/GradeManager.java` |

---

## 27. Bugs to Fix / Lessons Learned

While reading through the code, I found these bugs. Each one teaches something:

| File | Problem | Fix / Lesson |
|---|---|---|
| `OOP/Constructors/InventoryItem.java` | `totalWeight()` returns `totalWeight()`, which calls itself forever → `StackOverflowError` | `return sumWeight;` |
| `OOP/ArrayOfObjects/Student.java` | `hasPassed()` also calls itself forever | `return true;` / `return false;` |
| `JavaBasic/Loops/WhileLoop.java` | The PIN is never re-read inside the loop → **infinite loop** | Read input inside the loop and count `attempts` |
| `JavaBasic/ControlFlow/TemperatureConverter.java` | `option == "C"` compares references, so it's always false | `option.equals("C")` |
| `JavaBasic/Basics/MathClass.java` | `4/3` is integer division = `1` | `4.0/3` |
| `Abstraction/Triangle.java` | Area is `height * length` | Triangle area = `0.5 * base * height` |
| `JavaBasic/Arrays/Tempreature.java` | `"Day " + i+1` prints `"Day 01"` (string concatenation) | `"Day " + (i+1)` |
| `JavaBasic/MiniProjects/RollDice.java` | `totalRoll += roll` adds the number of rolls, not the dice value | `totalRoll += rollDice` |
| `JavaBasic/ControlFlow/IfStatement.java` | `age < 18` is checked before `age == 0` and `age < 0`, so those branches never run | Check the most specific conditions first |
| `JavaBasic/Arrays/InventoryCheck.java` | Prints `item` (the index) as the stock count | Print `stockLevels[item]` |
| `OOP/Constructors/Vehicle.java` | `int year = 2024;` inside the constructor creates a local variable, so the field stays `0` | `this.year = 2024;` |
| `OOP/Constructors/InventoryItem.java` | `restock()` computes `newQuantity` but never saves it | `this.quantity += amount;` |
| `WriteFile/Main.java` | Writes to `"Dockerfile"`, which **overwrites** the real project Dockerfile | Write to a test file like `"output.txt"` |
| `WrapperClass/Main.java` | Comment says `Integer.parseInt` is auto-unboxing | That's *parsing* a String; auto-unboxing is `int x = integerObj;` |
| `JavaBasic/ControlFlow/NestedIf.java` | Comment says 15% off but multiplies by `0.75` (25% off) | Use `0.85` |

### Key takeaways

- **Recursion without a stopping condition** crashes the program
- **Loops need their condition to change**, or they never end
- **`==` vs `.equals()`**: use `.equals()` for Strings and objects
- **Integer division** drops decimals, so use a `double` operand
- **Declaring a type creates a new variable.** `this.x = ...` updates the field
- **Order of `if-else` matters**: put the most specific checks first

---

## What to Learn Next

- [ ] `HashMap` and other collections (`HashSet`, `LinkedList`)
- [ ] Custom exceptions (`throw`, `throws`, `extends Exception`)
- [ ] `enum`
- [ ] Generics (`<T>`)
- [ ] Lambdas & Streams
- [ ] Unit testing with JUnit
- [ ] Finish the `PaymentGateway` package (abstract methods + implementations)
