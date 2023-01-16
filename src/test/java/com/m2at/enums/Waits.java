package com.m2at.enums;

public enum Waits
{
	EXPLICIT_WAIT(10L),
	SLEEP_ONE_SEC(1000L),
	SLEEP_TWO_SEC(2000L);
	
	private long waitTime;
	
	private Waits(long waitTime)
	{
		this.waitTime = waitTime;
	}
	
	public long getWaitTime()
	{
		return waitTime;
	}
}