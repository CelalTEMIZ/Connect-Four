
package connectfour;

/**
 * Cell class to represent a Connect Four cell.
 * @author celaltemiz
 */
public class Cell {
    
    private char cellPosition;
    private int  rowPosition;
    private int  cellState;
     
    /**
     * No parameter constructor 
     */
    public Cell()
    {
      cellPosition = ' ';
      rowPosition  =  0; 
      cellState = 0;
    } 
    
    /**
     * Constructor that takes cell position and row position
     * @param newCellPosition character to cell position
     * @param newRowPosition integer to row position
     */
    public Cell( char newCellPosition,  int newRowPosition)
    {
      cellPosition = newCellPosition;
      rowPosition  =  newRowPosition;  
    }
    
    /**
     * Set the cell position
     * @param newCellPosition character to cell position
     */
    public void  setCellPosition(char newCellPosition)
    {
        cellPosition = newCellPosition;     
    }

    /**
     * Set the row position
     * @param newRowPosition integer to row position
     */
    public void setRowPosition( int newRowPosition)
    {
          rowPosition = newRowPosition;
    }
      
    /**
     * Set cell and row position
     * @param newCellPosition character to cell position
     * @param newRowPosition  integer to row position
     */
    public void setAllPosition( char newCellPosition, int newRowPosition)
    {
      cellPosition =  newCellPosition;
      rowPosition  =  newRowPosition;  
    }

    /**
     * Set the cell state
     * @param newCellState integer to cell state
     */
    public void  setCellState(int newCellState)
    {
        cellState = newCellState;     
    }
    
    /**
     * Getter to cell state
     * @return cell state
     */
    public int getCellState()
    {
        return cellState;
    }
    
    /**
     * Get Cell Position
     * @return cell position
     */
    public char getCellPosition() 
    {
      return cellPosition;      
    }

   
    /**
     * Getter the row position
     * @return row position
     */
    public int getRowPosition() 
    {
      return rowPosition;
    }
   
    
}
