//
// Created by Marius Wegener on 28.11.18.
//

#ifndef C_BESCHRIFTETESRECHTECK_H
#define C_BESCHRIFTETESRECHTECK_H


#include "BeschrifteteForm.h"
#include "Rechteck.h"

class BeschriftetesRechteck: public BeschrifteteForm, public Rechteck {

public:
    BeschriftetesRechteck(const Punkt p, const int hoehe, const int breite, const std::string text);

    int berechneFlaeche() override;

    void zeichneBeschriftung() override;

};


#endif //C_BESCHRIFTETESRECHTECK_H
