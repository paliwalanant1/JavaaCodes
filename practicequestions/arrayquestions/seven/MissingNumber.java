package practicequestions.arrayquestions.seven;
//Find the missing number in an array of 1 to N.

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int missing = total - sum;
        System.out.println("Missing Number iss: " + missing);
    }
}