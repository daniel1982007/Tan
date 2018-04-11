public class FillArray{
    public static void main(String[] args){
	int[] a = new int[101];
	int b = 100;
	
	for(int i : a){
	i = b;
	b--;
	System.out.println(i);
      }
    }

}