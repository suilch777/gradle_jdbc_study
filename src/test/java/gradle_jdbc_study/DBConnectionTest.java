package gradle_jdbc_study;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import gradle_jdbc_study.jdbc.ConnectionProvider;

public class DBConnectionTest {
	static final Logger log =LogManager.getFormatterLogger();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
		
	@Test
	public void testConnection() {
		try {Connection con = ConnectionProvider.getConnection();
		fail("Not yet implemented");
	}
	}
}
