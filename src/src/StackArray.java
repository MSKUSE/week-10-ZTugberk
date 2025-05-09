import java.util.ArrayList;;
public class StackArray implements Stack {
    private ArrayList<Object> stack=new ArrayList<>();

    @Override
    public void push(Object item) {
        stack.add(index: 0,item);
    }
    @Override
    Public Object pop(){
        return stack.remove(index:0);
    }
    @Override
    public void peek(){
        System.out.println("The top is "+stack.get(0));
    }
    @Override
    public boolean isEmpty()
}
