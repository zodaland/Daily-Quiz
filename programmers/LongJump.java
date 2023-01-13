package dev;

public class LongJump {
	// 문제 결과 후 나머지 값 구하기
	public long tempSol(int n) {
		return n == 0 ? 0 : noc(n) % 1234567;
	}
	
	// 재귀 탐색 - 시간 초과
	public long noc(int n) {
		int ans = 0;
		if (n >= 2) {
			ans += noc(n - 2);
		}
		if (n >= 1) {
			ans += noc(n - 1);
		} else {
			return 1;
		}
		
		return ans;
	}
	
	// 피보나치 - 시간 초과
	public long piv(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			return piv(n - 1) + piv(n - 2);
		}
	}
	
	// 루프 - 범위 초과
	public long last(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		
		long prev = 2;
		long sol = 3;
		
		for (int i = 4; i <= n; i++) {
			long temp = sol;
			sol += prev;
			prev = temp;
		}
		
		return sol;
	}
	
	// 정답
	public long sol(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		
		long prev = 2;
		long sol = 3;
		
		for (int i = 4; i <= n; i++) {
			long temp = sol;
			sol = (sol + prev) % 1234567;
			prev = temp;
		}
		
		return sol;
	}
}
