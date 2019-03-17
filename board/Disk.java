package ija.ija2018.homework1.board;

public class Disk {
	private boolean isWhite;
    private Field position;

	public Disk(boolean isWhite) {
        this.isWhite = isWhite;
    }

	public boolean isWhite() {
        return isWhite;
    }

    public void setPosition(Field field) {
        this.position = field;
    }

    public boolean move(Field moveTo) {
        Field field = position;
        if (position == null || position.equals(moveTo))
            return false;

        boolean emptiness = true;

        while (field != null && emptiness && !field.equals(moveTo)) {
            field = field.nextField(Field.Direction.L);
            if (field != null) {
                emptiness = field.isEmpty();
                if (field.equals(moveTo)) {
                    position.remove(this);
                    this.position = moveTo;
                    moveTo.put(this);
                    return true;
                }
            }
        }

        field = position;
        while (field != null && emptiness && !field.equals(moveTo)) {
            field = field.nextField(Field.Direction.R);
            if (field != null) {
                emptiness = field.isEmpty();
                if (field.equals(moveTo)) {
                    position.remove(this);
                    this.position = moveTo;
                    moveTo.put(this);
                    return true;
                }
            }
        }

        field = position;
        while (field != null && emptiness && !field.equals(moveTo)) {
            field = field.nextField(Field.Direction.U);
            if (field != null) {
                emptiness = field.isEmpty();
                if (field.equals(moveTo)) {
                    position.remove(this);
                    this.position = moveTo;
                    moveTo.put(this);
                    return true;
                }
            }
        }

        field = position;
        while (field != null && emptiness && !field.equals(moveTo)) {
            field = field.nextField(Field.Direction.D);
            if (field != null) {
                emptiness = field.isEmpty();
                if (field.equals(moveTo)) {
                    position.remove(this);
                    this.position = moveTo;
                    moveTo.put(this);
                    return true;
                }
            }
        }

        return false;
    }
}
