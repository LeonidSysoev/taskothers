import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println("array = " + array[i]);
        }
        int t;
        int[] arr = new int[size];
        for (int i = 0; i < array.length; i++) {
            t = array[i];
            arr[i] = array[array.length - i - 1];
            arr[array.length - i - 1] = t;
            System.out.println("array = " + arr[i]);
        }

        String str = "потоп";

        if (isPalindrome(str)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }

        String str1 = "Picnick";
        String s1 = str1.substring(0, str1.length() / 2);
        String s2 = str1.substring(str1.length() / 2, str1.length());
        System.out.println(s1 + " " + s2);

        String[] arrStr = {"aaa", "aaa", "bbb", "ddd", "gfsdffds", "ccc", "bbb", "aaa", "ddd"};

        for (int i = 0; i < arrStr.length; i++) {
            for (int j = i + 1; j < arrStr.length; j++) {
                if (arrStr[i] == null) {
                    break;
                }
                if (arrStr[i].equals(arrStr[j])) {
                    arrStr[j] = null;
                }
            }
        }

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i] != null) {
                System.out.print(arrStr[i]);
            }

        }
        System.out.println();
        int value = 33;
        Integer value1 = 33;
        changeValue(value);
        changeValue(value1);
        System.out.println("changeValue(value) = " + value);
        System.out.println("changeValue(value) = " + value1);
        Integer[] value2 = new Integer[]{3, 4};
        changeValue(value2);
        System.out.println("value2 = " + Arrays.toString(value2));
        changeValue4(value2);
        System.out.println("value2 = " + Arrays.toString(value2));


    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void changeValue(int value) {
        value = 22;

    }
    public static void changeValue(Integer value) {
        value = 22;

    }

    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};

    }
    public static void changeValue4(Integer[] value) {
        value[0] = 99;


    }
}

