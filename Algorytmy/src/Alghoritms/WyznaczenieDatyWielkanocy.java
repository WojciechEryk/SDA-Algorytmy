package Alghoritms;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WyznaczenieDatyWielkanocy extends AbstractAlgorithm{
    @Override
    public String getName() {
        return " Wyznaczanie Daty Wielkanocy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int k;
        int l;
        int m;
        int p;

        int rok = Integer.parseInt(input[1]);
        a = rok%19;
        b = rok/100;
        c = rok%100;
        d = b/4;
        e = b%4;
        f = ((b+8)/25);
        g = ((b-f+1)/3);
        h = (19*a+b-d-g+15)%30;
        i = c/4;
        k = c%4;
        l = (32+2*e+2*i-h-k)%7;
        m = (a+11*h+22*l)/451;
        p = (h+l-7*m+114)%31;

        System.out.println("a = " + + a);
        System.out.println("b = " + b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        System.out.println("e = " +e);
        System.out.println("f = " +f);
        System.out.println("g = " +g);
        System.out.println("h = " +h);
        System.out.println("i = " +i);
        System.out.println("k = " +k);
        System.out.println("l = " +l);
        System.out.println("m = " +m);
        System.out.println("p = " +p);

        System.out.println();
        System.out.println("------------------------");
        System.out.println(

        );
        int dzien = p +1;
        int miesiac = (h+l-7*m+113)/31;
        System.out.print(dzien);
        if (miesiac ==4){
            System.out.print(" Kwietnia");
        }else{
            System.out.print(" Marca");
        }
        System.out.println();
    }
}
