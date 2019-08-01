package Controll;

public interface Command {
	boolean tryExecute(String user);
	public void execute();
}
