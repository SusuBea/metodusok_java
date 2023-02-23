
package metodusok;


public class Metodusok {

    public static void main(String[] args) {
        int osszeg = osszead();
        String kimenet = "4 szám összege: " + osszeg + "\n";
        kiir(kimenet);
        
        int szam1 = 7, szam2 = 4, szam3 = 5, szam4= 9;
        kiir("%d + %d + %d + %d = %d\n".formatted(szam1, szam2, szam3, szam4, osszeg));
        
       
    }
    
        public static int elso10szamOsszege() {
            int osszeg = 0;
            for(int i =0; i < 10; i++) {
                osszeg += i;
            }
            return osszeg;
            
            //System.out.println("Az első 10 szám összege: +" + osszeg);
    }
    
        public static int osszead(int a, int b, int c, int d){
            //System.out.printf("%d + %d = %d\n", a, b, a+b);
            return a+b+c+d;
        }
        
        public static void kiir(String szoveg){
            System.out.print(szoveg);
        }
        
}
