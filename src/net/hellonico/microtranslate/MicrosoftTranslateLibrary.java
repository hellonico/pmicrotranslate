/**
 * ##library.name##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright ##copyright## ##author##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author      ##author##
 * @modified    ##date##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package net.hellonico.microtranslate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

import processing.core.*;

/**
 * This is a template class and can be used to start a new processing library or tool.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own library or tool naming convention.
 * 
 * @example Hello 
 * 
 * (the tag @example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 */

public class MicrosoftTranslateLibrary {
	
	// myParent is a reference to the parent sketch
	PApplet myParent;
	public final static String VERSION = "##library.prettyVersion##";
	
	public MicrosoftTranslateLibrary(PApplet theParent) {
		myParent = theParent;
		
		try {
			Class klass = Class.forName("net.hellonico.potato.Potato");
			Constructor c = klass.getConstructor(PApplet.class);
			Object potato = c.newInstance(theParent);
			Method m = klass.getMethod("getSettings", String.class);
			HashMap settings = (HashMap) m.invoke(potato, "windows");
			
			Translate.setClientId((String)settings.get("clientId"));
		    Translate.setClientSecret((String)settings.get("appKey"));
		} catch (Exception e) {
			throw new RuntimeException("This is carrot day."+e.getMessage());
		}
	}
	
	public static String version() {
		return VERSION;
	}
	
	public String translate(String text, String to) {
		return translate(text, Language.AUTO_DETECT, Language.fromString(to));
	}
	public String translate(String text, String from, String to) {
		return translate(text, Language.fromString(from), Language.fromString(to));
	}
	public String translate(String text, Language from, Language to) {
		try {
			return Translate.execute(text, from, to);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}		
	}

}

