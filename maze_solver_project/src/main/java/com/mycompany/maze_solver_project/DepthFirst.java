/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver_project;
import java.util.ArrayList;

/**
 *
 * @author Apurba Naskar
 */
public class DepthFirst {
    public static boolean searchpath(int [][] maze, int x, int y, ArrayList<Integer> path){
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }

        if(maze[x][y]==0){
            maze[x][y]=2;
            if(searchpath(maze,x-1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(searchpath(maze,x+1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(searchpath(maze,x,y+1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(searchpath(maze,x,y-1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
    
}
