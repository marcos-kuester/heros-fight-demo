package com.kuester.games.herosfight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HerosFightApplicationTests {

	  @Test
	  public void testStartApplicationSuccess() throws Exception {
		  Boolean startSuccess;
		  try {
			  HerosFightApplication.main(new String[] {});
			  startSuccess = true;
		  } catch (Exception e) {
			  throw new Exception("Error starting the application");
		  }
		  
		  assertEquals(true, startSuccess);
	  }

}
