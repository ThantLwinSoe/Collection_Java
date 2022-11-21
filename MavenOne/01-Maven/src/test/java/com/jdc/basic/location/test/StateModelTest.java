package com.jdc.basic.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.basic.location.model.StateModel;
import com.jdc.basic.location.model.dto.State;
import com.jdc.basic.location.model.form.StateForm;

@TestMethodOrder(OrderAnnotation.class)
@DisplayNameGeneration(ReplaceUnderscores.class)
public class StateModelTest {
	
	private StateModel model;
	
	
	@CsvFileSource(resources = "/state/test_create_success.txt", delimiter='\t')
//	@DisplayName("Create Success")
	
	void test_create_success(String name,String region,String capital,int id) {
		// Prepare Inputs (Parameters)
		StateForm form = new StateForm(name,region,capital);
		// Execute target method
	//	System.out.println(form);
		State state = model.create(form);
		// Check Result
		assertNotNull(state);
		assertEquals(name, state.region());
		assertEquals(region, state.capital());
		assertEquals(id, state.id());
	}
	
	@Test
	@Order(1)
	@CsvSource(value = {
			",region,capital,Please enter name of state.",
			"name,,capital,Please enter region of state.",
			"name,region,,Please enter capital of state.",
	})
	void test_create_error(String name, String region, String capital) {
		// Prepare Inputs (Parameters)
		var form = new StateForm(name,region,capital);
		// Execute target method
	//(IllegalAccessException.class, () -> model.create(null))
		// Check Result
		
	}
	
	@Test
	void test_update_success() {
		
	}
	
	@Test
	void test_find_by_id_found() {
		
	}
	
	@Test
	void test_find_by_id_not_found() {
		
	}

}
