package CH4Stack.StackApplication;

public class HanoilTower {
    public static void main(String[] args) {
        hanoil(3 ,1 ,2 ,3);
        System.out.println(count);
    }

    static int count = 0;

    /**
     * step1. 將n-1個盤子，從p1移到p2
     * step2. 將第n個盤子，從p1移到p3
     * step3. 將n-1個盤子，從p2移到p3
     *
     * @param n     number of plates
     * @param p1    1st stick
     * @param p2    2nd stick
     * @param p3    3rd stick
     */
    public static void hanoil(int n , int p1 , int p2 , int p3){
        if(n==1){
            System.out.println("Moved "+n+" plate from "+p1+" to "+p3);
            count++;
        }else{
            hanoil(n-1 , p1 , p3 , p2);
            System.out.println("Moved "+n+" plate from "+p1+" to "+p3);
            count++;
            hanoil(n-1 , p2 , p1 , p3);
        }
    }
}
