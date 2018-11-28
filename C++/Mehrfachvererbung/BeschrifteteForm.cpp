//
// Created by Marius Wegener on 28.11.18.
//

#include "BeschrifteteForm.h"
#include <iostream>

using namespace std;

BeschrifteteForm::BeschrifteteForm(const Punkt p, const std::string text): Form(p), beschriftung{text} {};


void BeschrifteteForm::zeichneBeschriftung() {
    cout << "Beschriftung von BeschrifteteForm:" << endl;
    cout << beschriftung << endl;
    cout << "" << endl;
}
