package com.irelandpenguin_01;

public class KingImpl implements Game {
	private String gameName;
	private String playerName;
	private double playerTimer;
	 //构造方法
	public KingImpl (){}
	public KingImpl(String gameName,String playerName,double playerTimer){
		this.gameName=gameName;
		this.playerName=playerName;
		this.playerTimer=playerTimer;
	}
	//成员方法；
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
	//方法重写
	@Override
	public void playerGame() {
		System.out.println("playing games");
	}
	@Override
	public String toString(){
		return "game name:"+gameName+" player name:"+playerName+" player timer"+playerTimer;
	}
}
