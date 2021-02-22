

public class MyOutput {
	public static void main(String args[]) {	
		String[] exampleLog = exampleLog();

		var logfile = new ParseLogfile(exampleLog);
		var line = logfile.getLine(0);
		System.out.println("Log line 0: " + line.getLogLine());

		var ip = line.getIPv4();
		System.out.println("IPv4: "+ip.getIP());
		
		var dt = line.getDateTime();
		System.out.println("Day: "+dt.getDay());
		System.out.println("Month: "+dt.getMonth());
		System.out.println("Month (named): "+dt.monthToString());
		System.out.println("Year: "+dt.getYear());
		System.out.println("Hour: "+dt.getHour());
		System.out.println("Minute: "+dt.getMinute());
		System.out.println("Second: "+dt.getSecond());

		var act = line.getAction();
		System.out.println("Action: "+act.getAction());

		var dev = line.getDevice();
		System.out.println("Device: "+dev.getDevice());

		var loc = line.getLocation();
		System.out.println("Room: "+loc.getRoom());
		System.out.println("Building: "+loc.getBuilding());

		System.out.println();
		line = logfile.getLine(6);
		System.out.println("Log line 6: " + line.getLogLine());
		System.out.println(line.getIPv4().getFormatted());
		System.out.println(line.getDateTime().getFormatted());
		System.out.println(line.getAction().getFormatted());
		System.out.println(line.getDevice().getFormatted());
		System.out.println(line.getLocation().getFormatted());

		System.out.println("\nExample of toLog() output: " + Months.AUG.toLog());
		System.out.println("\nExample regex (for DateTime): "+dt.getRegex());
	}


	// Contains example data 
	public static String[] exampleLog() {
		String[] log = {
"81.220.24.207 - - [2/Mar/2020:10:05:44] \"END sprinkler (Visitor entrance - Building A)\"",
"81.220.24.207 - - [2/Mar/2020:10:05:26] \"ENABLE cooling system (Secured room - Building A)\"",
"81.220.24.207 - - [2/Mar/2020:10:05:39] \"START heating system (Hall - Central)\"",
"81.220.24.207 - - [2/Mar/2020:10:05:52] \"ENABLE door lock (Visitor entrance - Building B)\"",
"81.220.24.207 - - [2/Mar/2020:10:05:21] \"TEST cooling system (Entrance - Building B)\"",
"66.249.73.135 - - [17/May/2020:01:05:17] \"TEST fan (Secured room - Airport location)\"",
"46.105.14.53 - - [17/May/2020:11:05:42] \"TEST cooling system (Secured room - Airport location)\"",
"218.30.103.62 - - [17/May/2020:11:05:11] \"START sprinkler (Secured room - Airport location)\"",
"218.30.103.62 - - [17/May/2020:11:05:46] \"DISABLE fan (Control room - Central)\"",
"218.30.103.62 - - [17/May/2020:11:05:45] \"START door lock (Secured room - Building A)\"",
"66.249.73.135 - - [27/Jun/2020:11:05:31] \"TEST sprinkler (Hall - Building B)\""};
		return log;
	}
}

