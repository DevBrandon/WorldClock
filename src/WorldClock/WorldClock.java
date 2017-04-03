package WorldClock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The WorldClockGUI class acts as the model.
 * 
 * Performs the required calculations to return the times of various cites around the world
 * 
 * @author Brandon Jackson
 *
 */
public class WorldClock {
	
	//Vars
	private static  ZonedDateTime zdt; 
	private static ZoneId zoneId; 
	
	//Empty constructor
	public WorldClock(){
		super();
	}

	public static String getCupertino() {
		zoneId = ZoneId.of( "-07:00" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}

	public static String getShanghai() {
		zoneId = ZoneId.of( "Asia/Shanghai" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}
	
	public static String getArgentinaAndBuenos_Aires() {
		zoneId = ZoneId.of( "America/Argentina/Buenos_Aires" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}
	
	public static String getParis() {
		zoneId = ZoneId.of( "Europe/Paris" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}
	
}
