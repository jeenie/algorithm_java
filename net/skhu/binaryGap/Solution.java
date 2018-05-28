package net.skhu.binaryGap;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void print(ArrayList<Integer> array) {
		System.out.print("convert to binary : ");
		for(int i = array.size() - 1; i >= 0; i--) 
			System.out.print(array.get(i));
		
		System.out.println();
	}
	
	public static int solution(int n) {
		//array�� 10���� n�� 2������ ��ȯ�� ���� ���ڸ��� ������ list
		ArrayList<Integer> array = new ArrayList<Integer>();
		int count = 0;
		//binary gap�� �ִ밪 => �� �������� ���ϰ����ϴ� ��
		int max = 0;
		//0�� ������ ���� �Ǵ����� Ȯ���ϱ� ���� ����
		boolean flag= false;

		//�Ʒ� �ݺ������� n�� 2������ ��ȯ 
		//���� : ��ȯ�� ���� ���� array�� ����
		//�� : 10�� ��ȯ�ϸ� 1010������ array���� 0101�� �����.
		while(n > 0) {
			array.add(n%2);
			n = n/2;
		}
		
		print(array);
		
		//�Ʒ� �ݺ������� max(�ִ� gap)���� ����
		//�迭�� �� �ں��� Ž��
		for(int i = array.size() - 1; i >= 0; i--) {
			if(array.get(i) == 1) {
				//flag�� true��� ���� 0�� ���� ���̾����� �˷���.
				//�� �� �� �ȿ����� 
				//1. count�� ���� max�� ���� ũ�� max���� �����ϰ�
				//2. �׷��� ������ count�� 0���� �ʱ�ȭ
				if(flag) { 
					if(count > max) max = count;
					count = 0;
				} else { //not count
					count = 0; //count ��ȿ
					//�� ���� �۾����ʹ� 0�� ������ ���� �ȴٴ� ���� �˷��ֱ� ����
					flag = true; 				
				}
			} else { //count : get(i)������ 0
				count++;
			}
		}
		//�� �ݺ����� ����Ǹ� �������� �䱸�ϴ� max���� ���� ���̹Ƿ� �� ���� ��ȯ
		System.out.print("binary gap : ");
		return max;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number(decimal) : ");
		int n = input.nextInt();
		System.out.println(solution(n));
		
	}

}
