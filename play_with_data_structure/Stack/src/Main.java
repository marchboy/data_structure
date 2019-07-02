package play_with_data_structure.Stack.src;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 5; i++){
            stack.push(i);
            System.out.print(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}

