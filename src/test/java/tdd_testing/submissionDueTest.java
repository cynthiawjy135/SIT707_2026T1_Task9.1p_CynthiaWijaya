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
}
