# Unit 2 - Methods

## <u>Methods With Parameters</u>

### Scope
Notice how in the last example, [Methods Example][last], each method had to prompt for input. This is due to the [Scope]() of the method and variables. 

Scope is the block of code between two brackets. Consider the following:

```java
public class Scope{

    private int number = 12;
    private int total; 
    
    public void addNumbers(){
        int numberB = 4;        
        total = numberB + number;
    }    

    public void displayTotal(){
        System.out.println("The total of " + number + " + " + numberB + " is " + total);
    } 
}
``` 
This class will cause an error if `displayTotal()` is called, so let's look at why.

There are a lot of scopes in the program. The first set of brackets define the scope of the class. Variables can only be accessed the in scope they are defined. Any variable defined at the beginning of the class scope is available to any method in the class. These are called [**global**](https://javaconceptoftheday.com/global-and-local-variables/) because they can be used anywhere in the class.

Next, each method has its own scope. This is the [**local**](https://javaconceptoftheday.com/global-and-local-variables/) scope of the variable. Variables defined in a method's scope can only be accessed in the method's scope.

So where's the error?  The error lies in the `displayTotal()` method. It tries to access the variable `numberB` which is declared in the `addNumbers` method. So `numberB` doesn't exist in the scope of `displayTotal`. _**A variable can only be accessed within the scope it was declared.**_

### Parameters

Parameters provide a way to pass data into a method without violating the scope. In our area and perimeter example, we would like to prompt for area and perimeter once, and then pass those values into the methods for calculation.

Parameters are defined in the method header, as you have seen in CodingBat shown below:
```java
public int sumNumbers(int a, int b){
  return a + b;
}
```
The parameters `a` and `b` are declared inside the parenthesis of the method header and includes the data-type and identifier of a variable. This variable represents the data that will be passed into the method. **THE DATA TYPES MUST MATCH**. Since `a` and `b` are declared in the method header, they can only be used in that method. 

Keep in mind, that methods are generalized tasks or solutions. We use the parameter variables inside the method to create a formula or generalized solution. The actual values will be passed in when the method is called, like you saw on CodingBat when checking your answers.


```java
System.out.println(sumNumbers(3,4));
```
This example will pass 3 to `a` and 4 to `b`. So in the method, where we have `a+b`, `3+4` is calculated and the answer, `7` is displayed.

Let's re-write our [area and perimeter][sandbox] example to be more efficient with parameters.

[sandbox]: ../L2-Methods%20with%20Parameters/src/ParameterExample.java

[last]: ../L1-Methods%20Without%20Parameters/src/MethodExample.java

