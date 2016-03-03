# Domineering
https://en.wikipedia.org/wiki/Domineering

JAVA Implementation of Domineering game from the game theory perspective. Implementing both a 2 player version 
and a single player vs computer game. The computer will calculate the move based on MinMax algorithm and making 
decision trees for the next best move to play.

Rules of the Game:
The players alternately place a domino (2x1 tile) on a board. The two players are denoted by
Vertical and Horizontal (black and white respectively). In standard domineering the first player is Vertical,
who is only allowed to place its dominoes vertically on the board. Horizontal may play only horizontally. Of course,
dominoes are not allowed to overlap. A player wins when his opponent is not able to make a move.

To place a domino, consider the following example:

    A B C D
   +-+-+-+-+
 1 |O|O|-|*| 1
 2 |-|-|-|*| 2
 3 |-|*|-|-| 3
 4 |-|*|-|-| 4
   +-+-+-+-+
    A B C D
O to move (horizontal)

Horizontal (white) can place on A2, B2, C3, and C4. After placing
on A2 the board will look like this:

    A B C D
   +-+-+-+-+
 1 |O|O|-|*| 1
 2 |O|O|-|*| 2
 3 |-|*|-|-| 3
 4 |-|*|-|-| 4
   +-+-+-+-+
    A B C D
* to move (vertical)

and it will be vertical's (black) turn.
