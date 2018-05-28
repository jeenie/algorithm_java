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
		//array는 10진수 n을 2진수로 변환한 값을 한자리씩 저장할 list
		ArrayList<Integer> array = new ArrayList<Integer>();
		int count = 0;
		//binary gap의 최대값 => 이 문제에서 구하고자하는 값
		int max = 0;
		//0의 개수를 세도 되는지를 확인하기 위한 변수
		boolean flag= false;

		//아래 반복문으로 n을 2진수로 변환 
		//주의 : 변환한 값의 엮이 array에 저장
		//예 : 10을 변환하면 1010이지만 array에는 0101로 저장됨.
		while(n > 0) {
			array.add(n%2);
			n = n/2;
		}
		
		print(array);
		
		//아래 반복문으로 max(최대 gap)값을 구함
		//배열의 맨 뒤부터 탐색
		for(int i = array.size() - 1; i >= 0; i--) {
			if(array.get(i) == 1) {
				//flag가 true라는 것은 0을 세는 중이었음을 알려줌.
				//즉 이 블럭 안에서는 
				//1. count가 기존 max값 보다 크면 max값을 갱신하고
				//2. 그렇지 않으면 count를 0으로 초기화
				if(flag) { 
					if(count > max) max = count;
					count = 0;
				} else { //not count
					count = 0; //count 무효
					//이 다음 작업부터는 0의 개수를 세도 된다는 것을 알려주기 위함
					flag = true; 				
				}
			} else { //count : get(i)했을때 0
				count++;
			}
		}
		//위 반복문이 종료되면 문제에서 요구하는 max값을 구한 것이므로 그 값을 반환
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
