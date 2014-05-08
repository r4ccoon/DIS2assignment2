
public class Main {
	public static final int width = 1024;
	public static final int height = 800;
	
	public static void main(String[] args) {
		WindowManager manager = new WindowManager();
		
		WindowSystem win = manager.CreateWindow("main window", width, height);
	}

}
