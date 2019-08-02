package Controll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddCommand implements Command {
	private String text;

	public void setText(String text) {
		this.text = text;
	}

	Pattern patternAdd = Pattern.compile("^[ADD]{1,}[\\s]+?[\\d]+[\\s]+ [\\w]+");
	Pattern patternNoParam = Pattern.compile("^[ADD]{1,}[\\s]+?[\\s]+ [\\w]+");
	Matcher matcherAdd = patternAdd.matcher(text);
	Matcher matcherAddNoParam = patternNoParam.matcher(text);
	if(matcherAdd.find()){

	}

	@Override
	public boolean tryExecute(String user) {
		return false;
	}

	@Override
	public void execute() {
	}
}
