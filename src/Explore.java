public class Explore {

    public static void main(String[] args) {
        String[] friends = {"Ben", "Alena", "Pasan"};
        // Enhanced for loop
        for (String friend : friends) {
            System.out.printf("Hey %s! The movie starts at 7, see you there! %n",
                    friend);
        }

        // Regular for loop
        for (int i = 0; i < friends.length; i++) {
            String friend = friends[i];
            System.out.printf("Hey %s! The movie starts at 7, see you there! %n",
                    friend);
        }


    }

}