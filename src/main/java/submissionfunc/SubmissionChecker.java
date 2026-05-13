package submissionfunc;

public class SubmissionChecker {
	public static boolean isLate(String submissionDate, String duedate) {

        if (submissionDate.compareTo(duedate) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
