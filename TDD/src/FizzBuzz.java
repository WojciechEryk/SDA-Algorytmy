public class FizzBuzz {

    public String [] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            transformElement(result, i);
        }
            return result;
    }


    private void transformElement(String[] result, int i){

            if ((i+1)%3==0){
                result[i] = "Fizz";}
            else if((i+1)%5==0){
                result[i] = "Buzz";}
            else {
                result[i] = i + 1 + "";}
    }
}
