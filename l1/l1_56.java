import java.util.Scanner;/** * @param * @author Administrator * @date 2021/4/12 0012 21:33 * @throws Exception */public class l1_56 {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n =  sc.nextInt();        String[] name = new String[n];        int[] shu = new int[n];        int sum =0;        for(int i=0;i<n;i++){            name[i]=sc.next();            shu[i]=sc.nextInt();            sum+=shu[i];        }        int average = sum/n/2;        for(int i=0;i<n;i++){            int s = shu[i]-average;            shu[i]=Math.abs(s);        }        int index =getMin(shu);        System.out.println(average+" "+name[index]);    }    public static int getMin(int[] a){        int min=a[0];        int index=0;        for(int i=1;i<a.length;i++){            if(min>a[i]){                min=a[i];                index=i;            }        }        return  index;    }}