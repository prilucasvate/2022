import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class f277 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            ArrayList aa = new ArrayList<>();
            HashMap<Integer, String> mr = new HashMap<>();
            String aq = sc.nextLine();
            int a = Integer.parseInt(aq);
            for (int i = 0; i < a; i++) {
                String get = sc.nextLine();
                String[] temp = get.split(" ");
                int sort = spilt(get);
                mr.put(sort, get);
                aa.add(sort);
            }
            Collections.sort(aa);
            for (int kk = 0; kk < aa.size(); kk++) {
                String ok = mr.get(aa.get(kk));
                String[] tb = ok.split(" ");
                System.out.println(tb[1] + " " + tb[2] + " " + tb[0]);
                System.out.println(tb[3]);
            }
        }
    }

    public static int spilt(String get) {
        String []tp=get.split(" ");
        int p1=Integer.parseInt(tp[1])*100000;//-----------------------------spilt
        int p2=Integer.parseInt(tp[2]);
       // System.out.println(p1+p2);
        return p1+p2;
    }
}
