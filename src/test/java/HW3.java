public class HW3 {

    public int[] First(int[] arr)//Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
    {
        int hlen = arr.length / 2;
        int cpos = hlen + arr.length % 2;
        for (int i = 0; i < hlen; i++) {
            int t = arr[i];
            arr[i] = arr[cpos + i];
            arr[cpos + i] = t;
        }
        return arr;
    }
    public int[] Second(int[] arr)//Отсортировать массив (пузырьком (Bubble)
    {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
