public class JumpAndTeleport {
	public int solution(int n) {
		if (n == 0) {
			return 0;
		} else if (n % 2 == 0) {
			return solution(n / 2);
		} else {
			return 1 + solution(n - 1);
		}
    }
	
	// 효율성 땡
	public int solution2(int n) {
		int temp = n;
		int sol = 0;
		while (temp != 0) {
			if (temp % 2 == 0) {
				temp = temp / 2;
			} else {
				temp = temp - 1;
				sol++;
			}
		}
		
        return sol;
    }
}
