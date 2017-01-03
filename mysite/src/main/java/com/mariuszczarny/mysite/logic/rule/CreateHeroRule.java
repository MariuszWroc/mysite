package com.mariuszczarny.mysite.logic.rule;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mariuszczarny.mysite.dto.AttributeDTO;
import com.mariuszczarny.mysite.dto.DefaultAttributesDTO;
import com.mariuszczarny.mysite.service.util.RandomValue;

public final class CreateHeroRule {
    private static final Logger logger = LoggerFactory.getLogger(CreateHeroRule.class);
    private static Map<String, DefaultAttributesDTO> allAttributes = populateDefaultAttributes();
    
	public static int diceRoller(int diceNumber, int sideNumber) {
		int value = 0;
		for(int i=1; i<=diceNumber; i++) {
			value = value + RandomValue.randomInteger(1, sideNumber);
		}
		
		return value;
	}
	
	public static Map<String, DefaultAttributesDTO> populateDefaultAttributes() {
		Map<String, DefaultAttributesDTO> allAttributes = new HashMap<>();
		

		
		return allAttributes;
	}
	
	public static AttributeDTO createMinimumAttributes(DefaultAttributesDTO race, DefaultAttributesDTO profession) {
		int minStrength = drawAttribute("minStrength", race.getMinStrength(), profession.getMinStrength());
		int minDexterity  = drawAttribute("minDexterity", race.getMinDexterity(), profession.getMinDexterity());
		int minIntelligence  = drawAttribute("minIntelligence", race.getMinIntelligence(), profession.getMinIntelligence());
		int minConstitution  = drawAttribute("minConstitution", race.getMinConstitution(), profession.getMinConstitution());
		int minCharisma  = drawAttribute("minCharisma", race.getMinCharisma(), profession.getMinCharisma());
		
		AttributeDTO minAttributes = new AttributeDTO(minStrength, minDexterity, minConstitution, minCharisma, minIntelligence);
		
		return minAttributes;
	}
	
	public static AttributeDTO createMaximumAttributes(DefaultAttributesDTO race) {
		int maxStrength  = race.getMaxStrength();
		int maxDexterity  = race.getMaxDexterity();
		int maxConstitution  = race.getMaxIntelligence();
		int maxCharisma  = race.getMaxConstitution();
		int maxIntelligence  = race.getMaxCharisma();

		AttributeDTO maxAttributes = new AttributeDTO(maxStrength, maxDexterity, maxConstitution, maxCharisma, maxIntelligence);
		
		return maxAttributes;
	}
	
	public static AttributeDTO getDrawedAttributes(AttributeDTO minAttributes, AttributeDTO maxAttributes) {
		int strength  = generateAttribute(minAttributes.getStrength(), maxAttributes.getStrength());
		int dexterity  = generateAttribute(minAttributes.getDexterity(), maxAttributes.getDexterity());
		int constitution  = generateAttribute(minAttributes.getIntelligence(), maxAttributes.getIntelligence());
		int charisma  = generateAttribute(minAttributes.getConstitution(), maxAttributes.getConstitution());
		int intelligence  = generateAttribute(minAttributes.getCharisma(), maxAttributes.getCharisma());

		AttributeDTO drawedAttributes = new AttributeDTO(strength, dexterity, constitution, charisma, intelligence);
		
		return drawedAttributes;
	}

	public static int generateAttribute(int min, int max) {
		return min;
	}

	private static int drawAttribute(String attributeName, int raceValue, int professionValue) {
		String prefix = attributeName.substring(0, 3);
		String body = attributeName.substring(3); 
		logger.info("Attribute name " + attributeName + " ,professionValue " + professionValue + " ,raceValue " +  raceValue + " ,prefix " + prefix + " ,body " + body);
		switch (body) {
			case "Strength" : 
				return checkWhichIsBigger(raceValue, professionValue);
			case "Dexterity" :
				return checkWhichIsBigger(raceValue, professionValue);
			case "Intelligence" :
				return checkWhichIsBigger(raceValue, professionValue);
			case "Constitution" : 
				return checkWhichIsBigger(raceValue, professionValue);
			case "Charisma" : 
				return checkWhichIsBigger(raceValue, professionValue);
			default:
				logger.error("Attribute name have wrong name. There is no such attribute.");
				return 0;
		}

	}

	private static int checkWhichIsBigger(int firstValue, int secondValue) {
		if (firstValue > secondValue) {
			return firstValue;
		} else {
			return secondValue;
		}
	}

	public static int[] getAllowedProffession(Integer idRace) {
		int[] professionAccess = null;
		
		return professionAccess;
	}

	public static Map<String, DefaultAttributesDTO> getAllAttributes() {
		return allAttributes;
	}

	public static void setAllAttributes(Map<String, DefaultAttributesDTO> allAttributes) {
		CreateHeroRule.allAttributes = allAttributes;
	}
}
