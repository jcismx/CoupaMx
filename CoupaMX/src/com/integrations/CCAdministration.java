package com.integrations;

import com.objects.CostCenter;
import java.util.Map;
import java.util.Set;

public class CCAdministration {
	String header;
	String Lookup;
	String Default;
	String Active;
	String Parent_Name;
	String Parent_External_Ref_Code;
	String Chart_of_Accounts;

	public void altaCC(String header, String Lookup, String Default, String Active, String Parent_Name,
			String Parent_External_Ref_Code, String Chart_of_Accounts, Map cost_object, Map account_object) {
		System.out.println("=> " + Lookup);

		System.out.println("\nEmpieza generacion plantilla:  c");
		System.out.println(header);
		Set<Map.Entry<String, CostCenter>> entries = cost_object.entrySet();
		Set<Map.Entry<String, String>> accounts = account_object.entrySet();

		for (Map.Entry<String, CostCenter> entry : entries) {
			System.out.println(Lookup + "," + entry.getValue().getCc_description() + ","
					+ entry.getValue().getCc_description() + "," + entry.getKey() + "," + Default + "," + Active + ","
					+ Parent_External_Ref_Code + "|" + entry.getValue().getCc_code() + "," + Parent_Name + ","
					+ entry.getValue().getCc_owner() + "," + Parent_External_Ref_Code + "," + Chart_of_Accounts

			);

			for (Map.Entry<String, String> account_in : accounts) {

				System.out.println(Lookup + "," + account_in.getValue() + "," + account_in.getValue() + ","
						+ account_in.getKey() + "," + Default + "," + Active + "," + Parent_External_Ref_Code + "|"
						+ entry.getValue().getCc_code() + "|" + account_in.getKey() + ","
						+ entry.getValue().getCc_description() + ",," + Parent_External_Ref_Code + "|"
						+ entry.getValue().getCc_code() + "," + Chart_of_Accounts);
			}

		}

		System.out.println();

		// Clear all values.
		cost_object.clear();

		// Equals to zero.
		System.out.println("After clear operation, size: " + cost_object.size());
	}
}
