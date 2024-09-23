public class ResultUserGetSet {
    public static void main(String[] args) {
        UserGetSet user = new UserGetSet();

        user.setName("Lucas");

        String result2 = user.getName();
        System.out.println(result2);

        user.setAge(18);


        int resutlAge = user.getAge();
        System.out.println(resutlAge);
    }
}
