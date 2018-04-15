package com.revature.hydra.curriculum.service.tests;

import static org.hamcrest.CoreMatchers.equalTo;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.revature.hydra.curriculum.beans.Curriculum;
import com.revature.hydra.curriculum.beans.Schedule;
import com.revature.hydra.curriculum.exceptions.NoContentException;
import com.revature.hydra.curriculum.repositories.CurriculumRepository;
import com.revature.hydra.curriculum.services.CurriculumService;

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
	
	/**
	 * @author Seth Maize
	 * @author RickyBaker 
	 * 
	 * tests adding a schedule
	 * 
	 * @throws NoContentException
	 * @throws JsonParseException
	 * @throws IOException
	 */
	@Test
	public void testAddSchedule() throws NoContentException, JsonParseException, IOException {		
		//CurriculumService curriculumService = new CurriculumService();
		//Curriculum curriculum = curriculumService.getCurriculumById(301);
		ObjectMapper mapper = new ObjectMapper();
		
		String curriculumJsonStr = RestAssured.get("http://localhost:9001/api/v2/curricula/?ids=101").body().asString();
		Curriculum[] curriculum = mapper.readValue(curriculumJsonStr, Curriculum[].class);
		
		Schedule schedule = new Schedule(curriculum[0]);
		JsonNode jsonNode = JsonNodeFactory.instance.pojoNode(schedule);
		
		RestAssured.given()
		.contentType("application/json")
		.body(jsonNode)
		.when()
		.post("http://localhost:9001/api/v2/curricula/schedules/")
		.then()
		.statusCode(200);
		 
	}
	
	/*
	 * @author Seth Maize (1802-Matt)
	 * 
	 * RESTAssured test to get all schedules
	 */
//	@Test
//	public void testDeleteSchedule() {
//		RestAssured.delete("http://localhost:9001/api/v2/curricula/schedules/306")
//		.then()
//		.statusCode(200);
//	}
	
}
