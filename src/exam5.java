import java.util.Scanner;/** * @param * @author Administrator * @date 2021/3/31 0031 19:15 * @throws Exception */            public class exam5 {                public static void main(String[] args) {                    Scanner sc = new Scanner(System.in);                    int n =sc.nextInt();                    if(n<=5){                        System.out.println(n+2);                    }else if(n>5){                        System.out.println((n+2)%7);        }    }}