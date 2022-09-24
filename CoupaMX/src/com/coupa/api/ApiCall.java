package com.coupa.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiCall {

	public static void main(String[] args) {// obtiene info del usuario GET user bu email

		/*
		 * Maven dependency for JSON-simple: <dependency>
		 * <groupId>com.googlecode.json-simple</groupId>
		 * <artifactId>json-simple</artifactId> <version>1.1.1</version> </dependency>
		 */

		try {

			URL url = new URL("https://metalsa-test.coupahost.com/api/users?login=mario.moreno.ordaz@metalsa.com");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("x-coupa-api-key", "dc9da1978df530a7849d1ebd233a67682d1b7f0a");
			conn.setRequestProperty("accept", "application/json");
			conn.setDoOutput(true);
			conn.connect();

			// Check if connect is made
			int responseCode = conn.getResponseCode();
			System.out.println("responseCode xx=  " + responseCode);
			// 200 OK
			if (responseCode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responseCode);
			} else {
//                --------------------------------
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				StringBuilder results = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null) {
					results.append(line);
				}

				conn.disconnect();
				System.out.println(results.toString());

//                        --------------------------------
				System.out.println(" obtiene la consukta");

			}
		} catch (Exception e) {
			System.out.println(" es catj");
			e.printStackTrace();
		}
	}
}
