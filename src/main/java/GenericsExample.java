import java.util.ArrayList;
import java.util.Arrays;

public class GenericsExample<T> {

    public void swapArrat(T[] a,T[] b){
        if (a.length == b.length){
            T temp;
            for(int i=0; i<a.length;i++)
            {
                temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }
    }

    public ArrayList<T> arrayToArrayList(T[] a){
        ArrayList<T> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(a));
        return temp;
    }
}
