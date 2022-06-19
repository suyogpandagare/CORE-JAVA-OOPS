package study.errors;

public class TestHeapFullProblem {

	public static void main(String[] args) {

		BigData [] arr = new BigData[10000];
		for(int i=0; i<1000; i++)
		{
			System.out.println(i);
			arr[i] = new BigData();
			arr[i] = null;
			System.gc();//this is direct call to GC
		}
		
		
	}

}//end of class

class BigData
{
	long [] data = new long [1000000];
	
	@Override
	protected void finalize() throws Throwable {   //finalise is method to mark the objects which are not reachable from stack

	//cleanup or storing or printing to be done just before object is released 
	System.out.println(this+ "this object is being released");
	}
	
}

/*case 1)to make heap full
222
223
224
225
226
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at study.errors.BigData.<init>(TestHeapFullProblem.java:23)
	at study.errors.TestHeapFullProblem.main(TestHeapFullProblem.java:11)*/

/*
 * to release the memory we need to release the object it is holding 
 * 
 * 
 * 
 *
1
study.errors.BigData@20632c80this object is being released
2
study.errors.BigData@2ea4d6fcthis object is being released
3
study.errors.BigData@2a9b47f0this object is being released
4
study.errors.BigData@6f99dcc7this object is being released
5
study.errors.BigData@56a7ea98this object is being released
*/