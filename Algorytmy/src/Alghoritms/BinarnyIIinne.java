package Alghoritms;


import java.util.Stack;

public class BinarnyIIinne extends AbstractAlgorithm
{
    @Override
    public String getName() {
        return " BinarnyIIinne i inne";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer>stosik = new Stack<>();
        int liczba = Integer.parseInt(input[2]);
        int JakiSystem = Integer.parseInt(input[1]);

        while(liczba>0){
            stosik.push(liczba%JakiSystem);
            liczba=liczba/JakiSystem;
        }
        while (!stosik.empty()){

        switch (stosik.peek()) {
            case 1:
                System.out.printf("1");
                stosik.pop();
                break;
            case 2:
                System.out.printf("2");
                stosik.pop();
                break;
            case 3:
                System.out.printf("3");
                stosik.pop();
                break;
            case 4:
                System.out.printf("4");
                stosik.pop();
                break;
            case 5:
                System.out.printf("5");
                stosik.pop();
                break;
            case 6:
                System.out.printf("6");
                stosik.pop();
                break;
            case 0:
                System.out.printf("0");
                stosik.pop();
                break;
            case 7:
                System.out.printf("7");
                stosik.pop();
                break;
            case 8:
                System.out.printf("8");
                stosik.pop();
                break;
            case 9:
                System.out.printf("9");
                stosik.pop();
                break;
            case 10:
                System.out.printf("A");
                stosik.pop();
                break;
            case 11:
                System.out.printf("B");
                stosik.pop();
                break;
            case 12:
                System.out.printf("C");
                stosik.pop();
                break;
            case 13:
                System.out.printf("D");
                stosik.pop();
                break;
            case 14:
                System.out.printf("E");
                stosik.pop();
                break;
            case 15:
                System.out.printf("F");
                stosik.pop();
                break;
            default:
                System.out.println("Błąd");

        }
        }
    }
}
