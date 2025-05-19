class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
		// GCD 구하기 (유클리드 호제법)
		int a = n;
		int b = m;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		int gcd = a;

		// LCM 구하기
		int lcm =(n*m) / gcd;

		answer = new int[]{gcd, lcm};
		return answer;
    }
}