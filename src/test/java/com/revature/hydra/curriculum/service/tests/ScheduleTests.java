package com.revature.hydra.curriculum.service.tests;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

import io.restassured.RestAssured;

public class ScheduleTests {

	/*
	 * @author Seth Maize (1802-Matt)
	 * 
	 * RESTAssured test to get all schedules
	 */
	@Test
	public void testGetAllSchedule() {
		RestAssured.get("http://localhost:9001/api/v2/curricula/schedules")
		.then()
		.body("[0].id", equalTo(301));
	}
	
	/*
	 * @author Seth Maize (1802-Matt)
	 * 
	 * RESTAssured test to get all schedules
	 */
	@Test
	public void testGetScheduleById() {
		RestAssured.get("http://localhost:9001/api/v2/curricula/schedules/301")
		.then()
		.body("id", equalTo(301));
	}
	
	/*
	 * @author Seth Maize (1802-Matt)
	 * 
	 * RESTAssured test to get all schedules
	 */
	@Test
	public void testDeleteSchedule() {
		RestAssured.delete("http://localhost:9001/api/v2/curricula/schedules/306")
		.then()
		.statusCode(200);
	}
	
}
