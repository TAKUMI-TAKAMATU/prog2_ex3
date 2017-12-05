package jp.ac.uryukyu.ie.ex3.pair10;
public class Dice{
		//フィールド
		private int value;
		//コンストラクタ
		public Dice(){
			play();
		}
		//メソッド
		public int getValue(){
			return value;
		}
		public void setValue(int value){
			this.value = value;
		}
		public void play(){
			value = (int)(Math.random()*6) + 1;
		}
}
