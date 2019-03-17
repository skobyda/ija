package ija.ija2018.homework1.board;

public interface Field {
    public static enum Direction {
        D,
        L,
        LD,
        LU,
        R,
        RD,
        RU,
        U
    }

	public boolean put(Disk disk);
	public Disk get();
	public boolean isEmpty();
	public boolean remove(Disk disk);
    public void addNextField(Field.Direction dirs, Field field);
    public Field nextField(Field.Direction dirs);
}
