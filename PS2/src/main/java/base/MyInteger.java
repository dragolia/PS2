package base;

public class MyInteger {
	private int iValue;
	public MyInteger(int iValue){
		this.iValue = iValue;
		
	}
	public int getiValue() {
		return iValue;
	}
	public boolean isEven(){
		boolean even = false;
		if (iValue % 2 == 0){
			even = true;
		}
		return even;
	}
	public boolean isOdd(){
		boolean odd = false;
		if (iValue % 2 != 0){
			odd = true;
		}
		return odd;
	}
	public boolean isPrime(){
		boolean prime = false;
		for (int i=2;i<iValue;i++){
			if (iValue % i==0){
				prime = false;
			}
			prime = true;
		}
		return prime;	
	}
	public static boolean isEven(int n){
		boolean even = false;
		if (n % 2 == 0){
			even = true;
		}
		return even;
	}
	public static boolean isOdd(int n){
		boolean odd = false;
		if (n % 2 != 0){
			odd = true;
		}
		return odd;
	}
	public static boolean isPrime(int n){
		boolean prime = false;
		for (int i=2;i<n;i++){
			if (n % i==0){
				prime = false;
			}
			prime = true;
		}
		return prime;	
	}
	public static boolean isEven(MyInteger m){
		boolean even = false;
		if (m.getiValue() % 2 == 0){
			even = true;
		}
		return even;
	}
	public static boolean isOdd(MyInteger m){
		boolean odd = false;
		if (m.getiValue() % 2 != 0){
			odd = true;
		}
		return odd;
	}
	public static boolean isPrime(MyInteger m){
		boolean prime = false;
		for (int i=2;i<m.getiValue();i++){
			if (m.getiValue() % i==0){
				prime = false;
			}
			prime = true;
		}
		return prime;	
	}
	public boolean equals(int n){
		boolean equals = false;
		if (n== iValue){
			equals = true;
		}
		return equals;
	}
	public boolean equalMy(MyInteger m){
		boolean equals = false;
		if (m.getiValue()==this.iValue){
			equals = true;
		}
		return equals;
	}
}
