
package metodusok;


public class Metodusok {

    public static void main(String[] args) {
       
    }
    
        public static void elso10szamOsszege() {
            int osszeg = 0;
            for(int i =0; i < 10; i++){
                osszeg += i;
            }
            
            System.out.println("Az első 10 szám összege: +" + osszeg);
    }
    
        public static void osszead(int a, int b){
            System.out.printf("%d + %d = %d\n", a, b, a+b);
        }
        
}
