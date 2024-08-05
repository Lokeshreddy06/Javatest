package sorting;

public class BubbleSorting {
public static void main(String[] args) {
	int[] a= {3,6,7,5,9,4,6,7,8,};
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int n:a) {
		System.out.println(n);
	}
  }
}
