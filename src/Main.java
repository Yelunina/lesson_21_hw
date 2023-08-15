//реализовать программу сортировки массива (используя сортировку выбором )
public class Main {
    public static void main(String args[]) {
        int[] sortArr = {77,-3, 0, 35, 99, -12, 10,105,12,-35};
        selectionSort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }
    }

    public static void selectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i; //pos - индекс наименьшего элемента
            int min = sortArr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            //меняем местами наименьший с sortArr[i]
            sortArr[i] = min;
        }
    }


}