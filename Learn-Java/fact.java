public class fact {

	public int my_fact(int num){
		int result = 0;
		if (num == 0){
			return 1;
		}
		result = num * my_fact(num - 1 );
		return result;

	}

}

