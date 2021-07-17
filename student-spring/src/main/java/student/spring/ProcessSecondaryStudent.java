package student.spring;

import org.springframework.stereotype.Service;

@Service("secondary")
public class ProcessSecondaryStudent implements StudentProcessor {

	@Override
	public void getName() {
		System.out.println("secondary");

	}

}
