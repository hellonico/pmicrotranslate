import net.hellonico.potato.*;
import net.hellonico.microtranslate.*;

import com.memetix.mst.language.*;

MicrosoftTranslateLibrary translation;
String str;
PFont font;

void setup() {
  size(400,400);
  smooth();
  
  //  println(Language.values());
  
  translation = new MicrosoftTranslateLibrary(this);
  str = translation.translate("Il fait un temps magnifique aujourd'hui!", "ar");
  
  font = createFont("",24);
  textFont(font);
}

void draw() {
  background(0);
  fill(255);
  text(str, mouseX, mouseY);
}

/*
[1] ar
[2] bg
[3] ca
[4] zh-CHS
[5] zh-CHT
[6] cs
[7] da
[8] nl
[9] en
[10] et
[11] fi
[12] fr
[13] de
[14] el
[15] ht
[16] he
[17] hi
[18] mww
[19] hu
[20] id
[21] it
[22] ja
[23] ko
[24] lv
[25] lt
[26] no
[27] pl
[28] pt
[29] ro
[30] ru
[31] sk
[32] sl
[33] es
[34] sv
[35] th
[36] tr
[37] uk
[38] vi
*/