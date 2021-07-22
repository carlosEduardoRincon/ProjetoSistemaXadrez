
package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 *
 * @author Carlos Eduardo
 */
public class Program {

    public static void main(String[] args) {
        // TODO code application logic here
        ChessMatch c1 = new ChessMatch();
        UI.printBoard(c1.getPieces());
    }
    
}
