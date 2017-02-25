package scarapper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scarpp {
	public static void main(String[] args) throws IOException {
		Document doc = null;

		String baseUrl = "http://www.300mbfilms.co/page/";
		
		for(int i = 1; i <20 ; i++){
			doc = Jsoup.connect(baseUrl+i).get();
			Elements contents = doc.select("div#content");

			for (Element content : contents) {
				Elements titles = content.select("h2.title");
				for (Element title : titles) {

					System.out.println(title.select("a[title]").text());

				}

			}
		}

	}
}
