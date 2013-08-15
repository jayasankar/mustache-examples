package org.jay.samples.mustache.extension;

import java.io.IOException;
import java.io.Writer;

import org.springframework.util.StringUtils;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template.Fragment;

/**
 * 
 * @author Jay
 *
 */
public class DynamicValueResolver {

	public Object resolveDynamicValue() {
		System.out.println("Inside dynamic value resolver");
		return new Mustache.Lambda() {
			@Override
			public void execute(Fragment frag, Writer out) throws IOException {
				String key = frag.execute();
				if (StringUtils.trimWhitespace(key).equals("My Shop")) {
					System.out.println("Go the same key");
				}
				out.write("Dynamic Value Is :" + key);
				
			}
		};
	}
	
	public String display(String str) {
		return "dynamic value";
	}
}
