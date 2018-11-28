//
// Created by Marius Wegener on 28.11.18.
//

#ifndef C_PUNKT_H
#define C_PUNKT_H


class Punkt {
private:
    int x;
    int y;

public:
    Punkt(int x, int y): x{x}, y{y} {};

    inline int getX(){
        return x;
    }

    inline int getY(){
        return y;
    }
};


#endif //C_PUNKT_H
