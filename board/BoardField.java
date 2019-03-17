package ija.ija2018.homework1.board;

public class BoardField implements Field {
	protected int col;
	protected int row;
	protected boolean hasDisk;
	protected Disk disk;
	protected Field Dfield;
	protected Field Lfield;
	protected Field LDfield;
	protected Field LUfield;
	protected Field Rfield;
	protected Field RDfield;
	protected Field RUfield;
	protected Field Ufield;

	public BoardField(int col, int row) {
        this.col = col;
        this.row = row;
    }

	public boolean put(Disk disk) {
        if (hasDisk)
            return false;

        this.disk = disk;
        this.hasDisk = true;
        disk.setPosition(this);
        return true;
    }

	public Disk get() {
        if (!hasDisk)
            return null;

        return disk;
    }

	public boolean isEmpty() {
        return !hasDisk;
    }

	public boolean remove(Disk disk) {
        if (this.disk.equals(disk)) {
            this.disk = null;
            this.hasDisk = false;
            return true;
        }
        return false;
    }

    public void addNextField(Field.Direction dirs, Field field) {
        switch(dirs) {
            case D:
                this.Dfield = field;
                break;
            case L:
                this.Lfield = field;
                break;
            case LD:
                this.LDfield = field;
                break;
            case LU:
                this.LUfield = field;
                break;
            case R:
                this.Rfield = field;
                break;
            case RD:
                this.RDfield = field;
                break;
            case RU:
                this.RUfield = field;
                break;
            case U:
                this.Ufield = field;
                break;
        }
    }

    public Field nextField(Field.Direction dirs) {
        switch(dirs) {
            case D:
                return Dfield;
            case L:
                return Lfield;
            case LD:
                return LDfield;
            case LU:
                return LUfield;
            case R:
                return Rfield;
            case RD:
                return RDfield;
            case RU:
                return RUfield;
            case U:
                return Ufield;
        }

        return null;
    }
}
