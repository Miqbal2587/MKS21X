public class Sorts{
    public static String name(){
	return "09.Iqbal.Mohammed";
    }
    public static void selectionSort(int[] data){
	int lowest;
	for (int i=0; i<data.length-1; i++){
	    lowest=data[i];
	    for (int j=i+1; j<data.length; j++){
		if (data[j]<data[i]){
		    lowest=data[j];
		}
	    }
	    data[i] = lowest;
	}
    }
    /* Personal use */
    public String toString(int [] data){
	String ary="[";
	for (int x=0;x<data.length; x++){
	    ary=ary+data[x]+ ",";
	}
	ary="]";
	return ary;
    }
    public static void main(String[] args){
	int[] a;
	a= new int[10];
	for (int x=0; x<a.length; x++){
	    a[x]=10-x;
	}
	System.out.println(a[0]);
	selectionSort(a);
	System.out.println(a[0]);
    }
}
