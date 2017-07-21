import Alghoritms.AbstractAlgorithm;

public class Main {

    public static void main (String[] args) throws Exception {
        String algorithmName = args [0];

        for (int i=0; i<args.length; i++){
            System.out.println(args[i]);}

        System.out.println("----------------");

        for (String s:args) {
            System.out.println(s);}

        AlgorithmFactory factory = new AlgorithmFactory();
        AbstractAlgorithm algorithm =
                factory.getAlgorithm(algorithmName);

        algorithm.runAlgorithm(args);
        }
}

