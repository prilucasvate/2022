package sett;

import java.util.HashSet;

public class hs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset=new HashSet<String>();

		String str1="Puppy";
		String str2="Kitten";
		System.out.println("Hash empty: "+hset.isEmpty());
		hset.add("Moneky"); // �W�[����
		hset.add("Bunny"); // �W�[����
		hset.add(str1); // �W�[����
		hset.add(str2); // �W�[����
		System.out.println("Hash size="+hset.size());//��ܤ����Ӽ�(Ū����)
		System.out.println("Hash empty: "+hset.isEmpty());
		System.out.println("HashSet ���e:"+hset);//��ܶ��X���󪺤��e
		hset.remove(str2);
		System.out.println("�M��Kitten..., Hash size="+hset.size());
		System.out.println("Hash���O�_��"+str2+"? "+hset.contains(str2));
		System.out.println("Hash���O�_��fish? "+hset.contains("fish"));
		System.out.println("Hash���O�_��Puppy? "+hset.contains("Puppy"));
		hset.remove("Bunny");
		System.out.println("�M��Bunny..., Hash size="+hset.size());
		System.out.println("HashSet ���e:"+hset);
		hset.add("Moneky");   //�A�[�JMonky����(���󤣥i����)
		System.out.println("HashSet ���e:"+hset);
		hset.clear();
		System.out.println("�M��Hash ���Ҧ�������...");
		System.out.println("Hash empty: "+hset.isEmpty());

	}

}
