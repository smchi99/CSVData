import java.util.Arrays;

public class CSVTester {
	public static void main(String[]args){
		String [] columnNames = {"time", "gyro-x", "gyro-y", "gyro-z"};
		CSVdata data = new CSVdata("E:/java 2016/GyroTest2out.csv", columnNames, 1);
		
		System.out.println(Arrays.toString(data.getIndividualRow(4)));
		System.out.println(Arrays.toString(data.getIndividualCol(0)));
	}

}
