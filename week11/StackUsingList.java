    package week11;

    import java.util.ArrayList;

    public class StackUsingList {
        private ArrayList<String> stack;
        public int top;

        public StackUsingList() {
            this.stack = new ArrayList<String>();
            this.top = 0;
        }

        public void push (String newItem) {
            this.stack.add(newItem);
            this.top++;
        }

        public String pop() {
            if(this.top == 0) {
                throw new IllegalStateException("Stack is empty.");
            }
            String item = this.stack.remove(top-1);
            this.top--;
            return item;
        }

        public String toString() {
            String currentStack = "";
            
            for(String item: this.stack) {
                currentStack += "\n" + item;
            }
            return currentStack;
        }
    }
