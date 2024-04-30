 class MaxIncomeCalculator {

    public static int solution(int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }

        int maxIncome = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                maxIncome += A[i] - A[i - 1];
            }
        }

        return maxIncome;
    }

    
}

public class Randompblm {

	public static void main(String[] args) {

        int[] A1 = {4, 1, 2, 3};
        int[] A2 = {1, 2, 3, 3, 2, 1, 5};
        
        System.out.println(MaxIncomeCalculator.solution(A1));
       // System.out.println(A1);// Output: 6
        System.out.println(MaxIncomeCalculator.solution(A1)); // Output: 7

	}

}
