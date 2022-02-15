import java.util.Scanner;
public class dairealan {
    public static void main(String[] args) {
        int  alfa ,r;
        double pi= 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("çemberin yarıçapını giriniz");
        r=inp.nextInt();
        System.out.println("merkez açısını giriniz");
        alfa= inp.nextInt();
        double dilimalan=(alfa*(r*r)*pi)/360;

        System.out.println("Daire Diliminin alanı:"+" "+dilimalan);



    }
}
