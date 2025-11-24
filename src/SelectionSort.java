public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("Sorted array:");
        for (int num : numbers) System.out.print(num + " ");
    }
}

