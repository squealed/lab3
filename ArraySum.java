package lab3;
public class ArraySum {
    public int sumOfArray(Integer[] a, int index) {
    	if(index < 0) {
    		return 0;
    	}else if(a[index] == null) {
    		return 0;
    	}else if(index > a.length-1) {
    		return 0;        	
    	}else {
    		return a[index] + sumOfArray(a, (index-1));
    	}
    }
}