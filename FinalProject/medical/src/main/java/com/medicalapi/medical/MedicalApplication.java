package com.medicalapi.medical;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicalApplication {
	static ArrayList<MedicalSolutions> solutions = new ArrayList<MedicalSolutions>();
	public static void main(String[] args) {
		SpringApplication.run(MedicalApplication.class, args);
			
            solutions.add(new MedicalSolutions("Fever", "An elevated body temperature usually caused by an infection", "Rest, hydration, over-the-counter fever reducers such as acetaminophen or ibuprofen"));
            solutions.add(new MedicalSolutions("Cough", "A reflex action that clears the throat of mucus or foreign irritants", "Over-the-counter cough suppressants, hydration, avoiding triggers"));
            solutions.add(new MedicalSolutions("Sore Throat", "Pain, irritation or itchiness of the throat", "Gargling with warm saltwater, hydration, over-the-counter pain relievers, avoiding irritants"));
            solutions.add(new MedicalSolutions("Runny or Stuffy Nose", "Excess mucus in the nasal passages", "Over-the-counter decongestants, saline nasal spray, hydration, avoiding triggers"));
            solutions.add(new MedicalSolutions("Nausea", "An unpleasant sensation of wanting to vomit", "Avoiding solid foods, drinking clear liquids, ginger, over-the-counter anti-nausea medication"));
            solutions.add(new MedicalSolutions("Vomiting", "The forceful expulsion of the stomach contents through the mouth", "Rest, hydration, avoiding solid foods, drinking clear liquids, over-the-counter anti-nausea medication"));
            solutions.add(new MedicalSolutions("Diarrhea", "Frequent bowel movements with loose and watery stool", "Hydration, avoiding solid foods, drinking clear liquids, over-the-counter anti-diarrheal medication"));
            solutions.add(new MedicalSolutions("Constipation", "Difficulty passing stool, infrequent bowel movements", "Increasing fiber intake, hydration, over-the-counter stool softeners or laxatives"));
            solutions.add(new MedicalSolutions("Abdominal Pain", "Pain or discomfort in the abdominal area", "Rest, hydration, over-the-counter pain relievers, avoiding trigger foods or activities"));
            solutions.add(new MedicalSolutions("Back Pain", "Pain or discomfort in the back", "Rest, hot or cold compress, over-the-counter pain relievers, gentle exercise or stretches"));
            solutions.add(new MedicalSolutions("Joint Pain", "Pain or discomfort in the joints", "Rest, hot or cold compress, over-the-counter pain relievers, gentle exercise or stretches"));
            solutions.add(new MedicalSolutions("Muscle Pain", "Pain or discomfort in the muscles", "Rest, hot or cold compress, over-the-counter pain relievers, gentle exercise or stretches"));
            solutions.add(new MedicalSolutions("Fatigue", "Feeling of exhaustion or lack of energy", "Rest, hydration, healthy diet, exercise, avoiding overexertion"));
            solutions.add(new MedicalSolutions("Acid Reflux", "A condition where stomach acid flows back into the esophagus", "Avoiding trigger foods, eating smaller meals, avoiding lying down after eating, over-the-counter antacids or acid reducers"));
            solutions.add(new MedicalSolutions("Heartburn", "A burning sensation in the chest caused by stomach acid refluxing into the esophagus", "Avoiding trigger foods, eating smaller meals, avoiding lying down after eating, over-the-counter antacids"));
            solutions.add(new MedicalSolutions("Indigestion", "Discomfort or pain in the upper abdomen, often associated with eating", "Eating smaller meals, avoiding trigger foods, over-the-counter antacids or acid reducers"));
            solutions.add(new MedicalSolutions("Motion Sickness", "Nausea, dizziness, or vomiting caused by motion", "Focusing on a fixed point, fresh air, over-the-counter motion sickness medication, avoiding reading or looking at screens"));
            solutions.add(new MedicalSolutions("Migraine", "A severe headache often accompanied by other symptoms like nausea and sensitivity to light or sound", "Rest in a quiet, dark room, over-the-counter pain relievers (if appropriate), prescription migraine medication (if prescribed), avoiding triggers"));
            solutions.add(new MedicalSolutions("Toothache", "Pain or discomfort in or around a tooth", "Rinsing with warm saltwater, over-the-counter pain relievers, avoiding hot or cold foods, seeking dental care if severe or persistent"));
            solutions.add(new MedicalSolutions("Gastroenteritis", "Inflammation of the stomach and intestines, often causing diarrhea and vomiting", "Rest, hydration, avoiding solid foods, drinking clear liquids, over-the-counter anti-diarrheal medication (if appropriate), seeking medical attention if severe or persistent"));
            solutions.add(new MedicalSolutions("Urinary Tract Infection (UTI)", "Infection in the urinary system, often causing frequent urination, pain or burning during urination", "Drinking plenty of water, over-the-counter urinary pain relievers, antibiotics (prescription medication), seeking medical attention"));
            solutions.add(new MedicalSolutions("Yeast Infection", "An overgrowth of yeast that causes irritation and discomfort in the vaginal area", "Over-the-counter antifungal creams or suppositories, maintaining good hygiene, wearing breathable underwear, avoiding irritants"));
            solutions.add(new MedicalSolutions("Hemorrhoids", "Swollen blood vessels in the rectal area, often causing discomfort, itching, or bleeding", "Sitz baths, over-the-counter hemorrhoid creams or ointments, increasing fiber intake, staying hydrated"));
            solutions.add(new MedicalSolutions("Allergic Rhinitis", "Inflammation of the nasal passages due to an allergic reaction", "Avoiding allergens, over-the-counter antihistamines, nasal sprays, saline nasal irrigation"));
            solutions.add(new MedicalSolutions("Sinusitis", "Inflammation of the sinuses, often causing facial pain or pressure", "Nasal irrigation with saline solution, over-the-counter decongestants, pain relievers, warm compresses"));
            solutions.add(new MedicalSolutions("High Blood Pressure", "Elevated blood pressure levels", "Adopting a healthy diet, regular exercise, reducing sodium intake, taking prescribed medication"));
            solutions.add(new MedicalSolutions("Acid Reflux", "A condition where stomach acid flows back into the esophagus", "Avoiding trigger foods, eating smaller meals, avoiding lying down after eating, over-the-counter antacids or acid reducers"));
            solutions.add(new MedicalSolutions("Heartburn", "A burning sensation in the chest caused by stomach acid refluxing into the esophagus", "Avoiding trigger foods, eating smaller meals, avoiding lying down after eating, over-the-counter antacids"));
            solutions.add(new MedicalSolutions("Indigestion", "Discomfort or pain in the upper abdomen, often associated with eating", "Eating smaller meals, avoiding trigger foods, over-the-counter antacids or acid reducers"));
            solutions.add(new MedicalSolutions("Motion Sickness", "Nausea, dizziness, or vomiting caused by motion", "Focusing on a fixed point, fresh air, over-the-counter motion sickness medication, avoiding reading or looking at screens"));
            solutions.add(new MedicalSolutions("Migraine", "A severe headache often accompanied by other symptoms like nausea and sensitivity to light or sound", "Rest in a quiet, dark room, over-the-counter pain relievers (if appropriate), prescription migraine medication (if prescribed), avoiding triggers"));
            solutions.add(new MedicalSolutions("Toothache", "Pain or discomfort in or around a tooth", "Rinsing with warm saltwater, over-the-counter pain relievers, avoiding hot or cold foods, seeking dental care if severe or persistent"));
            solutions.add(new MedicalSolutions("Gastroenteritis", "Inflammation of the stomach and intestines, often causing diarrhea and vomiting", "Rest, hydration, avoiding solid foods, drinking clear liquids, over-the-counter anti-diarrheal medication (if appropriate), seeking medical attention if severe or persistent"));
            solutions.add(new MedicalSolutions("Urinary Tract Infection (UTI)", "Infection in the urinary system, often causing frequent urination, pain or burning during urination", "Drinking plenty of water, over-the-counter urinary pain relievers, antibiotics (prescription medication), seeking medical attention"));
            solutions.add(new MedicalSolutions("Yeast Infection", "An overgrowth of yeast that causes irritation and discomfort in the vaginal area", "Over-the-counter antifungal creams or suppositories, maintaining good hygiene, wearing breathable underwear, avoiding irritants"));
            solutions.add(new MedicalSolutions("Hemorrhoids", "Swollen blood vessels in the rectal area, often causing discomfort, itching, or bleeding", "Sitz baths, over-the-counter hemorrhoid creams or ointments, increasing fiber intake, staying hydrated"));
            solutions.add(new MedicalSolutions("Allergic Rhinitis", "Inflammation of the nasal passages due to an allergic reaction", "Avoiding allergens, over-the-counter antihistamines, nasal sprays, saline nasal irrigation"));
            solutions.add(new MedicalSolutions("Sinusitis", "Inflammation of the sinuses, often causing facial pain or pressure", "Nasal irrigation with saline solution, over-the-counter decongestants, pain relievers, warm compresses"));
            solutions.add(new MedicalSolutions("High Blood Pressure", "Elevated blood pressure levels", "Adopting a healthy diet, regular exercise, reducing sodium intake, taking prescribed medication"));
        }

}
