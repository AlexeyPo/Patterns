package builder.secondimpl;

import java.time.LocalDate;
import java.time.Period;

public class StudentDTO {

    private String name;
    private String contactInfo;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDTO{name: " + name + ", contactInfo: " + contactInfo + ", age: " + age + "}";
    }

    public static StudentDTOBuilder getBuilder() {
        return new StudentDTOBuilder();
    }

    public static class StudentDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String contactInfo;
        private StudentDTO studentDTO;

        public StudentDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public StudentDTOBuilder withContactInfo(ContactInfo contactInfo) {
            this.contactInfo = contactInfo.getHouseNumber() + " " + contactInfo.getStreet() + " " + contactInfo.getCity() + " "
                    + contactInfo.getState() + " " + contactInfo.getState() + " " + contactInfo.getZipcode();
            return this;
        }

        public StudentDTO build() {
            this.studentDTO = new StudentDTO();
            studentDTO.setName(firstName + " " + lastName);
            studentDTO.setContactInfo(contactInfo);
            studentDTO.setAge(age);
            return this.studentDTO;
        }

        public StudentDTO getStudentDTO() {
            return this.studentDTO;
        }
    }
}
