package tdd_testing;

import org.junit.jupiter.api.Test;

import submissionfunc.SubmissionChecker;

import org.junit.Assert;

public class submissionDueTest {

	 @Test
	    public void lateSubmissionShouldReturnTrue() {

	        Assert.assertTrue(
	            SubmissionChecker.isLate(
	                "2026-05-11",
	                "2026-05-10"
	            )
	        );
	    }

	    @Test
	    public void onTimeSubmissionShouldReturnFalse() {

	        Assert.assertFalse(
	            SubmissionChecker.isLate(
	                "2026-05-09",
	                "2026-05-10"
	            )
	        );
	    }
	    
	    @Test
	    public void uploadedTaskShouldBeReadyToMark() {

	        Assert.assertEquals(
	            "Ready to Mark",
	            SubmissionChecker.updateTaskStatus(true, false, false)
	        );
	    }

	    @Test
	    public void approvedTaskShouldBeCompleted() {

	        Assert.assertEquals(
	            "Completed",
	            SubmissionChecker.updateTaskStatus(true, true, false)
	        );
	    }

	    @Test
	    public void resubmitTaskShouldReturnFixAndResubmit() {

	        Assert.assertEquals(
	            "Fix and Resubmit",
	            SubmissionChecker.updateTaskStatus(true, false, true)
	        );
	    }

	    @Test
	    public void notUploadedTaskShouldReturnNotWorking() {

	        Assert.assertEquals(
	            "Working On It",
	            SubmissionChecker.updateTaskStatus(false, false, false)
	        );
	    }
}
