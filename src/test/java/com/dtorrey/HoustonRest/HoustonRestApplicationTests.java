package com.dtorrey.HoustonRest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HoustonRestApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void initTest() throws Exception {

		// Sample GET.
		String responseString = new HoustonRest()
				.url( "http://dtorrey.com" )
				.body( "{some json}" )
				.post( 1000 );

		// Sample POST.
		responseString = new HoustonRest()
				.url( "http://dtorrey.com" )
				.param( "name", "dan" )
				.get( 1000 );

	}
}
