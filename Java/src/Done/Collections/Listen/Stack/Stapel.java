package Done.Collections.Listen.Stack;

import java.util.Stack;

public class Stapel<T> {

    private Stack<T> stack = new Stack<T>();

    public void hinzufuegen(T object)
    {
        stack.push(object);
    }

    public T herunternehmen()
    {
        return stack.pop();
    }
}
