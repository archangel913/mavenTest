package mavenTest;

import java.time.LocalDateTime;

public class TimeGetterImpl implements TimeGetter {

	@Override
	public LocalDateTime getTime() {
		return LocalDateTime.now();
	}

}
