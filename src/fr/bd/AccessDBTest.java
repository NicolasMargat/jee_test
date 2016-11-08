package fr.bd;

public class AccessDBTest {
	private static AccessDBTest adb;
	
	private AccessDBTest() {
		
	}
	
	public static AccessDBTest getInstance() {
		if(adb == null) {
			adb = new AccessDBTest();
		}

		return adb;
	}
}
