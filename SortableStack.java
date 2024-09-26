import java.util.Comparator;
import java.util.Stack;
import java.util.NoSuchElementException;

public class SortableStack<T extends Comparable<T>>{
   private StackNode<T> top;
 
   public SortableStack(){
    this.top = null;
   }
 
   public void push(T data){
     StackNode<T> stackNode = new StackNode<>(data);
     stackNode.setNext(top);
     top = stackNode;
   }
 
   public T pop() {
     if (isEmpty()) {
       throw new NoSuchElementException("Stack boþtur");
     } else {
       T data = top.getData();
       top = top.getNext();
       return data;
     }
   }
   
   public T peek() {
     if (isEmpty()) {
       throw new NoSuchElementException("Stack boþtur");
     }
     return top.getData();
   }
   
   public boolean isEmpty() {
     return top == null;
   }
   
public void sort() {
    if (isEmpty() || top.getNext() == null) {
        return; 
    }
    StackNode<T> current = top;
    while (current != null) {
        StackNode<T> temp = current.getNext();
        while (temp != null) {
            if (current.getData().compareTo(temp.getData()) > 0) {
                T tempData = current.getData();
                current.setData(temp.getData());
                temp.setData(tempData);
            }
            temp = temp.getNext();
        }
        current = current.getNext();
    }
}

   
   public String toString() {
     StringBuilder result = new StringBuilder();
     StackNode<T> temp = top;
     while (temp != null) {
       result.append(temp.getData()).append(" ");
       temp = temp.getNext();
     }
     return result.toString();
   }
    
}