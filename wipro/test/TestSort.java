package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;
public class TestSort {
	DailyTasks d=new DailyTasks();
	@Test
	public void testSortValues() 
	{
		int arr[]= new int[]{1,2,5,6,4};
		int b[]=new int[] {1,2,4,5,6};
		assertArrayEquals(b,d.sortValues(arr));
	}

}
