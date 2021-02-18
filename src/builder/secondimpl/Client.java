package builder.secondimpl;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        Student student = createStudent();
        StudentDTO dto = directBuild(StudentDTO.getBuilder(), student);
        System.out.println(dto);
    }

    private static StudentDTO directBuild(StudentDTO.StudentDTOBuilder builder, Student student) {
        return builder.withFirstName(student.getFirstName())
                .withLastName(student.getLastName())
                .withBirthday(student.getBirthday())
                .withContactInfo(student.getContactInfo())
                .build();
    }

    public static Student createStudent() {
        Student student = new Student();
        student.setBirthday(LocalDate.of(1984, 12,03));
        student.setFirstName("John");
        student.setLastName("Jonson");
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setHouseNumber("1569");
        contactInfo.setStreet("State Street");
        contactInfo.setCity("Pawnee");
        contactInfo.setState("Indiana");
        contactInfo.setZipcode("47988");
        student.setContactInfo(contactInfo);
        return student;
    }


}
