package currentDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSetter {

	public static String getCurrentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date currentDate = new Date();
		return dateFormat.format(currentDate);
	}
}
