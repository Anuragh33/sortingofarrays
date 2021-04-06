import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  int ln1,ln2,ln;
  int[] a1 = new int[] {0,3,4,31};
   int[] a2 = new int[] {4,6,30};
   ln1 = a1.length;
   ln2 = a2.length;
   ln = ln1 + ln2;
   int[] b = new int[ln];
        for(int i = 0; i < ln1 ; i++ ){
         b[i] = a1[i];
       }
       for(int i = 0; i < ln2 ; i++ ){
        b[ln1 + i] = a2[i] ;
       }
        Arrays.sort(b);
       System.out.println(Arrays.toString(b));
  }
}
