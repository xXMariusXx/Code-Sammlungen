//
// Created by Marius Wegener on 28.11.18.
//

#include "BeschriftetesRechteck.h"
#include <string>
#include <iostream>

using namespace std;

BeschriftetesRechteck::BeschriftetesRechteck(const Punkt p, const int hoehe, const int breite, const string text) : Form(p), BeschrifteteForm(p,text), Rechteck(p, hoehe, breite)
{

}

int BeschriftetesRechteck::berechneFlaeche(){
    return Rechteck::berechneFlaeche();
}

void BeschriftetesRechteck::zeichneBeschriftung() {
    cout << "Beschriftung von BeschriftetesReckteck:" << endl;
    BeschrifteteForm::zeichneBeschriftung();
}