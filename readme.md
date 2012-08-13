http://code.google.com/p/microsoft-translator-java-api/

How to use:
```java
import net.hellonico.potato.*;
import net.hellonico.microtranslate.*;

void setup() {

  translation = new MicrosoftTranslateLibrary(this);
  str = translation.translate("Il fait un temps magnifique aujourd'hui!", "ar");
  
 }
```
