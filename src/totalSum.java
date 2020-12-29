
public class totalSum {

	public static void main(String[] args) {
		System.out.println(getTotalSum(6));
	}

	private static String getTotalSum(int n) {
		// 들여쓰기의(indent)의 depth가 최대한 줄이는게 좋습니다.
		// https://tangoblog.tistory.com/4
		// 반복문에서는 문자열을 +하여 조작 하는것 보다 StringBuilder 인스턴스를 생성해서 문자열 조작을 해주는 편이 효율이 좋습니다.
		// https://cjh5414.github.io/why-StringBuffer-and-StringBuilder-are-better-than-String/
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < n; i++) {
			sb.append("[").append(i).append(",").append(n - i).append("]").append("\n");
		}

		return sb.toString();
	}

}
