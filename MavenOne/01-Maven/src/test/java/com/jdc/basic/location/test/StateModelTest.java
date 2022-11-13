package com.jdc.basic.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.provider.CsvFileSource;

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
	void test_create_error() {
		// Prepare Inputs (Parameters)
		
		// Execute target method
		
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
