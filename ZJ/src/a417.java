import java.util.Scanner;

public class a417 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int ic=0;ic<a;ic++) {
			int b=sc.nextInt();
			int f=sc.nextInt();
			int co=1;
			int aa[][]=new int[b][b];
			//+-+-+-+-+-+-+-+-+-+--++--+-+--++-+-+-+-+-+
			if(f==1) {
			//---------------------------------------
			if(b%2==0) {//--even
		for(int x=0;x<b/2;x++) {//****(start,wall,++)
			for(int i=x;i<b-1-x;i++) {
				aa[x][i]=co;
				co++;
			}
			for(int j=x;j<b-1-x;j++) {
				aa[j][b-1-x]=co;
				co++;
			}
			for(int k=x;k<b-1-x;k++) {
				aa[b-1-x][(b-1-x)-(k-x)]=co;
				co++;
			}
			for(int l=x;l<b-1-x;l++) {
				aa[(b-1-x)-(l-x)][x]=co;
				co++;
			}
		}
			}else {//-odd
				aa[(b-1)/2][(b-1)/2]=b*b;
				for(int x=0;x<b/2;x++) {//****(start,wall,++)
					for(int i=x;i<b-1-x;i++) {
						aa[x][i]=co;
						co++;
					}
					for(int j=x;j<b-1-x;j++) {
						aa[j][b-1-x]=co;
						co++;
					}
					for(int k=x;k<b-1-x;k++) {
						aa[b-1-x][(b-1-x)-(k-x)]=co;
						co++;
					}
					for(int l=x;l<b-1-x;l++) {
						aa[(b-1-x)-(l-x)][x]=co;
						co++;
					}
				}
			}
			//----------------------------------
			}else if(f==2) {
				if(b%2==0) {//--even
					for(int x=0;x<b/2;x++) {//****(start,wall,++)
						for(int i=x;i<b-1-x;i++) {
							aa[i][x]=co;
							co++;
						}
						for(int j=x;j<b-1-x;j++) {
							aa[b-1-x][j]=co;
							co++;
						}
						for(int k=x;k<b-1-x;k++) {
							aa[(b-1-x)-(k-x)][b-1-x]=co;
							co++;
						}
						for(int l=x;l<b-1-x;l++) {
							aa[x][(b-1-x)-(l-x)]=co;
							co++;
						}
					}
						}else {//-odd
							aa[(b-1)/2][(b-1)/2]=b*b;
							for(int x=0;x<b/2;x++) {//****(start,wall,++)
								for(int i=x;i<b-1-x;i++) {
									aa[i][x]=co;
									co++;
								}
								for(int j=x;j<b-1-x;j++) {
									aa[b-1-x][j]=co;
									co++;
								}
								for(int k=x;k<b-1-x;k++) {
									aa[(b-1-x)-(k-x)][b-1-x]=co;
									co++;
								}
								for(int l=x;l<b-1-x;l++) {
									aa[x][(b-1-x)-(l-x)]=co;
									co++;
								}
							}
						}
			}
			//+--+--+-+-+-+-+-+-+-++-+-+-+-+--+-+-+-+-+-+-
			for(int i=1;i<=b;i++) {
				for(int s=1;s<=b;s++) {
					System.out.printf("%5d",aa[i-1][s-1]);
				}
				System.out.println();
			}	
			System.out.println();
			
		}	
	}

}
