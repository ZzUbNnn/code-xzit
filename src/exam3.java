import java.util.Scanner;/** * @param * @author Administrator * @date 2021/3/31 0031 18:52 * @throws Exception */public class exam3 {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int num_ji = 0;        int num_ou = 0;        for(int i=0;i<n;i++){            int x =sc.nextInt();            if(x%2==0){                num_ou++;            }else if(x%2==1){                num_ji++;            }        }        System.out.println(num_ji+" "+num_ou);    }}