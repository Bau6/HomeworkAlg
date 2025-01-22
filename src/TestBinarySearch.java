import java.util.Comparator;

public class TestBinarySearch {
    public static void main(String[] args) {
        byte[] testArray = {1, 3, 5, 7, 9};
        byte el1 = 5;
        byte el2 = 7;

        char[] testArrayChar = {'a', 'b', 'c', 'd', 'e'};
        char charEl1 = 'e';
        char charEl2 = 'd';

        double[] testArrayDouble = {1.0, 5.0, 1.5, 2.32, 2.1};
        double doubleEl1 = 2.32;
        double doubleEl2 = 5.0;

        float[] testArrayFloat = {1.0F, 5.0F, 1.5F, 2.32F, 2.1F};
        float floatEl1 = 1.5F;
        float floatEl2 = 1.0F;

        int[] testArrayInt = {1, 5, 15, 23, 21};
        int intEl1 = 15;
        int intEl2 = 1;

        long[] testArrayLong = {1L, 5L, 15L, 23L, 21L};
        long longEl1 = 15L;
        long longEl2 = 5L;

        short[] testArrayShort = {1, 5, 15, 23, 21};
        short shortEl1 = 23;
        short shortEl2 = 5;

        String[] testArrayString = {"a", "c", "b", "d", "e"};
        String stringEl1 = "e";
        String stringEl2 = "c";

        // Проверка метода binarySearch(byte[], byte)
        System.out.println("byte");
        System.out.println("Индекс элемента " + el2 + ": "
                + ((int) Arrays.binarySearch(testArray, el2)));

        // Проверка метода binarySearch(byte[], int, int, byte)
        System.out.println("Индекс элемента " + el1 + " в диапазоне: "
                + ((int) Arrays.binarySearch(testArray, 2, 4, el1)));

        // Проверка метода binarySearch(char[], char)
        System.out.println("char");
        System.out.println("Индекс элемента " + charEl1 + ": "
                + ((int) Arrays.binarySearch(testArrayChar, charEl1)));

        // Проверка метода binarySearch(char[], int, int, char)
        System.out.println("Индекс элемента " + charEl2 + " в диапазоне: "
                + ((int) Arrays.binarySearch(testArrayChar, 2, 4, charEl2)));

        // Проверка метода binarySearch(double[], double)
        System.out.println("double");
        System.out.println("Индекс элемента " + doubleEl1 + ": "
                + (Arrays.binarySearch(testArrayDouble, doubleEl1)));

        // Проверка метода binarySearch(double[], int, int, double)
        System.out.println("Индекс элемента " + doubleEl2 + " в диапазоне: "
                + (Arrays.binarySearch(testArrayDouble, 0, 2, doubleEl2)));

        // Проверка метода binarySearch(float[], float)
        System.out.println("float");
        System.out.println("Индекс элемента " + floatEl1 + ": "
                + (Arrays.binarySearch(testArrayFloat, floatEl1)));

        // Проверка метода binarySearch(float[], int, int, float)
        System.out.println("Индекс элемента " + floatEl2 + " в диапазоне: "
                + (Arrays.binarySearch(testArrayFloat, 0, 2, floatEl2)));

        // Проверка метода binarySearch(int[], int)
        System.out.println("int");
        System.out.println("Индекс элемента " + intEl1 + ": "
                + Arrays.binarySearch(testArrayInt, intEl1));

        // Проверка метода binarySearch(int[], int, int, int)
        System.out.println("Индекс элемента " + intEl2 + " в диапазоне: "
                + Arrays.binarySearch(testArrayInt, 0, 2, intEl2));

        // Проверка метода binarySearch(long[], long)
        System.out.println("long");
        System.out.println("Индекс элемента " + longEl1 + ": "
                + Arrays.binarySearch(testArrayLong, longEl1));

        // Проверка метода binarySearch(long[], int, int, long)
        System.out.println("Индекс элемента " + longEl2 + " в диапазоне: "
                + Arrays.binarySearch(testArrayLong, 0, 2, longEl2));

        // Проверка метода binarySearch(short[], short)
        System.out.println("short");
        System.out.println("Индекс элемента " + shortEl1 + ": "
                + Arrays.binarySearch(testArrayShort, shortEl1));

        // Проверка метода binarySearch(short[], int, int, short)
        System.out.println("Индекс элемента " + shortEl2 + " в диапазоне: "
                + Arrays.binarySearch(testArrayShort, 0, 2, shortEl2));

        // Определение компаратора для строк
        System.out.println("Comparator");
        Comparator<String> stringComparator = Comparator.naturalOrder();

        // Проверка метода binarySearch(T[], T, Comparator)
        System.out.println("Индекс элемента " + stringEl1 + ": "
                + Arrays.binarySearch(testArrayString, stringEl1, stringComparator));

        // Проверка метода binarySearch(T[], int, int, T, Comparator)
        System.out.println("Индекс элемента " + stringEl2 + " в диапазоне: "
                + Arrays.binarySearch(testArrayString, 0, 3, stringEl2, stringComparator));
    }
}