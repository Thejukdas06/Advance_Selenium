package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener_Runner 
{
@Test
public void test()
{
	System.out.println("Hello World");
}
@Test
public void test1()
{
	System.out.println("Hello India");
	Assert.fail();
}
@Test(dependsOnMethods = "test1")
public void test2()
{
	System.out.println("Hello Hassan");
}
}
