package entidade;

public class barra {
	
	private Integer nome;
	private Integer no1;
	private Integer no2;
	private Double x1;
	private Double x2;
	private Double y1;
	private Double y2;

	public barra () {
		
	}

	public barra(Integer nome, Integer no1, Integer no2, Double x1, Double x2, Double y1, Double y2) {
		this.nome = nome;
		this.no1 = no1;
		this.no2 = no2;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public Integer getNome() {
		return nome;
	}

	public void setNome(Integer nome) {
		this.nome = nome;
	}

	public Integer getNo1() {
		return no1;
	}

	public void setNo1(Integer no1) {
		this.no1 = no1;
	}

	public Integer getNo2() {
		return no2;
	}

	public void setNo2(Integer no2) {
		this.no2 = no2;
	}

	public Double getX1() {
		return x1;
	}

	public void setX1(Double x1) {
		this.x1 = x1;
	}

	public Double getX2() {
		return x2;
	}

	public void setX2(Double x2) {
		this.x2 = x2;
	}

	public Double getY1() {
		return y1;
	}

	public void setY1(Double y1) {
		this.y1 = y1;
	}

	public Double getY2() {
		return y2;
	}

	public void setY2(Double y2) {
		this.y2 = y2;
	}

	public double comprimento () {
		
		 double ca = (x2 - x1);
		 double cb = (y2 - y1);
		 return Math.sqrt(ca*ca + cb*cb);
	}
	
	public double angulo () {
		
		 double ca = (x2 - x1);
		 double cb = (y2 - y1);
		 double div = (cb/ca);
		 double a = Math.atan(div);
		 double abs = Math.abs(a);
		 return Math.toDegrees(abs);
	}

}
