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
class Vertex {
    public char label;
    public boolean wasVisited;
    
    public Vertex(char lab){
        label = lab;
        wasVisited = false;
    }
}

class Graph {
    private final int Max_Verts = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private StackX theStack;
    
    public Graph(){
        vertexList = new Vertex[Max_Verts];
        adjMat = new int[Max_Verts][Max_Verts];
        nVerts = 0;
        for (int j = 0; j < Max_Verts; j++) {
            for (int k = 0; k < Max_Verts; k++) {
                adjMat[j][k] = 0;
                theStack = new StackX();
            }
        }
    }
    
    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }
    
    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }
    
    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        
        while(!theStack.isEmpty()){
            int v = getAdjUnvisitedVertex(theStack.peek());
            if(v == -1){
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false;
        }
    }
    
    public int getAdjUnvisitedVertex(int v){
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j]==1 && vertexList[j].wasVisited==false) {
                return j;
            } 
        }
        return -1;
    }
}
