import java.util.LinkedList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        UDLAProlog knowledgeBase;
        UDLAPredicate predicate;
        //
        String query;
        String variable;
        LinkedList<String> atomTerms;
        //
        knowledgeBase = new UDLAProlog();
        knowledgeBase.addKnowledge("C:/Users/eri-d/IdeaProjects/MyJavaProlog/facts01.pl");
        knowledgeBase.addKnowledge("C:/Users/eri-d/IdeaProjects/MyJavaProlog/rules01.pl");
        //

        //EJEMPLO CON LECTURA DE CLIENTE y PELICULA
//        Scanner readercliente = new Scanner(System.in);
//        Scanner readerpelicula = new Scanner(System.in);
//        String cliente,pelicula;
//        //
//        System.out.println("---------Who Purchased----------");
//        cliente = readercliente.nextLine();
//        System.out.println("---------Movie Purchased----------");
//        pelicula = readerpelicula.nextLine();
//
//        System.out.println("---------Creating Predicate---------");
//        System.out.println(cliente);
//        System.out.println(pelicula);
//
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument(cliente);
//        predicate.addArgument(pelicula);
//        knowledgeBase.addFact(predicate);

//        System.out.println("-------------------");
//        query = "recommend(" + cliente + ", X).";
//        variable = "X";
//        atomTerms = knowledgeBase.queryAtom(query, variable);
//        System.out.println("Movie Recommended for " + cliente + " :");
//        atomTerms = knowledgeBase.removeRepeated(atomTerms);
//        knowledgeBase.showAtomTerms(atomTerms);
//        System.out.println("-------------------");



//          EJEMPLO de PREDICADO ORIGINAL JAVA Dr AYALA
//          predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("paco");
//        predicate.addArgument("dracula");
//        knowledgeBase.addFact(predicate);
//        System.out.println("-------------------");
//        query = "recommend(paco, X).";
//        variable = "X";
//        atomTerms = knowledgeBase.queryAtom(query, variable);
//        System.out.println("RESULT: ");
//        atomTerms = knowledgeBase.removeRepeated(atomTerms);
//        knowledgeBase.showAtomTerms(atomTerms);
//        System.out.println("-------------------");






//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("hugo");
//        predicate.addArgument("titanic");
//        knowledgeBase.addFact(predicate);
//
//        System.out.println("-------------------");

//        query = "recommend(hugo, X).";
//        variable = "X";
//        atomTerms = knowledgeBase.queryAtom(query, variable);
//        System.out.println("RESULT: ");
//        atomTerms = knowledgeBase.removeRepeated(atomTerms);
//        knowledgeBase.showAtomTerms(atomTerms);
//        System.out.println("-------------------");
//
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("hugo");
//        predicate.addArgument("titanic");
//        knowledgeBase.addFact(predicate);
//
//        System.out.println("-------------------");
//        query = "recommend(hugo, X).";
//        variable = "X";
//        atomTerms = knowledgeBase.queryAtom(query, variable);
//        System.out.println("RESULT: ");
//        atomTerms = knowledgeBase.removeRepeated(atomTerms);
//        knowledgeBase.showAtomTerms(atomTerms);
//        System.out.println("-------------------");
//
//
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("hugo");
//        predicate.addArgument("titanic");
//        knowledgeBase.retractAll(predicate);
//
//        System.out.println("-------------------");
//        query = "recommend(hugo, X).";
//        variable = "X";
//        atomTerms = knowledgeBase.queryAtom(query, variable);
//        System.out.println("RESULT: ");
//        atomTerms = knowledgeBase.removeRepeated(atomTerms);
//        knowledgeBase.showAtomTerms(atomTerms);
//        System.out.println("-------------------");


//
//







//
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("paco");
//        predicate.addArgument("dracula");
//        knowledgeBase.addFact(predicate);
//
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("luis");
//        predicate.addArgument("missionImpossible");
//        knowledgeBase.addFact(predicate);
//
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("hugo");
//        predicate.addArgument("blackswan");
//        knowledgeBase.addFact(predicate);
////
//
//        /////////////////////////////////////////////
//
//
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("paco");
//        predicate.addArgument("leon");
//        knowledgeBase.addFact(predicate);
//
//        System.out.println("-------------------");
//        query = "recommend(paco, X).";
//        variable = "X";
//        atomTerms = knowledgeBase.queryAtom(query, variable);
//        System.out.println("RESULT: ");
//        atomTerms = knowledgeBase.removeRepeated(atomTerms);
//        knowledgeBase.showAtomTerms(atomTerms);
//        System.out.println("-------------------");
////
//        predicate = new UDLAPredicate();
//        predicate.setName("purchase");
//        predicate.addArgument("paco");
//        predicate.addArgument("dracula");
//        knowledgeBase.retractAll(predicate);
//
//        System.out.println("-------------------");
//        query = "recommend(paco, X).";
//        variable = "X";
//        atomTerms = knowledgeBase.queryAtom(query, variable);
//        System.out.println("RESULT: ");
//        atomTerms = knowledgeBase.removeRepeated(atomTerms);
//        knowledgeBase.showAtomTerms(atomTerms);
//        System.out.println("-------------------");

    }//end main
}//end
