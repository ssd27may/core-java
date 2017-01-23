import java.io.IOException;


public class Dog extends Animal {

	// this method is overriden but still it can throw a super type
	// exception this is because the NPE is uncheckd exception
	@Override
	public void run() throws RuntimeException {
		// TODO Auto-generated method stub
		super.run();
	}
	
	// here eat method cant throw IO exception since it is checkd
	// and supertype of File not found exception
	public void eat() throws IOException {
		
	};
	
	
}

