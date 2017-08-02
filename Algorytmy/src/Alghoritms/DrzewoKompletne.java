package Alghoritms;

public class DrzewoKompletne extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Drzewo Kompletne";
    }

    String _tree[];
    int _level;
    int _height;

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length-1;
        _tree = new String[(n)];
        int i;
        getLevel(n);
        for (i = 0; i < n; i++) {
            _tree[i] = input [i+1];
        }
        System.out.println("----------------------------");
        System.out.printf("Poziom drzewa: %d\n", _level);
        System.out.printf("Wysokość drzewa: %d\n", _height);
        System.out.printf("Korzeniem jest: %s\n", _tree[0]);

        for (int j = 0; j < _tree.length; j++) {
            String elementLewy = "";
            String element = _tree[j];
            try {
                if (elementLewy.length()==2) {
                    break;
                }
                elementLewy = _tree[2*j+1];

            }catch (Exception ex){
                System.out.println();
                System.out.printf("Element %s jest liściem", element);
            }
        }
        System.out.println();
        getSons("C");

        }
    private  void getLevel (int n) {
        int currentSize = 0;
        int iterator= 0;
        while (currentSize<n){
            currentSize = currentSize + (int)Math.pow(2d, (double)iterator);
            iterator++;
        }
        _level= _height = iterator-1;
        System.out.println("currentSize: " +currentSize + ", n :" + n
                + ", iterator :" + iterator + ", level: " + _level+ ", wysokość: " + _height);

    }

    private void getSons(String father){
        int i = 0;
        for ( i = 0; i <_tree.length ; i++) {
            if (_tree[i].equals(father))
                break;
        }
        try{
            System.out.println();
            System.out.printf("Lewym synem " + "elementu %s jest: %s\n", _tree[i], _tree[2*i+1]);
            System.out.printf("Prawym synem " + "elementu %s jest: %s\n", _tree[i], _tree[2*i+2]);
        }catch (Exception ex){
            System.out.println();
            System.out.printf("Elementem %s nie posiada syna", _tree[i]);
        }
    }
}
