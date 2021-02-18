package builder.firstimpl;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directorBuild(builder, user);

        System.out.println(dto);
    }

    private static UserDTO directorBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1984, 12, 03));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
