package AddressBook_Csv;


import org.junit.Assert;
import org.junit.Test;

public class AddressBookCsvTest {

	@Test
	public void givenThreeContacts_WhenWrittenIn_CSVFileShouldPassTheTest() 
    {
		AddressBookCSV addressBookCSVobject=new AddressBookCSV("C:\\Users\\Anikesh\\Desktop\\AddressBook_Csv\\lib\\src\\main\\resources\\AddressBookCSVTesting.csv");
		int readCSVContacts=addressBookCSVobject.readAddressBookFromCSVFile();
		Assert.assertEquals(3,readCSVContacts);
	} 
}