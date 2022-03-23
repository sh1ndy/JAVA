package day0323;

interface Parseable {
	// ���� �м��۾��� �����Ѵ�.
	public abstract void parse(String fileName);
}

class ParserManager {
	// ����Ÿ���� Parseable�������̽��̴�.
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {	
		// ���� �м��۾��� �����ϴ� �ڵ带 ���´�.
		System.out.println(fileName + "- XML parsing completed.");
	}
	
}

class HTMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ带 ���´�.
		System.out.println(fileName + "- HTML parsing completed.");
		
	}
	
}

public class ParserTest {

	public static void main(String[] args) {
		
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("XML");
		parser.parse("document2.html");
		
	}

}
