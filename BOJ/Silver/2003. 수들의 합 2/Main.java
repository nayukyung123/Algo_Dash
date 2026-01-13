import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int start = 0; // 시작
		int end = 0; // 끝
		int sum = 0;
		int cnt = 0;

		while (true) {
			if (sum >= start) { // 합 > m
				sum -= arr[start++];
			} else if (end == n) {// 끝까지 탐색완료 
				break;
			} else { // 합 < m
				sum += arr[end++];
			}
			if (sum == m) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
