import java.util.ArrayList;

public class week2Challenge {
    public static void main(String[] args) {

        // variables
        int counter = 1;
        int ingCounter = 0;

        // do while loop until the counter equals to 25 burritos
        do {
            ArrayList<String> burrito = new ArrayList<String>();
            //This in here should be the data type including empty ()
            burrito.add(riceChoice());
            burrito.add(meatChoice());
            burrito.add(beansChoice());
            burrito.add(salsaChoice());
            burrito.add(veggiesChoice());
            burrito.add(cheeseChoice());
            burrito.add(guacChoice());
            burrito.add(quesoChoice());
            burrito.add(sourCream());

            System.out.print("Burrito " + counter + ": ");
            for (int b = 0; b < burrito.size(); b++) {
                if (burrito.get(b).contains("all")) {
                    ingCounter += 3;
                } else if (!burrito.get(b).contains("no")) {
                    ingCounter++;
                }
                if (b < (burrito.size() - 1)) {
                    System.out.print(burrito.get(b) + ", ");
                } else {
                    System.out.print(burrito.get(b));
                }
            }
            cost(counter, ingCounter);
            //this one should counter from 0 in order to get the correct price of the Burrito
            ingCounter = 0;
            System.out.println();

            burrito.clear();

            counter++;

        } while (counter <= 25);
    }
    // the public methods should be outside of the main method

        public static void cost(int count, int ingred){
            System.out.println("\nBurrito " + count + " cost: $" + (3 +(.50*ingred)) + "0");
        }

        public static String riceChoice(){
            ArrayList<String> rice = new ArrayList<>();
            rice.add("white");
            rice.add("brown");
            rice.add("none");
            rice.add("all");
            return rice.get((int) (Math.random()* rice.size()));
        }

        public static String meatChoice(){
            ArrayList<String> meat = new ArrayList<>();
            meat.add("chicken");
            meat.add("steak");
            meat.add("carnitas");
            meat.add("chorizo");
            meat.add("sofritas");
            meat.add("none");
            meat.add("all");
            return meat.get((int) (Math.random()* meat.size()));
        }

        public static String beansChoice(){
            ArrayList<String> beans = new ArrayList<>();
            beans.add("pinto");
            beans.add("black");
            beans.add("none");
            beans.add("all");
            return beans.get((int) (Math.random()* beans.size()));
        }

        public static String salsaChoice(){
            ArrayList<String> salsa = new ArrayList<>();
            salsa.add("mild");
            salsa.add("medium");
            salsa.add("hot");
            salsa.add("none");
            salsa.add("all");
            return salsa.get((int) (Math.random()* salsa.size()));
        }

        public static String veggiesChoice(){
            ArrayList<String> veggies = new ArrayList<>();
            veggies.add("lettuce");
            veggies.add("fajita veggies");
            veggies.add("none");
            veggies.add("all");
            return veggies.get((int) (Math.random()* veggies.size()));
        }

        public static String cheeseChoice(){
            ArrayList<String> cheese = new ArrayList<>();
            cheese.add("cheese");
            cheese.add("no cheese");
            return cheese.get((int) (Math.random()* cheese.size()));
        }

        public static String guacChoice(){
            ArrayList<String> guac = new ArrayList<>();
            guac.add("guac");
            guac.add("no guac");
            return guac.get((int) (Math.random()* guac.size()));
        }

        public static String quesoChoice(){
            ArrayList<String> queso = new ArrayList<>();
            queso.add("queso");
            queso.add("no queso");
            return queso.get((int) (Math.random()* queso.size()));
        }

        public static String sourCream(){
            ArrayList<String> sour = new ArrayList<>();
            sour.add("sour cream");
            sour.add("no sour cream");
            return sour.get((int) (Math.random()* sour.size()));
        }

}
