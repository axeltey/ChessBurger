package model;

import java.awt.Image;

import cases.Piece;

public class ListImagePiece {
	
	private Piece[] pieces;
	private Image[] images;
	private int[] positionX;
	private int[] positionY;
	
	public ListImagePiece() {
		pieces= new Piece[32];
		images= new Image[32];
		positionX= new int[32];
		positionY= new int[32];
	}
	
	public void ajoutImagePiece(Piece piece,Image image,int x,int y) {
		for(int i=0;i<32;i++) {
			if(pieces[i]==null) {
				pieces[i]=piece;
				images[i]=image;
				positionX[i]=x;
				positionY[i]=y;
			}
		}
	}
	
	public void setPosition(Piece piece,int x,int y) {
		for(int i=0;i<32;i++) {
			if(pieces[i]==piece) {
				positionX[i]=x;
				positionY[i]=y;
			}
		}
	}
	
	public void setImage(Piece piece,Image image) {
		for(int i=0;i<32;i++) {
			if(pieces[i]==piece) {
				images[i]=image;
			}
		}
	}
	
	public Image getImage(Piece piece) {
		for(int i=0;i<32;i++) {
			if(pieces[i]==piece) {
				return images[i];
			}
		}
		return null;
	}
	
	public int getX(Piece piece) {
		for(int i=0;i<32;i++) {
			if(pieces[i]==piece) {
				return positionX[i];
			}
		}
		return -1;
	}
	
	public int getY(Piece piece) {
		for(int i=0;i<32;i++) {
			if(pieces[i]==piece) {
				return positionY[i];
			}
		}
		return -1;
	}
	
	public void supprimerImagePiece(Piece piece) {
		for(int i=0;i<32;i++) {
			if(pieces[i]==piece) {
				pieces[i]=null;
				images[i]=null;
				positionX[i]=-1;
				positionY[i]=-1;
			}
		}
	}
}
