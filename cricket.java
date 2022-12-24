import java.io.*;

class Inning_Invalid extends Exception {
}

class CricketPlayer {
    int no_of_in, runs, bat_avg;
    String name;
    int not_out;

    CricketPlayer() {
    }

    CricketPlayer(String n, int no, int n_out, int r) {
        name = n;
        no_of_in = no;
        not_out = n_out;
        runs = r;
    }

    void cal_avg() {
        try {
            if (no_of_in == 0)
                throw new Inning_Invalid();
            bat_avg = runs / no_of_in;
        } catch (Inning_Invalid ob) {
            System.out.println("no of inning can not be zero");
            runs = 0;
            bat_avg = 0;
        }
    }

    void display() {
        System.out.println(name + "\t" + no_of_in + "\t" + not_out + "\t" + runs + "\t" + bat_avg);
    }

    float getavg() {
        return bat_avg;
    }

    public static void sortPlayer(CricketPlayer c[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (c[j].getavg() > c[j + 1].getavg()) {
                    CricketPlayer t = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < n; i++)
            c[i].display();

    }
}

class Cricket {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of Player:");
        int n = Integer.parseInt(br.readLine());
        CricketPlayer cp[] = new CricketPlayer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name:");
            String name = br.readLine();

            System.out.print("Enter no of innings:");
            int in = Integer.parseInt(br.readLine());

            System.out.print("Enter no of times not out:");
            int ot = Integer.parseInt(br.readLine());

            System.out.print("Enter total runs:");
            int r = Integer.parseInt(br.readLine());
            cp[i] = new CricketPlayer(name, in, ot, r);
            cp[i].cal_avg();
        }
        System.out.println("===============================");
        for (int i = 0; i < n; i++)
            cp[i].display();

        CricketPlayer.sortPlayer(cp, n);
    }
}
