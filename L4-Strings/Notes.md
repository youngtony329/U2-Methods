# Unit 2 - Methods

## <u>Strings</u>

### String Objects

The best way to get familiar with OOP is to look at an example. The `String` class is an example of OOP. Each `String` variable is actually a `String` object. Remember that objects execute methods from the class they are made from.

Below is a simple method from the `String` class:

`.length()` - returns the number of characters as an `int`.

Let's see an example. Run it in the [**StringExamples**][sandbox] if you want.
```java
public class L1{
    public static void main(String[] args){
        String name = "Alexander";
       
        int stringSize = name.length();
        
        System.out.println(name + " has " + stringSize + " letters.");
    }
}
```

First, we set the value of name, then the magic happens. `name` is now a `String` object and can run methods from the `String` class. The dot operator (`.`) executes the method on the value contained in the object `name`.  Notice that the method `returns` new data which must be assigned to a variable.

In short, `.length()` counts the letters in `name` and returns that to the variable `stringSize` as an `int`.

### Other String class methods

Methods are defined in a class. Only those methods defined are available to be executed by the object. A list of available methods is usually found in the class's documentation. Let's look at the [**String**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) class.

These are a few of the methods we will be focusing on in this unit:
* `.charAt(int index)` - returns the character at `index` in the string
* `.indexOf(char character)` - returns the index value of the first occurrence of 'character' in the string
* `.toLowerCase()` - returns a copy of the string all in lower-case
* `.toUpperCase()` - returns a copy of the string all in upper-case
* `.substring(int index)` - returns a copy of the string starting at the index through the end of the string, inclusive
* `.substring(int beginningIndex, int endingIndex)` - returns a copy of the string starting at `beginningIndex` index and ending at `endingIndex`, exclusive 

The index in `.charAt(index)` refers to a position in the `String`. Computers start counting at 0, so an index of 2, is the third character in the string. Consider these examples:

* "Hello World"   .charAt(4) = "o"
* "Hello World"   .charAt(5) = " "
* "Hello World"   .charAt(8) = "r"

Run this example in [**StringExamples**][sandbox].
```java
public class L1{
    public static void main(String[] args){
        
        String message = "Good morning, Mr. Smith.";
        
        String lowerCaseMessage = message.toLowerCase();
        String upperCaseMessage = message.toUpperCase();
        int messageLength = message.length();  //notice this counts spaces!!
        char thirdLetter = message.charAt(2);
        int mIndex = message.indexOf('m');
        String lastPart = message.substring(14);
        String firstPart = message.substring(0, 11);
        
        System.out.println("Original message: " + message);
        System.out.println("Lowecase: " + lowerCaseMessage);
        System.out.println("Uppercase: " + upperCaseMessage);
        System.out.println("Number of characters: " + messageLength);
        System.out.println("The third letter is: " + thirdLetter);
        System.out.println("'m' is found at index: " + mIndex);
        System.out.println("The last part: " + lastPart);
        System.out.println("The first part: " + firstPart);
    }

}
```
You should notice, in this example, that the original string doesn't get changed. These methods create a **brand new String** which then must be assigned/re-assigned to another variable. Lastly, look at the two substring methods. The first one starts at an index value and returns the string from that index value, including that index value's letter, to the end of the string including the last letter. This version of `substring()` is inclusive. The second `substring` method returns the string from an index value, including that index value's letter, to the next index value, but **NOT** that index value's letter. This version of `substring` is exclusive.


[sandbox]: ../L4-Strings/src/StringExamples.java
