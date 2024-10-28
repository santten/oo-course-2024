import java.util.Scanner;

public class T1_name_gen {
    public static void main(String[] args) {
        System.out.printf("Name Generator 💫%n" +
                "====================================%n" +
                "How many names you want to generate?%n");
        Scanner scanner = new Scanner(System.in);
        int userResponse = Integer.parseInt(scanner.nextLine());
        String[] firstNames = new String[] {
                "Emma", "Liam", "Olivia", "Noah", "Ava",
                "Elijah", "Isabella", "James", "Sophia", "Lucas",
                "Charlotte", "Mason", "Amelia", "Harper", "Jackson",
                "Evelyn", "Aiden", "Abigail", "Grayson", "Scarlett",
                "Sebastian", "Chloe", "Carter", "Mila", "Owen",
                "Aria", "Dylan", "Ellie", "Wyatt", "Zoe",
                "Matthew", "Lily", "Gabriel", "Nora", "Julian",
                "Grace", "Levi", "Riley", "Isaac", "Addison",
                "Caleb", "Hannah", "Henry", "Luna", "Anthony",
                "Layla", "Joshua", "Natalie", "Christopher", "Avery",
                "Andrew", "Brooklyn", "Eli", "Savannah", "Nathan",
                "Victoria", "Samuel", "Stella", "Isaiah", "Skylar",
                "David", "Paisley", "Gavin", "Kinsley", "Daniel",
                "Madison", "Cole", "Bella", "Jaxon", "Clara",
                "Jaxon", "Samantha", "Ryan", "Alice", "Christian",
                "Delilah", "Jonathan", "Naomi", "Angel", "Trinity",
                "Brody", "Cora", "Xavier", "Serenity", "Jade",
                "Dominic", "Elena", "Ian", "Autumn", "Harrison",
                "Adeline", "Aaron", "Kylie", "Asher", "Kaylee",
                "Ryder", "Katherine", "Zachary", "Lydia", "Leo"
        };

        String[] lastNames = new String[] {"Smith", "Johnson", "Williams", "Brown",
                "Jones", "Garcia", "Miller", "Davis",
                "Rodriguez", "Martinez", "Hernandez", "Lopez",
                "Gonzalez", "Wilson", "Anderson", "Thomas",
                "Taylor", "Moore", "Jackson", "Martin",
                "Lee", "Perez", "Thompson", "White",
                "Harris", "Sanchez", "Clark", "Ramirez",
                "Lewis", "Robinson", "Walker", "Young",
                "Allen", "King", "Wright", "Scott",
                "Torres", "Nguyen", "Hill", "Flores",
                "Green", "Adams", "Nelson", "Baker",
                "Hall", "Rivera", "Campbell", "Mitchell",
                "Carter", "Roberts", "Gonzales", "Phillips",
                "Evans", "Turner", "Diaz", "Parker"};

        int firstLength = firstNames.length;
        int lastLength = lastNames.length;
        System.out.printf("amount of first names to choose from: %s %namount of last names to choose from: %s%n", firstLength, lastLength);

        for (int i = 1; i <= userResponse; i++) {
            int firstNameInt = (int) (Math.random() * firstLength);
            int lastNameInt = (int) (Math.random() * lastLength);
            System.out.printf("%s. %s %s %n", i, firstNames[firstNameInt], lastNames[lastNameInt]);
        }
    }
}
