//
// Created by Marius Wegener on 28.11.18.
//

#include <iostream>
#include "main.h"
#include "BeschriftetesRechteck.h"

using namespace std;

int main(){
    const Punkt p1(10,12);
    BeschriftetesRechteck br(p1,10,20,"ein beschriftetes Rechteck");

    br.zeichneBeschriftung();
    cout << "Flächeninhalt: " << br.berechneFlaeche() << endl;

    BeschriftetesRechteck *f = new BeschriftetesRechteck(Punkt(5,10),25,50,"ein 2. beschriftetes Rechteck");

    int x = f->getX();
    cout << "Koordination Rechteck 2: " << x << "," << f->getY() << endl;

    f->zeichneBeschriftung();
}
