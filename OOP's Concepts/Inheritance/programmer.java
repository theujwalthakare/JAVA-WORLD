package Inheritance;
class employee{
	float salary =40000;
}
public class programmer extends employee {
    int bonus=10000;
	public static void main(String[] args) {
		programmer p1 = new programmer();
		System.out.println("Programmer salary is :"+p1.salary);
		System.out.println("Programmer bonus is "+p1.bonus);
	}

}
