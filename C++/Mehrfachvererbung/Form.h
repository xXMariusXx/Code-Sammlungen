//
// Created by Marius Wegener on 28.11.18.
//

#ifndef C_FORM_H
#define C_FORM_H

#include "Punkt.h"

class Form {
private:
    Punkt bezugspunkt;

public:

    Form(Punkt p);

    int getX(){
        return bezugspunkt.getX();
    }
    int getY(){
        return bezugspunkt.getY();
    }

    virtual int berechneFlaeche() = 0; //-> abstrakt Methode, daher auch abstrakte Klasse
};

#endif //C_FORM_H
