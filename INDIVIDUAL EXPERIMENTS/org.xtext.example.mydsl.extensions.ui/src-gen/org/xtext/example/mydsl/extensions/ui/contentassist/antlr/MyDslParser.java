/*
* generated by Xtext
*/
package org.xtext.example.mydsl.extensions.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.extensions.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.extensions.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.extensions.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.extensions.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAddressAccess().getAlternatives(), "rule__Address__Alternatives");
					put(grammarAccess.getRootElementTypeAccess().getGroup(), "rule__RootElementType__Group__0");
					put(grammarAccess.getExtendedAddressAccess().getGroup(), "rule__ExtendedAddress__Group__0");
					put(grammarAccess.getExtendedAddressAccess().getGroup_8(), "rule__ExtendedAddress__Group_8__0");
					put(grammarAccess.getExtendedAddressAccess().getGroup_9(), "rule__ExtendedAddress__Group_9__0");
					put(grammarAccess.getAddress_ImplAccess().getGroup(), "rule__Address_Impl__Group__0");
					put(grammarAccess.getLanguageAccess().getGroup(), "rule__Language__Group__0");
					put(grammarAccess.getLanguageAccess().getGroup_3(), "rule__Language__Group_3__0");
					put(grammarAccess.getLanguageAccess().getGroup_4(), "rule__Language__Group_4__0");
					put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
					put(grammarAccess.getRootElementTypeAccess().getExtendedAddressAssignment_3(), "rule__RootElementType__ExtendedAddressAssignment_3");
					put(grammarAccess.getRootElementTypeAccess().getAddressAssignment_5(), "rule__RootElementType__AddressAssignment_5");
					put(grammarAccess.getRootElementTypeAccess().getLanguageAssignment_7(), "rule__RootElementType__LanguageAssignment_7");
					put(grammarAccess.getExtendedAddressAccess().getStreetAssignment_3(), "rule__ExtendedAddress__StreetAssignment_3");
					put(grammarAccess.getExtendedAddressAccess().getCityAssignment_5(), "rule__ExtendedAddress__CityAssignment_5");
					put(grammarAccess.getExtendedAddressAccess().getCountryAssignment_7(), "rule__ExtendedAddress__CountryAssignment_7");
					put(grammarAccess.getExtendedAddressAccess().getLatitudeAssignment_8_1(), "rule__ExtendedAddress__LatitudeAssignment_8_1");
					put(grammarAccess.getExtendedAddressAccess().getLongitudeAssignment_9_1(), "rule__ExtendedAddress__LongitudeAssignment_9_1");
					put(grammarAccess.getAddress_ImplAccess().getStreetAssignment_3(), "rule__Address_Impl__StreetAssignment_3");
					put(grammarAccess.getAddress_ImplAccess().getCityAssignment_5(), "rule__Address_Impl__CityAssignment_5");
					put(grammarAccess.getAddress_ImplAccess().getCountryAssignment_7(), "rule__Address_Impl__CountryAssignment_7");
					put(grammarAccess.getLanguageAccess().getValueAssignment_3_1(), "rule__Language__ValueAssignment_3_1");
					put(grammarAccess.getLanguageAccess().getLanguageAssignment_4_1(), "rule__Language__LanguageAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.extensions.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.extensions.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleRootElementType();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}