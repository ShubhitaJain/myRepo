import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Win 10
 * Date: 2/21/19
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class StrangelandSweetPurchase {
    public static void  main(String []arg){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputT = br.readLine();
            if(inputT!=null) {
                int t = Integer.parseInt(inputT);
                while(t--!=0) {
                    String nx[] = br.readLine().split(" ");
                    int N = Integer.parseInt(nx[0]);
                    int X = Integer.parseInt(nx[1]);
                    String notes[] = br.readLine().split(" ");
                    int nValue[]=new int[N];
                    int sum=0;
                    for(int j=0;j<N;j++){
                        int n=Integer.parseInt(notes[j]);
                        nValue[j]=n;
                        sum+=n;
                    }

                    Arrays.sort(nValue);
                    int smallestNum=nValue[0];
                    int s = sum - smallestNum;

                    if(sum/X==s/X) System.out.println(-1);
                    else System.out.println(sum/X);


                }
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
