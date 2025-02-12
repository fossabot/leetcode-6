package design;

import java.util.Stack;

/**
 * @ClassName design.MinStack
 * @Description #155 最小栈
 * @Author MatthewHan
 * @Date 2020/4/20 16:14
 * @Version 1.0
 **/
public class MinStack {


    Stack<Integer> stack;
    Stack<Integer> minStack;

    /**
     * 执行用时 : 6 ms , 在所有 Java 提交中击败了 97.91% 的用户
     * 内存消耗 : 41.7 MB , 在所有 Java 提交中击败了 14.46% 的用户
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

        if (minStack.empty()) {
            minStack.push(x);
        } else if (x >= minStack.peek()) {
            minStack.push(x);
        } else {
            for (int i = 0; i <= minStack.size(); i++) {
                if (x < minStack.get(i)) {
                    minStack.insertElementAt(x, i);
                    break;
                }
            }
        }

    }

    public void pop() {
        minStack.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.firstElement();

    }

    @Override
    public String toString() {
        return "design.MinStack{" +
                "stack=" + stack +
                ", minStack=" + minStack +
                '}';
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-11);
        minStack.push(-1);
        System.out.println(minStack.toString());
        System.out.println(minStack.getMin());


        minStack.pop();
        minStack.top();

        System.out.println(minStack.getMin());


    }


}

/*
 * Your design.MinStack object will be instantiated and called as such:
 * design.MinStack obj = new design.MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
