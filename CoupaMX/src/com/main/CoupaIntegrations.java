package com.main;

import com.integrations.CCAdministration;
import com.objects.CostCenter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CoupaIntegrations {
	//
//  String Lookup;
//  String Default;
//  String Active;
//  String Parent_Name;
//  String Parent_External_Ref_Code;
//  String Chart_of_Accounts;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String header = "Lookup,Name,Description,External Ref Num,Default,Active,External Ref Code,Parent Name,Owner,Parent External Ref Code,Chart of Accounts";
		String Lookup = "Centros_de_Costos";
		String Default = "No";
//      String Active = "No";
		String Active = "Yes";
//      String Parent_Name = "HT";
//      String Parent_External_Ref_Code = "003";
		String Parent_Name = "GTO";
		String Parent_External_Ref_Code = "097";
		String Chart_of_Accounts = "Metalsa Mexico Cost Center Accounting Flex";

//      ArrayList<String> account = new ArrayList<String>();
//      account.add("614080100001");
//      account.add("614080100002");
		Map<String, String> accounts = new TreeMap<>();
//      accounts.put("614080100001", "Travel Expenses (FC)");
//      accounts.put("614080100002", "Travel Expense Domestic (AE)"); 
//      accounts.put("524080100002", "Travel Expenses");
		accounts.put("524080100003", "Non-deductible Travel Expenses");

//      String codigo_cc="";
//      String nombre_cc="";
//      String owner_cc="";
		/// llenado info ccia15,Seguridad y Vigilanc
		Map<String, CostCenter> cost_centers = new TreeMap<>();
		/// parte1
//cost_centers.put("IM003", new CostCenter("IM003","Corrective Maintenance Painting Equipment GTO","dither.galicia@metalsa.com"));//524080100002
//cost_centers.put("IM006", new CostCenter("IM006","Preventive Maintenance Painting Equipment GTO","dither.galicia@metalsa.com"));
//cost_centers.put("IM009", new CostCenter("IM009","Mantenimientos Mayores Pintura","dither.galicia@metalsa.com"));
//cost_centers.put("IO012", new CostCenter("IO012","Enn01 Pintura GTO","sandra.esther@metalsa.com"));
//cost_centers.put("N0022", new CostCenter("N0022","GTO Assembly Coordination","Jose.Limon@metalsa.com"));
//cost_centers.put("NC019", new CostCenter("NC019","Assembly Quality DJ","jose.llamas@metalsa.com"));
//cost_centers.put("NC041", new CostCenter("NC041","Assembly Quality D2","sandra.esther@metalsa.com"));
//cost_centers.put("NC045", new CostCenter("NC045","Inspecci n Recibo Calidad","sandra.esther@metalsa.com"));
//cost_centers.put("NC046", new CostCenter("NC046","CMM Patios y Disparo","Jose.Caballero.Garza@metalsa.com"));
//cost_centers.put("NC047", new CostCenter("NC047","Residentes","sandra.esther@metalsa.com"));
//cost_centers.put("NL019", new CostCenter("NL019","Logistics DJ","juan.palacios02@metalsa.com"));
//cost_centers.put("NL034", new CostCenter("NL034","Logistica D2-DJ 2013","fabiola.garza@metalsa.com"));
//cost_centers.put("NL043", new CostCenter("NL043","Secuenciado GTO","fabiola.garza@metalsa.com"));
//cost_centers.put("NM033", new CostCenter("NM033","Corrective Maintenance Assembly Equipment GTO DJ","dither.galicia@metalsa.com"));
//cost_centers.put("NM034", new CostCenter("NM034","Assembly Tools GTO DJ","dither.galicia@metalsa.com"));
//cost_centers.put("NM069", new CostCenter("NM069","Preventive Maintenance Assembly Equipment DJ","dither.galicia@metalsa.com"));
//cost_centers.put("NM071", new CostCenter("NM071","Corrective Maintenance Assembly D2/DJ","dither.galicia@metalsa.com"));
//cost_centers.put("NM072", new CostCenter("NM072","Preventive Maintenance Assembly Equipment D2/DJ","dither.galicia@metalsa.com"));
//cost_centers.put("NM073", new CostCenter("NM073","Assembly Equipment Improvements (DJ/D2/DDDP)","dither.galicia@metalsa.com"));
//cost_centers.put("NM074", new CostCenter("NM074","Assembly Maintenance Coordination","dither.galicia@metalsa.com"));
//cost_centers.put("NM086", new CostCenter("NM086","Mantenimientos Mayores Ensamble D2/DJ","raul.deleon@metalsa.com"));
//cost_centers.put("NO053", new CostCenter("NO053","Enn01 Ensamble GTO","gabriel.cerda@metalsa.com"));
//cost_centers.put("NO073", new CostCenter("NO073","Proyecto DJ 2012","gabriel.cerda@metalsa.com"));
//cost_centers.put("NO153", new CostCenter("NO153","ENN5 Green Turn D2/DJ","enrique.navarro@metalsa.com"));
//cost_centers.put("PS002", new CostCenter("PS002","Plant Coordination","jorge.luna05@metalsa.com"));
//cost_centers.put("PS022", new CostCenter("PS022","Warehouse","antonio.salazar@metalsa.com"));
//cost_centers.put("PS044", new CostCenter("PS044","Infraestructura GTO","dither.galicia@metalsa.com"));
//cost_centers.put("PS054", new CostCenter("PS054","Calidad Ambiental","roberto.morales@metalsa.com"));
//cost_centers.put("NO149", new CostCenter("NO149","ENN2 Green Turn D2/DJ","jose.solis.carral@metalsa.com"));
//cost_centers.put("NC008", new CostCenter("NC008","Laboratorio de Soldadura","sandra.esther@metalsa.com"));
//cost_centers.put("NO143", new CostCenter("NO143","ENN1 Blue Turn D2/DJ","juan.palacios02@metalsa.com"));
//cost_centers.put("PS014", new CostCenter("PS014","Purchasing","antonio.salazar@metalsa.com"));
//cost_centers.put("NL039", new CostCenter("NL039","Logistica Residentes GTO","juan.palacios02@metalsa.com"));
//cost_centers.put("NM004", new CostCenter("NM004","Mantenimiento Herramientas Ensamble ","jorge.eduardo.torres@metalsa.com"));
//cost_centers.put("NC061", new CostCenter("NC061","Recuperado Mayor DT","carlos.alvarado@metalsa.com"));
//cost_centers.put("IC003", new CostCenter("IC003","Pintura Calidad GTO","sandra.esther@metalsa.com"));
//cost_centers.put("IM008", new CostCenter("IM008","Painting Maintenance Coordination ","raul.deleon@metalsa.com"));

//parte 2

//cost_centers.put("PA401", new CostCenter("PA401","Human Resources","melissa.dogart@metalsa.com"));//614080100002
//cost_centers.put("PA406", new CostCenter("PA406","Vigilance","roberto.morales@metalsa.com"));
//cost_centers.put("PA411", new CostCenter("PA411","Sistemas de Operacion GTO","melissa.dogart@metalsa.com"));
//cost_centers.put("PA412", new CostCenter("PA412","Seguridad y Vigilancia","melissa.dogart@metalsa.com"));
//cost_centers.put("PA506", new CostCenter("PA506","TI GTO","hernan.macias@metalsa.com"));
//cost_centers.put("PA301", new CostCenter("PA301","Accounting","jose.solis.carral@metalsa.com"));
//cost_centers.put("PA501", new CostCenter("PA501","Information Technology ","norberto.renteria@metalsa.com"));
//cost_centers.put("PA404", new CostCenter("PA404","Human Resources.","andrea.solorio@metalsa.com"));

//PART3
		cost_centers.put("PS002", new CostCenter("PS002", "Plant Coordination", "jorge.luna05@metalsa.com"));// 524080100003

//      cost_centers.put("PC020", new CostCenter("PC020", "Seguridad y Vigilancia", "fabiola.garza@metalsa.com"));
//      cost_centers.put("PC021", new CostCenter("PC021", "Expense Domestic", "fabiola.garza@metalsa.com"));
//      cost_centers.put("PC022", new CostCenter("PC020", "Seguridad y Vigilancia", "fabiola.garza@metalsa.com"));
//      cost_centers.put("PA413", new CostCenter("PA413", "Seguridad y Vigilancia2", "fabiola.garza@metalsa.com"));
//cost_centers.put("PA414", new CostCenter("PA414","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA415", new CostCenter("PA415","Seguridad y Vigilancia3","fabiola.garza@metalsa.com"));
//cost_centers.put("PA416", new CostCenter("PA416","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA417", new CostCenter("PA417","Seguridad y Vigilancia4","fabiola.garza@metalsa.com"));
//cost_centers.put("PA418", new CostCenter("PA418","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA419", new CostCenter("PA419","Seguridad y Vigilancia5","fabiola.garza@metalsa.com"));
//cost_centers.put("PA420", new CostCenter("PA420","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA421", new CostCenter("PA421","Seguridad y Vigilancia6","fabiola.garza@metalsa.com"));
//cost_centers.put("PA422", new CostCenter("PA422","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA423", new CostCenter("PA423","Seguridad y Vigilancia7","fabiola.garza@metalsa.com"));
//cost_centers.put("PA424", new CostCenter("PA424","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA425", new CostCenter("PA425","Seguridad y Vigilancia8","fabiola.garza@metalsa.com"));
//cost_centers.put("PA426", new CostCenter("PA426","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA427", new CostCenter("PA427","Seguridad y Vigilancia9","fabiola.garza@metalsa.com"));
//cost_centers.put("PA428", new CostCenter("PA428","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA429", new CostCenter("PA429","Seguridad y Vigilancia10","fabiola.garza@metalsa.com"));
//cost_centers.put("PA430", new CostCenter("PA430","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA431", new CostCenter("PA431","Seguridad y Vigilancia11","fabiola.garza@metalsa.com"));
//cost_centers.put("PA432", new CostCenter("PA432","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA433", new CostCenter("PA433","Seguridad y Vigilancia12","fabiola.garza@metalsa.com"));
//cost_centers.put("PA434", new CostCenter("PA434","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA435", new CostCenter("PA435","Seguridad y Vigilancia13","fabiola.garza@metalsa.com"));
//cost_centers.put("PA436", new CostCenter("PA436","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA437", new CostCenter("PA437","Seguridad y Vigilancia14","fabiola.garza@metalsa.com"));
//cost_centers.put("PA438", new CostCenter("PA438","Seguridad y Vigilancia","fabiola.garza@metalsa.com"));
//cost_centers.put("PA439", new CostCenter("PA439","Seguridad y Vigilancia15","fabiola.garza@metalsa.com"));

		CCAdministration admcc = new CCAdministration();
		System.out.println("main code");
		admcc.altaCC(header, Lookup, Default, Active, Parent_Name, Parent_External_Ref_Code, Chart_of_Accounts,
				cost_centers, accounts);// usa el mismo catalogo de cuentas para todos los CC que s enevien
		// TODO code application logic here
	}

}

