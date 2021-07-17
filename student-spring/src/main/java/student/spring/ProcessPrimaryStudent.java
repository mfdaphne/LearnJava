package student.spring;

import org.springframework.stereotype.Service;

@Service("primary")
public class ProcessPrimaryStudent implements StudentProcessor {

	@Override
	public void getName() {
		System.out.println("Primary");

	}

}
