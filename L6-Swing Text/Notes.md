# Unit 2 - Methods

## <u>Swing Text</u>

### Displaying Text

`JLabels` are used to display any text on the screen. Don't let the name fool you, labels aren't JUST for labeling input boxes. Labels show any text and work similarly to ShowMessage dialog boxes and `System.out.println()` commands.

`JLabel` is a class, imported with the `javax.swing.*` import statement as well. 

### [Object Creation]()

`JLabel label = new JLabel(String text)` - where text is the text that is displayed on the label. 

### [Method Calls]()

There are A WHOLE LOT of methods these Swing components can use. We will only cover those most important. You can always do some research on your own to find out how to use any of the methods listed.

- `.setText(String text)` - sets the text of the label to `text`
- `.getText()` - returns the text of the label as a String

Let's create a frame, panel and add a text component to the panel, and add a button. TO THE [**CODE**][code].

### Getting Input from User

A program can get input from the user via a `JTextField` component. Like all input from users, the data is retrieved as a String and must be parsed to the appropriate data-type. 

`JTextField` is a class, imported with `javax.swing.*` import statement as well. 

### [Object Creation]()

`JTextField input = new JTextField(int size)` - where size is the maximum number of characters the input field will allow. 

### [Method Calls]()

- `.getText()` - retrieves the data the user has entered in the text field.
- `.setText(String text)` - sets the text of the field to `text`

The `.getText()` method is typically called from an actionListener which is linked to a button.

Let's add a textField, a blank label (for output), and link an actionListener to our button. TO THE [**CODE**][code].




[code]: /src/SimpleInput.java