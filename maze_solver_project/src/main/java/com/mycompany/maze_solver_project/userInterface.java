/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver_project;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author Apurba Naskar
 */
public class userInterface extends JFrame{
    private int [][] maze={
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
        {1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1},
        {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
        {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public ArrayList<Integer> path=new ArrayList<>();

     userInterface(){
        setTitle("Maze Solver");
        setSize(640,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DepthFirst.searchpath(maze,1,1,path);
    }
    @Override
    public void paint(Graphics g){
        g.translate(100,100);

        for(int i=0;i< maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                Color color;

                switch (maze[i][j]){
                    case 1:color=Color.BLACK;break;
                    case 9:color=Color.RED;break;
                    default:color=Color.WHITE;break;
                }
                g.setColor(color);
                g.fillRect(40*i,40*j,40,40);

                g.setColor(Color.RED);
                g.drawRect(40*i,40*j,40,40);
            }
        }
        for(int i=0;i<path.size();i+=2){
            int pathx=path.get(i);
            int pathy=path.get(i+1);

            g.setColor(Color.GREEN);
            g.fillRect(40*pathx,40*pathy,20,20);

        }
    }

    public static void main(String [] args){
        userInterface view=new userInterface();
        view.setVisible(true);
    }
}
