package com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;
public class TestStringConcat {
	DailyTasks d=new DailyTasks();
	@Test
	public void testDoStringConcat() {
		assertEquals("mahi tha",d.doStringConcat("mahi","tha"));
	}

}
