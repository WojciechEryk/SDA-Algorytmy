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
//            case "flamaster":
//                return new Flamaster();
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
//                return new PalindromeNumbers();
            case "sortowaniewzgledempunktu":
                return new SortowanieWzgledemPunktu();
            case "prostetablice":
                return new ProsteTablice();
            case "statki":
                return new Statki();
            case "warcaby":
                return new Warcaby();
            case "rekurencjadzielnik":
                return new RekurencjaDzielnik();
//            case "tablicedominata":
//                return new TabliceDominata();
            case "wyznaczaniedatywielkanocy":
                return new WyznaczenieDatyWielkanocy();
            case "spacjecamelcase":
                return new SpacjeCamelCase();
            case "mrandom":
                return new mRandom();
            case "maxminrandom":
                return new MaxMinTablica();
            case "lider":
                return new Lider();
            case "testowanielisty":
                return new TestowanieListy();
            case "zadankotworzenielisty":
                return new ZadankoTworzenieListy();
            case "drzewokompletne":
                return new DrzewoKompletne();
            case "testujemykopca":
                return new TestujemyKopiec();
            case "binarnyiinne":
                return new BinarnyIIinne();
            case "odwrotnanotacjapolska":
                return new OdwrotnaNotacjaPolska();
            case "zmienneitablice":
                return new ZmienneITablice();
            case "arraylistazadanie":
                return new ArrayListZadanko();
            case "wlasnalista":
                return new WlasnaLista();
            case "stosarraylist":
                return new StosArrayList();
            case "odwrotnanotacja2":
                return new OdwrotnaNotacja2();
            case "sitoerastotelesa":
                return new SitoErastotelesa();
            case "najmniejszawspolnawielokrotnosc":
                return new NajmniejszaWspolnaWielokrotnosc();
            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
