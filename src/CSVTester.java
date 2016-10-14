import java.util.Arrays;

public class CSVTester {
	public static void main(String[]args){
		String [] columnNames = {"time", "gyro-x", "gyro-y", "gyro-z"};
		CSVdata data = new CSVdata("E:/java 2016/gyroTesting.txt", columnNames, 1);

		
		System.out.println(Arrays.toString(data.getIndividualRow(2)));
		System.out.println(Arrays.toString(data.getIndividualCol(2)));
		System.out.println(Arrays.toString(data.getMultipleRows(2,3)));
		System.out.println(data.getTitleCol(3));
		System.out.println(Arrays.toString(data.getIndividualCol("gyro-x")));
		
	}

}
