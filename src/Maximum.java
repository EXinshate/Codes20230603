public class Maximum {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if( y.compareTo( max ) > 0 ){
            max = y;
        }
        if ( z.compareTo(max) > 0 ){
            max = z;
        }
        return max;
    }
    public static void main(String args[]){
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3,4,5, maximum(3,4,5));
        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 4.4, 6.6, 7.8, maximum(4.4, 6.6, 7.8));
    }
}
