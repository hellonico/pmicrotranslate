http://code.google.com/p/microsoft-translator-java-api/

How to use:
```java
void setup() {
  size(400,400);
  smooth();
  
  //  println(Language.values());
  
  translation = new MicrosoftTranslateLibrary(this);
  str = translation.translate("Il fait un temps magnifique aujourd'hui!", "ar");
  
  font = createFont("",24);
 }
```
