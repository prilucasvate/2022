package sett;

import java.util.HashSet;
import java.util.Iterator;

public class set1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//�̧ǥ[�J����Vincent, Anita, Howard
		hs.add("Vincent Tuan");
		hs.add("Anita Wu");
		hs.add("Howard Tuan");
		//�A�Nnull�[�J�ܤ�����
		hs.add(null);
		//�����C�LHashSet,�w�]�O�Q��toString()��k
		System.out.println("�����C�LHashSet,�w�]�O�Q��toString()��k");
		System.out.println(hs);
		System.out.println();
		//�Q��Iterator�NHashSet���X�����Ҧ������̧Ǩ��X
		System.out.println("�Q��Iterator�NHashSet���X�����Ҧ������̧Ǩ��X");
		Iterator I = hs.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}

	}

}
