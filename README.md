# process-texts-with-NLP-tools
### The project uses NLP Tools such as TreeTagger, SpaCy, Brill, Cordial, NLP Stanford Core, LiaPhon and Talisman

My work consisted in creating a "file" class that takes a String and transforms it into an array of lines that will be manipulated by methods. This String is formed by a series of lines separated by " \n ". Each line is formed by the following elements: word (the form), category, lemma, mode, time, person, gender and number, always in this order and separated by ";". Where the elements do not exist, there is an empty string. For all these elements, except the form and the lemma, a normalization was created so that everyone who was in charge of the classes Treetagger, Spacy etc. used the same notations.

![UML-Modelisation](https://github.com/cristina-cojocaru/process-texts-with-NLP-tools/blob/master/UML-modelization.JPG)

To access the String that is in linesParsees, I have taken the following steps:
- created a "Parse" interface where the method "parse" is declared --> all classes that process files (TreeTagger, Spacy etc) implement the "Parse" interface.
- used an "analysis" object of type parse
- instantiated a classification through this object according to the file type given by the user (a stance if... else)

![if-else-screenshot](https://github.com/cristina-cojocaru/process-texts-with-NLP-tools/blob/master/if-else-type-of-tool.JPG)

- have given "parse lines" the value analysis.parse(filename)
That is to say: we applied the "parse" method which is actually used by each of these classes (TreeTagger, Spacy etc). The purpose of using "analysis.parse" is to use the method that is part of the correct class, the class (in this case, the file type or "typeFic") specified by the user. 
To fill the table with the String "linesParsees" I have done the following operations:
- plit on "\n"...
- created an Array of Lines to loop
- at each line split on ";"
- hecked if the line contains at least 8 elements
- added the elements in the table by the "add" method
For the table, I created a different class called "Content". In this class I declared all the variables or elements that make up the table. All these elements can be found in the String "linesParsees", except the id.

![list-of-variables-of-cotenu-class](https://github.com/cristina-cojocaru/process-texts-with-NLP-tools/blob/master/list-of-variables-for-contenu-class.JPG)

First I declared these variables as private and then I created public methods to obtain these variables.

![private-to-public](https://github.com/cristina-cojocaru/process-texts-with-NLP-tools/blob/master/private-to-public.JPG)

I used these methods later on, to access the elements of the table. 

### The second part consisted in creating methods to manipulate the array.

For example, I created the method "nbOccLemme" which displays both the lemmas and the number of occurrences for each lemma. To make the method return 2 different types of variable (a String and an Integer), I used a hash Map.

<code> Map<String, Integer> lemmesOcc = new HashMap<String, Integer>(); </code>

Thus, the key is the string and the value is the integer. To obtain the number of occurrences for each lemma I used the frequency() method:

<code> Collections.frequency(contenus,ligne.getLemma())); </code>

I created several other methods to return content based on a choice made by the user, while comparing the respective element of the array with the value (choice) given by the user. Some of those new created methods use: getWord(), getLemma(), getCategory(), getMode(), getNumber(), getTime(), getPers() in order to access the elements of the array. The comparision with the input of the user is done with the aid of the equals() method.
