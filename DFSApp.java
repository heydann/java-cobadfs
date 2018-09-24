/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaDFS;

/**
 *
 * @author SUBARI
 */
public class DFSApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addVertex('F');
        theGraph.addVertex('G');

        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(0, 3); //AC
        theGraph.addEdge(3, 4); //DE
        theGraph.addEdge(0, 5);
        theGraph.addEdge(5, 6);
        
        System.out.print("visits : ");
        theGraph.dfs();
        System.out.println();
    }
}
