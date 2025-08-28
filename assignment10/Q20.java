// 20)Create class Tile to store the edge length of a square tile , and create another 
// class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile
//  as argument to calculate the whole number of tiles needed to cover the floor completely.

class Tile{
    private float length;
    public Tile(float length){ this.length = length;}
    public float getLength(){
        return length;
    }
}
class Floor{
    private float length;
    private float width;
    public Floor(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float totalTiles(Tile t){
        float length = t.getLength();
        float totalTile = (this.length * this.width) / (length*length);
        return totalTile;
    }
}
class Test{
    public static void main(String args[]){
        Floor f = new Floor(19,19);
        Tile tile1 = new Tile(3);
        System.out.println(f.totalTiles(tile1));
    }
}