# Unit 2 - Methods

## <u>Swing Frames and Buttons</u>

## Swing Frame

A frame is a window which contains a title bar and the buttons to minimize, maximize and close the window. In Java, the class used to create frames is called `JFrame`. 

`JFrames` are considered a **container**, which means it is a component which holds other components. A **component** is any Java Swing/GUI element.

In order to display a `JFrame` it must be visible, and it must have a size. You must also specify what action the close button executes when it's pressed. 

REMEMBER, to use a class we must have three parts:  **Import Statement**, **Object Creation**, and **Method Call**.

### [Import Statement]()

`JFrame` is a class in the `javax.swing` package. We could import the class itself, however, ALL the Swing components have individual classes. So instead of importing all the classes individually, we use the wildcard import instead.

`import javax.swing.*`

### [Object Creation]()

We can create a JFrame object in much the same way as the other objects we've created:

`JFrame window = new JFrame("This Is A Simple Window");`

The parameter is a String which is used as the title for the window in the title bar.

### [Method Calls]()

There are three methods we need to call to display the Window: 

- `.setSize(int width, int height)` - Sets the width and height of the window in pixels
- `.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` - sets what happens when the red X is clicked
- `.setVisible(true)` - allows the window to display

Let's create a Frame in [**SimpleFrame**][code1]

## Panels and Buttons

A frame by itself does nothing. We can add components to the frame using the `.add(JComponent component)` method. However, the frame is a strict container and doesn't allow for a controlled layout of our components.

A `JPanel` is a generic container which can be added to a frame. Panels are much more flexible and allow us to change the layout of the components. Any Swing component can be added to a `JPanel`. A `JButton` is a Swing component which creates a clickable button. We can put a button on a panel then add the panel to the frame. 

Both the `JPanel` and `JButton` are classes requiring an object to be created in order to use them. 

### [Object Creation]()

`JPanel panel = new JPanel();`
`JButton button = new JButton(String text);`

Let's create a panel and a button and add it to our frame.


### [Clicking the Button]()

You will notice the button doesn't do anything. **Listeners** are used to listen for certain **events** to happen. **Events** are usually created by the user when they interact with input devices or GUI components such as keys on the keyboard, mouse clicks, buttons or text boxes.

One technique for writing an **event listener** is to write a private inner class inside the class which is creating the GUI. Once we discuss, in depth, how classes work, this will make more sense, but for now, copy/paste!!

```java
import java.awt.event.ActionListener;

private class ButtonListener implements ActionListener
{
    public void actionPerformed(ActionEvent e){
        //CODE THE TASK FOR THE BUTTON
    }
}
```

First you will notice a new import statement, `java.awt.event.ActionListener`. ActionListener isn't a class, but an interface, which is basically a pre-defined set of methods which must be called to execute a task. To use `ActionListener` we must define a method called `actionPerformed`. Within that method, we define the task to execute when the button is clicked. 

Lastly, we must attach the listener to the button, in much the same way we attached panels to a frame. 
- `.addActionListener(new ActionListener()` - attaches a new actionListener to the object/component which called the method. 

Let's add a listener which shows a pop-up dialog box whenever the button is clicked. 


[code1]: src/SimpleFrame.java