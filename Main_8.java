public class Main_8 {

        public static void main(String[] args) {
            char [][]student = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

            char []key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

            int []score = new int[10];

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {
                    if (student[i][j] == key[j]) {
                        score[i]++;
                    }
                }
            }

            for (int s = 0; s < 8; s++) {
                System.out.println(" Score of student " + (s + 1) + " is " + score[s] + " marks.");
            }
        }
    }
