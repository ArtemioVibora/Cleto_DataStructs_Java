public class Driver {

    public static ReverseArray reverseArray = new ReverseArray();

    public static void main(String[] args) {


        int[] arr =  {1, 2, 3, 4, 5};
        arr = reverseArray.Reverse(arr);
        reverseArray.print(arr);

    }

}
