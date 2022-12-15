import java.util.Scanner;
public class harmonikSayi {
    public static void main(String[] args){         /* Harmonik ortalama, seride yer alan sayıların tersine bölünmesiyle hesaplanır.1+1/2+...+1/n .                                                                            */
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        int n=input.nextInt();
        double result=0;

        for(int i=1;i<=n;i++){
            result+=(1.0/i);
        }
        System.out.print("HARMONİK ORTALAMASI:"+result);
    }

}
