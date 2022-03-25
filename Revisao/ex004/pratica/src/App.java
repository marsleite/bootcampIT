import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // deletar o ultimo elemento do arr
        int min,max,sum;
        sum = min = max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
        sum += arr[i];
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
        }
        System.out.println("Soma: " + (sum - max - min));

    }
}
