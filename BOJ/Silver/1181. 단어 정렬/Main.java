import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();

		}

		Arrays.sort(str, (a, b) -> {
			// 길이 비교
			// 짧은 것 부터 배치 
			if (a.length() != b.length()) {
				return a.length() - b.length();
			}
			return a.compareTo(b);
		});
		
		StringBuilder sb = new StringBuilder();
		for (String s : str) {
			sb.append(s).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
