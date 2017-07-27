import Alghoritms.*;


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
            case "silnia":
                return new Silnia();
            case "rekurencjasuma":
                return new RekurencjaSuma();
            case "silniadziesiatkijednosci":
                return new SilniaDziesiatkiJednosci();
            case "fibonacci":
                return new Fibonacci();
            case "szyfrcezara":
                return new SzyfrCezara();
            case "sortowaniebabelkowe":
                return new SortowanieBabelkowe();
            case "palindromenumbers":
                return new PalindromeNumbers();
            case "sortowaniewzgledempunktu":
                return new SortowanieWzgledemPunktu();
            case "prostetablice":
                return new ProsteTablice();
            case "statki":
                return new Statki();
            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
