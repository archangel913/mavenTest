package mavenTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TimeGetterTest {

	@Test
	@DisplayName("てすと")
	public void getTime() {
		LocalDateTime time = null;
		assertNull(time);
		TimeGetter tg = new TimeGetterImpl();
		time = tg.getTime();
		assertNotNull(time);
	}

}
