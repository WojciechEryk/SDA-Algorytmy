public class FizzBuzz {

    public String [] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = getStringRepresantation(i);
        }
            return result;
    }


    private String getStringRepresantation(int elementIndex){
            if((elementIndex+1)%15==0){
                return "FizzBuzz";}
            if((elementIndex+1)%3==0){
                return  "Fizz";}
            if((elementIndex+1)%5==0){
                return "Buzz";}
            else {
                return elementIndex + 1 + "";}
    }
}
