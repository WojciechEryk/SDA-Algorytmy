package Alghoritms;


public class PalindromeNumbers extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Palindrome Numbers";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int kk = 0;
        for (int i = 1; i < input.length; i++) {
            char[] table = input[i].toCharArray();
            if (table[i] == table[table.length]) {
                kk = 1;
            } else {
                kk = 0;
            }
            if(kk==1){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }
        }

    }
}
