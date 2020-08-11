/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author lukeflaherty
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    
    
}

class Node{
    Node left, right;
    int data;
    
    public Node(int data){
        this.data = data;
    }
    
    //give it a node value (the one you want to insert)
    public void insert(int value){
        //if value is less than or equal to the actual data that is in our node 
        //than insert it on the left side
        if(value <= data){
            //exception checking
            if(left == null){
                left = new Node(value);
            }
            else{
                left.insert(value);
            }
        }
        else{
            if(right == null){
                right = new Node(value);
            }
            else{
                right.insert(value);
            }
        }
    }
    
    public boolean contains(int value){
        if(value == data){
            return true;
        }
        else if(value < data){
            if(left == null){
                return false;
            }
            else{
                return left.contains(value);
            }
        }
        else{
            if(right == null){
                return false;
            }
            else{
                return right.contains(value);
            }
        }
    }
    
    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        
        System.out.println(data);
        
        if(right != null){
            right.printInOrder();
        }
    }
    
}
        

