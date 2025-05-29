public class ReverseArray {

    public int[] Reverse(int[] arr)
    {
        int[] arrRev = new int[arr.length];
        int tracker = 0;
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; --i)
        {
            temp = arr[i];
            arrRev[tracker] = temp;
            ++tracker;
        }
        return arrRev;
    }

    public void print(int[] arr)
    {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++)
        {
            if (i != arr.length - 1)
            {
                System.out.printf("%d, ", arr[i]);
            }
            else
            {
                System.out.printf("%d", arr[i]);
            }

        }
        System.out.print("}");
    }
}
