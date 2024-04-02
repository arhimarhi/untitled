import java.util.Scanner;


public class QWE {
    public static void main(String[] args) {
        int[] massiv0 = new int[5]; //объявление переменной и выделение памяти для 5 целых чисел
        //массив уже заполнен 0
        int[] massiv1 = {12, 16, 13, -8, 7, 9};

        int[] massiv2 = inputArray();

        // printArray("массив0 содержит ", massiv0);
        // printArray("массив1 содержит ", massiv1);
        printArray("массив2 содержит ", massiv2);
        // fillArray(massiv0, 193);
        // printArray("массив0 содержит ", massiv0);


//        printArray("массив2 содержит ", massiv2);

    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    public static void fillArray(int[] m, int filler) {
        for (int i = 0; i < m.length; i++) {
            m[i] = filler;
        }
    }

    public static void readArray(int[] m) {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("введите " + m.length + " элементов массива");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
        }
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива 2");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }


    public static int sumArray(int[] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++)
            sum += m[i];
        return sum;
    }


    public static int minElement(int[] m) {
        int min = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
            }
        }
        return min;
    }

    public static int maxElementNumber(int[] m) {
        int max = m[0];
        int numMax = 0;
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                numMax = m[i];
            }
        }
        return numMax;
    }

    public static int swapMinMax(int[] m) {
        int max = m[0], min = m[0], maxNumber = 0, minNumber = 0;
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
                maxNumber = i;
            }
            if (m[i] < min) {
                min = m[i];
                minNumber = i;
            }
        }
        m[maxNumber] = min;
        m[minNumber] = max;

        return 0;
    }

    public static int searchNumberOfX(int x, int[] m) {
        for (int i = 1; i < m.length; i++) {
            if (m[i]==x)
                return i;
        }
        return -1;
    }

    public static int searchNearestNumberByModule(int x, int[] m) {
        int minNumber = x - m[0];
        int j = 0;
        for (int i = 1; i<= m.length; i--) {
            if ((x - m[i] < minNumber))
                minNumber = x;
            j = i;
        }
        return j;
    }

    public static int backNumberOf(int[] m) {
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.println(m[i] + "");
        }
        System.out.println("");
    }
}





