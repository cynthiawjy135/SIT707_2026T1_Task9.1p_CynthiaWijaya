package tdd_testing;

import org.junit.jupiter.api.Test;

import submissionfunc.SubmissionChecker;

import org.junit.Assert;

public class submissionDueTest {

	//Test for checking late submission is true
	 @Test
	    public void trueLateSubmission() {

	        Assert.assertTrue(
	            SubmissionChecker.isLate(
	                "2026/05/11",
	                "2026/05/10"
	            )
	        );
	    }
	 
	 //Testing for Checking if it is precisely on the same date of due date
	 @Test
	    public void onTimeSubmission() {

	        Assert.assertFalse(
	            SubmissionChecker.isLate(
	                "2026/05/09",
	                "2026/05/10"
	            )
	        );
	    }
	 
	 	//Testing for checking it if the submission date before the due date
	    @Test
	    public void BeforeDueDateSubmission() {

	        Assert.assertFalse(
	            SubmissionChecker.isLate(
	                "2026/05/09",
	                "2026/05/10"
	            )
	        );
	    }
	    
	    @Test
	    public void uploadedTaskStatusReadyToMark() {

	        Assert.assertEquals(
	            "Ready to Mark",
	            SubmissionChecker.updateTaskStatus(true, false, false)
	        );
	    }

	    @Test
	    public void approvedTaskStatusCompleted() {

	        Assert.assertEquals(
	            "Completed",
	            SubmissionChecker.updateTaskStatus(true, true, false)
	        );
	    }

	    @Test
	    public void resubmitTaskStatusFixAndResubmit() {

	        Assert.assertEquals(
	            "Fix and Resubmit",
	            SubmissionChecker.updateTaskStatus(true, false, true)
	        );
	    }

	    @Test
	    public void notUploadedTaskStatusNotWorking() {

	        Assert.assertEquals(
	            "Working On It",
	            SubmissionChecker.updateTaskStatus(false, false, false)
	        );
	    }
}
