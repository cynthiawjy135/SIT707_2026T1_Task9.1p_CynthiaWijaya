package submissionfunc;

public class SubmissionChecker {
	public static boolean isLate(String submissionDate, String duedate) {

        if (submissionDate.compareTo(duedate) > 0) {
            return true;
        } else {
            return false;
        }
    }
	
	public static String updateTaskStatus(boolean uploaded,
            boolean approved,
            boolean resubmitRequired) {

			if (uploaded == true) {
			
				if (approved == true) {
					return "Completed";
				}
			
				else if (resubmitRequired == true) {
					return "Fix and Resubmit";
				}
			
				else {
					return "Ready to Mark";
				}
			}
			
				return "Working On It";
			}
}
