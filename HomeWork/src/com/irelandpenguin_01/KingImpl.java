package com.irelandpenguin_01;

public class KingImpl implements Game {
	private String gameName;
	private String playerName;
	private double playerTimer;
	 //���췽��
	public KingImpl (){}
	public KingImpl(String gameName,String playerName,double playerTimer){
		this.gameName=gameName;
		this.playerName=playerName;
		this.playerTimer=playerTimer;
	}
	//��Ա������
	public void setGameName(String gameName){
		this.gameName=gameName;
	}
	public String getGameName(){
		return this.gameName;
	}
	public void setPlayerName(String playerName){
		this.playerName=playerName;
	}
	public String getPlayerName(){
		return this.playerName;
	}
	public void setPlayerTimer(double playerTimer){
		this.playerTimer=playerTimer;
	}
	public double getPlayerTimer(){
		return this.playerTimer;
	}
	//������д
	@Override
	public void playerGame() {
		System.out.println("playing games");
	}
	@Override
	public String toString(){
		return "game name:"+gameName+" player name:"+playerName+" player timer"+playerTimer;
	}
}
