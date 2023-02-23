
package metodusok;


public class Metodusok {

    public static void main(String[] args) {
        int osszeg = elso10szamOsszege();
        String kimenet = "Az első 10 szám összege: " + osszeg + "\n";
        kiir(kimenet);
        
        int szam1 = 7, szam2 = 4;
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
        
       
    }
    
        public static int elso10szamOsszege() {
            int osszeg = 0;
            for(int i =0; i < 10; i++) {
                osszeg += i;
            }
            return osszeg;
            
            //System.out.println("Az első 10 szám összege: +" + osszeg);
    }
    
        public static int osszead(int a, int b){
            //System.out.printf("%d + %d = %d\n", a, b, a+b);
            return a+b;
        }
        
        public static void kiir(String szoveg){
            System.out.print(szoveg);
        }
        
}
