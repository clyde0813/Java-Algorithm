import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10830 {
    public static void main(String[] args) throws Exception {
        new B10830().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());

        int[][] matrix = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int j=0; j<N; j++) arr[j] = Integer.valueOf(st.nextToken());
            matrix[i] = arr;
        }


    }
}