import java.util.Comparator;
import java.util.Arrays;

public class BinarySearch {

    /**
     * Returns the index of the first key in a[] that equals the search key, 
     * or -1 if no such key exists. This method throws a NullPointerException
     * if any parameter is null.
     */
    public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator) { 
       if (a == null || key == null || comparator == null) {
          throw new NullPointerException();
       }
       Arrays.sort(a, comparator);
       int first = 0; 
       int last = a.length - 1;
       while (first <= last) {
          int middle = (first + last) / 2;
          if (comparator.compare(a[middle], key) < 0)
             last = middle - 1;
          else if (comparator.compare(a[middle], key) > 0)
             first = middle + 1;
          else 
             return middle; 
          }
          return -1;
       }
          // if (comparator.compare(a[middle], key) == 0) {
//              if ((middle - 1 >= 0) && (comparator.compare(a[middle - 1], k == 0))) {
//                 last = middle - 1; 
                
                
          
       
    

    /**
     * Returns the index of the last key in a[] that equals the search key, 
     * or -1 if no such key exists. This method throws a NullPointerException
     * if any parameter is null.
     */
    public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator) { 
          if (a == null || key == null || comparator == null) {
          throw new NullPointerException();
          }
          Arrays.sort(a, comparator);
       int first = 0; 
       int last = a.length - 1;
       while (first <= last) {
          int middle = (first + last) / 2;
          if (key > a[middle])
             last = middle - 1;
          else if (key < a[middle])
             first = middle + 1;
          else 
             return middle; 
          }
          return -1;
       
       
    }
    
}