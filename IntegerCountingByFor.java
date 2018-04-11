public class IntegerCountingByFor{
    public static void main(String[] args){
        int[] a = new int[11];
        
	int c = 10;

        for(int b = 0; b<a.length; b++){
        
	a[b] = c;
	c++;
        System.out.println(a[b]);
}
}
}