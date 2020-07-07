package com.wipro.test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import com.wipro.task.DailyTasks;
public class TestCheckPresence {
DailyTasks d=new DailyTasks();
@Test
public void TestCheckPresence1()
{
	assertTrue(d.checkPresence("mahi", "a"));
}
public void TestCheckPresence2()
{
	assertFalse(d.checkPresence("mahi", "a"));
}

}
