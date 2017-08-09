package Alghoritms;

import java.util.Stack;


public class OdwrotnaNotacja2 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Odwrotna Notacja 2";
    }

    @Override
    public void runAlgorithm(String[] input) {

        System.out.println();

        Stack<String> stack = new Stack<>();


        for (int i = 1; i <input.length ; i++) {
            switch (input[i]){

                case "+":
                    if(stack.size()!=0) {
                        if (!stack.peek().equals("-")){
                            stack.push(input[i]);
                        }else{
                            System.out.print(stack.pop());
                            stack.push(input[i]);
                        }
                    }else{stack.push(input[i]);
                    }
                    break;
                case "-":

                    if(stack.size()!=0) {
                        if (!stack.peek().equals("+")){
                            System.out.print(stack.pop()+" ");
                            stack.push(input[i]);
                        }else{
                            stack.push(input[i]);
                        }
                    }else{stack.push(input[i]);
                    }
                    break;

                case "&":
                    if(stack.size()!=0) {
                        if (!stack.peek().equals("+")||!stack.peek().equals("-")||!stack.peek().equals("/")){
                            stack.push(input[i]);
                        }else{
                            System.out.print(stack.pop());
                            stack.push(input[i]);
                        }
                    }else{stack.push(input[i]);
                    }
                    break;

                case "/":
                    if(stack.size()!=0) {
                        if (!stack.peek().equals("+")||!stack.peek().equals("-")||!stack.peek().equals("*")){
                            stack.push(input[i]);
                        }else{
                            System.out.print(stack.pop());
                            stack.push(input[i]);
                        }
                    }else{stack.push(input[i]);
                    }
                    break;

                case "(":
                    stack.push(input[i]);
                    break;

                case ")":
                        while (stack.size()!=0) {
                            if (!stack.peek().equals("(")) {
                                System.out.print(stack.pop() + " ");
                            }else {
                                stack.pop();
                            }
                        }
                    break;

                case "^":
                    stack.push(input[i]);
                    break;

                case "=":
                    System.out.print(stack.pop() + " ");
                    break;

                    default:
                        System.out.printf(input[i]+ " ");

            }
        }
    }
}
