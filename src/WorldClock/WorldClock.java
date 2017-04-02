package WorldClock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class WorldClock {
	
	static //Vars
	ZonedDateTime zdt; 
	ZoneId zoneId; 
	
	//Empty constructor, here for style purposes
	public WorldClock(){
		super();
	}

	public static String getCupertino() {
		ZoneId zoneId = ZoneId.of( "-07:00" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}

	public static String getShanghai() {
		ZoneId zoneId = ZoneId.of( "Asia/Shanghai" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}
	
	public static String getArgentinaAndBuenos_Aires() {
		ZoneId zoneId = ZoneId.of( "America/Argentina/Buenos_Aires" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}
	
	public static String getParis() {
		ZoneId zoneId = ZoneId.of( "Europe/Paris" );
		zdt = ZonedDateTime.now( zoneId );  // Pass desired/expected time zone.
		return DateTimeFormatter.ofPattern("hh:mm:ss").format(zdt.toLocalTime());
	}
	
}
