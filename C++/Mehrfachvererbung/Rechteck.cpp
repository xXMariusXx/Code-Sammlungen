//
// Created by Marius Wegener on 28.11.18.
//

#include "Rechteck.h"

Rechteck::Rechteck(Punkt p, int hoehe, int breite): Form(p), hoehe{hoehe}, breite{breite} {};


void Rechteck::setHoehe(int x)
{
    hoehe=x;
}

void Rechteck::setBreite(int y)
{
    hoehe=y;
}

int Rechteck::berechneFlaeche() {
    return hoehe*breite;
}