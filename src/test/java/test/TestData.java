package test;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class TestData {

    public static Faker faker = new Faker();

    public static Date fakerDateOfBirthday = faker.date().birthday();

    public static Map<String, String[]> mapStateWithCity = Map.of(
            "NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"},
            "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

    static String userName = faker.name().firstName(),
            userLastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userGender = faker.demographic().sex(),
            userPhone = 8 + faker.phoneNumber().subscriberNumber(9),
            userBirth_day = (new SimpleDateFormat("d", Locale.ENGLISH)).format(fakerDateOfBirthday),
            userBirth_month = (new SimpleDateFormat("MMMM", Locale.ENGLISH)).format(fakerDateOfBirthday),
            userBirth_year = (new SimpleDateFormat("y", Locale.ENGLISH)).format(fakerDateOfBirthday),
            userPictureLocation = "pictures/img1.jpeg",
            userSubjects = faker.options().option("Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
                    "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology"),
            userHobbies = faker.options().option("Reading", "Sports", "Music"),
            userAddress = faker.address().streetAddress(),
            userState = faker.options().option(mapStateWithCity.keySet().toArray()).toString(),
            userCity = faker.options().option(mapStateWithCity.get(userState));
}