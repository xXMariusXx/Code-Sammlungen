//
// Created by Marius Wegener on 28.11.18.
//

#ifndef C_RECHTECK_H
#define C_RECHTECK_H

#include "Form.h"

class Rechteck: virtual public Form {
private:
    int hoehe;
    int breite;

public:
    Rechteck(Punkt p, int hoehe, int breite);
    void setHoehe(int x);
    void setBreite(int y);

    int berechneFlaeche();

};


#endif //C_RECHTECK_H
