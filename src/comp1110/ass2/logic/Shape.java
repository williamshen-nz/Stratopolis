package comp1110.ass2.logic;

import static comp1110.ass2.logic.Colour.*;

/**
 * Created by William Shen on 15/08/16
 */

/**
 * We represent a L-tile as a triple (a, b, c). We encode a piece with indexes:
 *      [a]  [b]
 *      [c]
 * For example, piece 'A' is represented as (Red, Black, Black), i.e.
 *      RED  BLACK
 *      BLACK
 * Note that the orientation of a L-tile as shown above is 'A'
 *
 * For tile 'U' we encode it as a tuple (a, b) where:
 *      [a]  =  RED
 *      [b]  =  GREEN
 * The initial orientation of 'U' with this configuration is 'A'
 */

public enum Shape {
    // Red Player: 'A' to 'J'
    A(Red, Black, Black),
    B(Black, Black, Red),
    C(Black, Red, Black),
    D(Red, Black, Red),
    E(Black, Red, Red),
    F(Red, Red, Black),
    G(Red, Green, Red),
    H(Green, Red, Red),
    I(Red, Red, Green),
    J(Red, Red, Red),
    // Green Player: 'K' to 'T'
    K(Green, Black, Black),
    L(Black, Black, Green),
    M(Black, Green, Black),
    N(Green, Black, Green),
    O(Black, Green, Green),
    P(Green, Green, Black),
    Q(Green, Red, Green),
    R(Red, Green, Green),
    S(Green, Green, Red),
    T(Green, Green, Green),
    // Starting Shape: 'U'
    U(Red, Green);

    // Array representing colours in a piece/tile
    final Colour[] colours;

    // Constructor for tile types 'A' to 'T' - i.e. L-shaped
    Shape(Colour a, Colour b, Colour c) {
        colours = new Colour[3];
        colours[0] = a;
        colours[1] = b;
        colours[2] = c;
    }

    // Constructor for tile 'U' - i.e. I-shaped
    Shape(Colour a, Colour b) {
        colours = new Colour[2];
        colours[0] = a;
        colours[1] = b;
    }
}