package tt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class sortvocfile {

//note start

//20211120-1 can just sort voc and show lesson
//20211215-2 can store voc to c:\\ and delete useless words
//20220105-3 can let user set document name	
// N/A  can use R1~R3,jframe...(15

	public static void main(String[] args) throws IOException {
		System.out.println("<<<排單字神器>>>: 輸入單字，如想刪除在下一行輸入<!>，如要指定課數，輸入<1~9>，輸入完畢在最下行打<0>，上限999個單字");
		int n = 1, w = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		String months[] = { "-01-", "-02-", "-03-", "-04-", "-05-", "-06-", "-07-", "-08-", "-09-", "-10-", "-11-",
				"-12-" };

		String year;

		// GregorianCalendar calendar = new GregorianCalendar();
		qq: for (int bb = 0; bb < 99; bb++) {
			System.out.println("存檔名稱:");
			String dn = sc.next();
			File tf = new File("c:\\test\\" + dn + ".txt");
			boolean bl = tf.exists();
			if (tf.exists()) {
				System.out.println("存檔名稱重複");
				continue;
			} else {
				System.out.println("成功存於 C:\\test\\"+dn);
//-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+以上檢查檔案，以下開始排序			    	  
				BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\test\\" + dn + ".txt"));
				// BufferedWriter bw=new BufferedWriter(new
				// FileWriter("c:\\test\\sortedvoc"+gcalendar.get(Calendar.YEAR)+months[gcalendar.get(Calendar.MONTH)]+gcalendar.get(Calendar.DATE)
				// + ""+".txt"));
				// String[] v=new String[n];

				ok: for (int i = 0; i < 999; i++) {
					// v[i]=sc.next();
					al.add(sc.next());
					// n++;

					if (al.get(i).equals("0") || al.get(i).equals("0--1")) {
						System.out.println("finish");
						break ok;
					}
					if ("9".compareTo(al.get(i)) >= 0) {
						int b = "9".compareTo(al.get(i));
						// System.out.println(b);
						switch (b) {
						case 8:
							w = 1;
							break;
						case 7:
							w = 2;
							break;
						case 6:
							w = 3;
							break;
						case 5:
							w = 4;
							break;
						case 4:
							w = 5;
							break;
						case 3:
							w = 6;
							break;
						case 2:
							w = 7;
							break;
						case 1:
							w = 9;
							break;
						case 24:
							al.set(i - 1, "0zzz...");
							break;
						}
					}
					if (w > 0)
						al.set(i, al.get(i) + "--->L" + w);
				}
				// List<String> n = Arrays.asList(v);
				// Arrays.sort(v);
				// for(String q:v)
				Collections.sort(al);
				// -----------------------------------------------------------print
				for (int r = 0; r < al.size(); r++) {
					if (al.get(r) != "zzz..." && al.get(r).compareTo("A") >= 0) {
						bw.write(al.get(r));
						bw.newLine();
					}
				}
				bw.flush();
				System.out.println(al);// ---------------------------------check
				break qq;
			}
		}


			}

}