
/**
 *SOLID Principles
 * SOLID is an acronym for the first five object-oriented design (ODD)
 * principles by Robert C. Martin
 *
 * S ->
 * O -> Open Closed Principle -
 *              Objects or entities should be open for extension but closed for modification.
 * L ->
 * I ->
 * D ->
 */

public class OpenClosedExp1 {
    public static void main(String[] args) {

        int[] arr = {1,3,8,6,9,2,15};
        ArrayUtil.sort(arr,new DescComparator());
        System.out.println("After sorting values in array are = ");
        for (int value : arr) {
            System.out.println(value+"");
        }


    }
}

interface ValueComparator{

    /**
     * @return +ve if value1>value2,-ve if value1<value2,0 if value1 = value2
     */
    int compare(int value1,int value2);
}

class ArrayUtil{
    public static void sort(int[] arr , ValueComparator comparator){
        for(int i = 0;i< arr.length;i++){
            for(int j = i + 1;j< arr.length;j++){
                if (comparator.compare(arr[i],arr[j]) > 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


class AscComparator implements ValueComparator{
    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}
class DescComparator implements ValueComparator{
    @Override
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}

