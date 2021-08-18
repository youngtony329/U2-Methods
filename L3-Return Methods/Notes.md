# Unit 2 - Methods

## <u>Return Methods</u>

### Method Header 
Sometimes, methods need to feed information back to the main method. This is called a `return` statement. 

The first thing to consider with a return statement is, once again, the data-type returned. The method header must include the data-type of the returned value. If there is no return statement, the keyword `void` is used. 

Compare these two method headers: 
```java 
public static void sumNumbers(int a, int b){};

public static int multiply(int a, int b){};
```

Notice the first method includes the keyword `void` meaning there is no return data, while the second includes `int` meaning an integer value will be returned.

### Return Statement

If a method has a non-void data-type return, then a `return` statement MUST be included in the scope of the method.

The return statement has two parts, the keyword `return` and a value matching the method header's data-type. The return statement is typically the last statement in a method's scope.

Style 1:
```java
public static int multiply(int a, int b){
    int product = a * b;
    
    return product;
};
```
Style 2:
```java
public static int multiply(int a, int b){
    return a * b;
};
```

The two examples above show the different styles for writing return statements. 

### Using Return Methods

Again, return methods send information back to the method it was called in. Below are a few examples using the `multiply()` method above.

Assign a value to a variable to be used later
```java
public static void main(String[] args){
    
    int product = multiply(4, 9);  //product = 36
    
    double total = product * 1.02;    //total = 36.72    
}
```
Output a value
```java
public static void main(String[] args){
    
    System.out.println(multiply(4, 9)); //displays 36   
}
```
Used in other calculations or methods
```java
public static void main(String[] args){
    
    double total = multiple(4, 9) * 1.02; //total = 36.72
    
    double total2 = Math.pow(multiply(4, 9), 2); //total2 = 1296    
}
```

Let's use return statements in our Area and Perimeter example.

[sandbox]: ../L2-Methods%20with%20Parameters/src/ParameterExample.java