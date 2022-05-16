package JavaExamplesRobertson;

public class TypeCastingSample {
public static void main(String[] args) {
double payment;
double cost;
int changeInDollars;

payment = 10;
cost = 5.1;

double change = payment - cost;
changeInDollars = (int) (change);

System.out.println(changeInDollars);
}


}
