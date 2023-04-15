package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static test.TestData.*;
import static test.TestData.userName;


public class RegistrationWithFakerTest extends TestBase{
    @Tag("qa")
    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setPhone(userPhone)
                .setBirthDate(userBirth_day, userBirth_month, userBirth_year)
                .setSubjects(userSubjects)
                .setHobbies(userHobbies)
                .setPicture(userPictureLocation)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)
                .clickSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", userName + " " + userLastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", userGender)
                .verifyResult("Mobile", userPhone)
                .verifyResult("Date of Birth", userBirth_day + " " + userBirth_month + "," + userBirth_year)
                .verifyResult("Subjects", userSubjects)
                .verifyResult("Hobbies", userHobbies)
                .verifyResult("Address", userAddress)
                .verifyResult("State and City", userState + " " + userCity);

    }
}
