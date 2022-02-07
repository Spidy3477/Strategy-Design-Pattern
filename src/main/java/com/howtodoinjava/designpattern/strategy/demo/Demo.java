package com.howtodoinjava.designpattern.strategy.demo;

import com.howtodoinjava.designpattern.strategy.SocialMediaContext;
import com.howtodoinjava.designpattern.strategy.impl.FacebookStrategy;
import com.howtodoinjava.designpattern.strategy.impl.GooglePlusStrategy;
import com.howtodoinjava.designpattern.strategy.impl.OrkutStrategy;
import com.howtodoinjava.designpattern.strategy.impl.TwitterStrategy;

public class Demo {
	public static void main(String[] args) {
		SocialMediaContext context = new SocialMediaContext();

		context.setSocialmediaStrategy(new FacebookStrategy());
		context.connect("Sonu");

		System.out.println("====================");

		context.setSocialmediaStrategy(new TwitterStrategy());
		context.connect("Sawan");

		System.out.println("====================");

		context.setSocialmediaStrategy(new GooglePlusStrategy());
		context.connect("Adarsh");

		System.out.println("====================");

		context.setSocialmediaStrategy(new OrkutStrategy());
		context.connect("Spidy");
	}
}
