package hw5;

public class MyRectangle {
	double width, depth;
	
	//設定寬度
	void setWidth(double width) {
		this.width = width;
	}
	
	//設定深度
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	//算面積並回傳
	double getArea() {
		return width*depth;
	}
	
	
	//無參數建構子，保留資料設定彈性
	public MyRectangle() {
		
	}
	
	
	//有參數建構子，已進行初始化設定
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

}
