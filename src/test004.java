import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.util.HashMap;/** * @param * @author Administrator * @date 2021/3/26 0026 19:30 * @throws Exception */public class test004 {    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        int N = Integer.parseInt(br.readLine());        HashMap<String,String[]> map = new HashMap<String,String[]>();        while(N-->0){            String[] line = br.readLine().split(" ");            String[] data = new String[2];            data[0]=line[0];            data[1]=line[2];            map.put(line[1],data);        }        int M = Integer.parseInt(br.readLine());        String[] query = br.readLine().split(" ");        for(int i=0;i<M;i++){            String[] data2 = map.get(query[i]);            System.out.println(data2[0]+" "+data2[1]);        }    }}