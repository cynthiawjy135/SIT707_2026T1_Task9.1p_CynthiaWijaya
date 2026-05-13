package submissionfunc;

public class SubmissionChecker {
	//Function OnTrack to check whether student submission is late or on time
	public static boolean isLate(String submissiondate, String duedate) {

        if (submissiondate.compareTo(duedate) > 0) {
            return true;
        } else {
            return false;
        }
    }
	
	//Function for update Task automatically after user upload submission
	public static String updateTaskStatus(boolean uploaded,
            boolean approved,
            boolean resubmit) {

			if (uploaded == true) {
			
				if (approved == true) {
					return "Completed";
				}
			
				else if (resubmit == true) {
					return "Fix and Resubmit";
				}
			
				else {
					return "Ready to Mark";
				}
			}
			
				return "Working On It";
			}
}
