import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.*;
import java.util.stream.Collectors;

public class StanfordCoreFrench implements Parse {

	@Override
	public String parse(String fileName) {
		String props = "StanfordCoreNLP-french.properties";
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        
        FichierR file =new FichierR(fileName);
        String text = file.integral();
        CoreDocument doc = new CoreDocument(text);

        pipeline.annotate(doc);

        String tokensAndNERTags = doc.tokens().stream().map(
                token -> token.word() + ";" + toProperFormat(token.tag().toLowerCase())+";" + "\"\"" + ";" + "\"\"" + ";" + "\"\"" + ";" + "\"\"" + ";" + "\"\"" + ";" + "\"\"")
                .collect(Collectors.joining("\n"));
        System.out.println(tokensAndNERTags);
        return tokensAndNERTags;
    }
	private String toProperFormat(String category) {
        if (category.equals("pron")) {
            return "Pron";
        } else if (category.equals("verb") || category.equals("aux")) {
            return "Vb";
        } else if (category.equals("det")) {
            return "Det";
        } else if (category.equals("noun")) {
            return "Nom";
        } else if (category.equals("adp")) {
            return "Prep";
        } else if (category.equals("adj")) {
            return "Adj";
        } else if (category.equals("adv")) {
            return "Adv";
        } else {
            return "Autre";
        }
    }
}

