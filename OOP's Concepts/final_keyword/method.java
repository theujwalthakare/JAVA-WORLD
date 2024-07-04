package final_keyword;
class method{
	class A{
		static final int data;
		static {data=50;}
	}
	public static void main() {
		System.out.print(A.data);
	}
}