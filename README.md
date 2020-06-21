# process-texts-with-NLP-tools
The project uses NLP Tools such as TreeTagger, SpaCy, Brill, Cordial, NLP Stanford Core, LiaPhon and Talisman

My work consisted in creating a "file" class that takes a String and transforms it into an array of lines that will be manipulated by methods. This String is formed by a series of lines separated by " \n ". Each line is formed by the following elements: word (the form), category, lemma, mode, time, person, gender and number, always in this order and separated by ";". Where the elements do not exist, there is an empty string. For all these elements, except the form and the lemma, a normalization was created so that everyone who was in charge of the classes Treetagger, Spacy etc. used the same notations.

To access the String that is in linesParsees, I have taken the following steps:
- created a "Parse" interface where the method "parse" is declared --> all classes that process files (TreeTagger, Spacy etc) implement the "Parse" interface.
- used an "analysis" object of type parse
- instantiated a classification through this object according to the file type given by the user afterwards if... else

