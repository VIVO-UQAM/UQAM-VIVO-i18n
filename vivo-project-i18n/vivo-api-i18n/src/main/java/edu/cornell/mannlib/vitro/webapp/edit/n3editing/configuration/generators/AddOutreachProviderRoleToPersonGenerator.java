/* $This file is distributed under the terms of the license in LICENSE$ */

package edu.cornell.mannlib.vitro.webapp.edit.n3editing.configuration.generators;

import edu.cornell.mannlib.vitro.webapp.controller.VitroRequest;
import edu.cornell.mannlib.vitro.webapp.edit.n3editing.VTwo.fields.ConstantFieldOptions;
import edu.cornell.mannlib.vitro.webapp.edit.n3editing.VTwo.fields.FieldOptions;

public class AddOutreachProviderRoleToPersonGenerator extends AddRoleToPersonTwoStageGenerator {

	private static String template = "addOutreachProviderRoleToPerson.ftl";
	private static String OPTION_CLASS_URI = "http://xmlns.com/foaf/0.1/Organization";

	@Override
	String getTemplate() {
		return template;
	}

	@Override
	String getRoleType() {
		return "http://vivoweb.org/ontology/core#OutreachProviderRole";
	}
	private static String DESCRIBE_QUERY = " describe "+
			"<http://vivoweb.org/ontology/core#AcademicDepartment> " +
			"<http://vivoweb.org/ontology/core#Association> " +
			"<http://vivoweb.org/ontology/core#Center> " +
			"<http://vivoweb.org/ontology/core#ClinicalOrganization> " +
			"<http://vivoweb.org/ontology/core#College> " +
			"<http://vivoweb.org/ontology/core#Committee> " +
			"<http://vivoweb.org/ontology/core#Company> " +
			"<http://vivoweb.org/ontology/core#Competition> " +
			"<http://purl.org/ontology/bibo/Conference> " +
			"<http://vivoweb.org/ontology/core#ConferenceSeries> " +
			"<http://vivoweb.org/ontology/core#Consortium> " +
			"<http://vivoweb.org/ontology/core#CoreLaboratory> " +
			"<http://vivoweb.org/ontology/core#Course> " +
			"<http://vivoweb.org/ontology/core#Department> " +
			"<http://vivoweb.org/ontology/core#Division> " +
			"<http://purl.org/NET/c4dm/event.owl#Event> " +
			"<http://vivoweb.org/ontology/core#EventSeries> " +
			"<http://vivoweb.org/ontology/core#Exhibit> " +
			"<http://vivoweb.org/ontology/core#ExtensionUnit> " +
			"<http://vivoweb.org/ontology/core#Foundation> " +
			"<http://vivoweb.org/ontology/core#FundingOrganization> " +
			"<http://vivoweb.org/ontology/core#GovernmentAgency> " +
			"<http://xmlns.com/foaf/0.1/Group> " +
			"<http://purl.org/ontology/bibo/Hearing> " +
			"<http://vivoweb.org/ontology/core#Hospital> " +
			"<http://vivoweb.org/ontology/core#Institute> " +
			"<http://purl.org/ontology/bibo/Interview> " +
			"<http://vivoweb.org/ontology/core#InvitedTalk> " +
			"<http://vivoweb.org/ontology/core#Laboratory> " +
			"<http://vivoweb.org/ontology/core#Library> " +
			"<http://purl.obolibrary.org/obo/OBI_0000835> " +
			"<http://vivoweb.org/ontology/core#Meeting> " +
			"<http://vivoweb.org/ontology/core#Museum> " +
			"<http://xmlns.com/foaf/0.1/Organization> " +
			"<http://purl.org/ontology/bibo/Performance> " +
			"<http://vivoweb.org/ontology/core#Presentation> " +
			"<http://vivoweb.org/ontology/core#PrivateCompany> " +
			"<http://vivoweb.org/ontology/core#Program> " +
			"<http://vivoweb.org/ontology/core#Publisher> " +
			"<http://vivoweb.org/ontology/core#ResearchOrganization> " +
			"<http://vivoweb.org/ontology/core#School> " +
			"<http://vivoweb.org/ontology/core#SeminarSeries> " +
			"<http://vivoweb.org/ontology/core#Team> " +
			"<http://vivoweb.org/ontology/core#ServiceProvidingLaboratory> " +
			"<http://vivoweb.org/ontology/core#StudentOrganization> " +
			"<http://purl.obolibrary.org/obo/ERO_0000565> " +
			"<http://vivoweb.org/ontology/core#University> " +
			"<http://purl.org/ontology/bibo/Workshop> " +
			"<http://vivoweb.org/ontology/core#WorkshopSeries";


	//Outreach Provider role involves hard-coded options for the "right side" of the role or activity
	@Override
	FieldOptions getRoleActivityFieldOptions(VitroRequest vreq) throws Exception {
		ConstantFieldOptions filedOptions = GeneratorUtil.buildConstantFieldOptions(vreq, DESCRIBE_QUERY);
		return filedOptions;

		//                    return new ConstantFieldOptions(
		//            "","Select type",
		//            "http://vivoweb.org/ontology/core#AcademicDepartment","Academic Department",
		//            "http://vivoweb.org/ontology/core#Association","Association",
		//            "http://vivoweb.org/ontology/core#Center","Center",
		//            "http://vivoweb.org/ontology/core#ClinicalOrganization","Clinical Organization",
		//            "http://vivoweb.org/ontology/core#College","College",
		//            "http://vivoweb.org/ontology/core#Committee","Committee",
		//            "http://vivoweb.org/ontology/core#Company","Company",
		//            "http://vivoweb.org/ontology/core#Competition", "Competition",
		//            "http://purl.org/ontology/bibo/Conference", "Conference",
		//            "http://vivoweb.org/ontology/core#ConferenceSeries", "Conference Series",
		//            "http://vivoweb.org/ontology/core#Consortium","Consortium",
		//            "http://vivoweb.org/ontology/core#CoreLaboratory","Core Laboratory",
		//            "http://vivoweb.org/ontology/core#Course", "Course",
		//            "http://vivoweb.org/ontology/core#Department","Department",
		//            "http://vivoweb.org/ontology/core#Division","Division",
		//            "http://purl.org/NET/c4dm/event.owl#Event","Event",
		//            "http://vivoweb.org/ontology/core#EventSeries", "Event Series",
		//            "http://vivoweb.org/ontology/core#Exhibit", "Exhibit",
		//            "http://vivoweb.org/ontology/core#ExtensionUnit","Extension Unit",
		//            "http://vivoweb.org/ontology/core#Foundation","Foundation",
		//            "http://vivoweb.org/ontology/core#FundingOrganization","Funding Organization",
		//            "http://vivoweb.org/ontology/core#GovernmentAgency","Government Agency",
		//            "http://xmlns.com/foaf/0.1/Group","Group",
		//            "http://purl.org/ontology/bibo/Hearing", "Hearing",
		//            "http://vivoweb.org/ontology/core#Hospital","Hospital",
		//            "http://vivoweb.org/ontology/core#Institute","Institute",
		//            "http://purl.org/ontology/bibo/Interview", "Interview",
		//            "http://vivoweb.org/ontology/core#InvitedTalk", "Invited Talk",
		//            "http://vivoweb.org/ontology/core#Laboratory","Laboratory",
		//            "http://vivoweb.org/ontology/core#Library","Library",
		//            "http://purl.obolibrary.org/obo/OBI_0000835","Manufacturer",
		//            "http://vivoweb.org/ontology/core#Meeting", "Meeting",
		//            "http://vivoweb.org/ontology/core#Museum","Museum",
		//            "http://xmlns.com/foaf/0.1/Organization","Organization",
		//            "http://purl.org/ontology/bibo/Performance", "Performance",
		//            "http://vivoweb.org/ontology/core#Presentation", "Presentation",
		//            "http://vivoweb.org/ontology/core#PrivateCompany","Private Company",
		//            "http://vivoweb.org/ontology/core#Program","Program",
		//            "http://vivoweb.org/ontology/core#Publisher","Publisher",
		//            "http://vivoweb.org/ontology/core#ResearchOrganization","Research Organization",
		//            "http://vivoweb.org/ontology/core#School","School",
		//            "http://vivoweb.org/ontology/core#SeminarSeries", "Seminar Series",
		//            "http://vivoweb.org/ontology/core#Team","Team",
		//            "http://vivoweb.org/ontology/core#ServiceProvidingLaboratory","Service Providing Lab",
		//            "http://vivoweb.org/ontology/core#StudentOrganization","Student Organization",
		//            "http://purl.obolibrary.org/obo/ERO_0000565","Technology Transfer Office",
		//            "http://vivoweb.org/ontology/core#University","University",
		//            "http://purl.org/ontology/bibo/Workshop", "Workshop",
		//            "http://vivoweb.org/ontology/core#WorkshopSeries", "Workshop Series");
	}

	@Override
	boolean isShowRoleLabelField(){return true;}

	/*
	 * Use the methods below to change the date/time precision in the
	 * custom form associated with this generator. When not used, the
	 * precision will be YEAR. The other precisons are MONTH, DAY, HOUR,
	 * MINUTE, TIME and NONE.
	 */
	/*
    public String getStartDatePrecision() {
        String precision = VitroVocabulary.Precision.MONTH.uri();
	    return precision;
    }

    public String getEndDatePrecision() {
        String precision = VitroVocabulary.Precision.DAY.uri();
	    return precision;
    }
	 */
}
