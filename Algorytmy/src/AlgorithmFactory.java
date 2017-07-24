import Alghoritms.*;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgorithmFactory {


    public AbstractAlgorithm getAlgorithm(String name) throws Exception{
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return  new BiednyCamelCase();
            case "sumowanieliczbnaturalnych":
                return new SumowanieLiczbNaturalnych();
            case "sumaliczb":
                return new SumaLiczb();
            case "banknotyimonety":
                return new BanknotyIMonety();
            case "rokprzestepny":
                return new RokPrzestepny();
            case "flamaster":
                return new Flamaster();
            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
