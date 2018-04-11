public class PrintInteger{
    public static void main(String[] args){
	int[] a = new int[100];
        int b = 1;
	
	for(int i: a){
	i=b;
	b++;
	
	if(i%3==0){
	System.out.println(i);
        }
      }
	
    }
}