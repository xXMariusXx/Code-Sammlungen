//
// Created by Marius Wegener on 28.11.18.
//

#ifndef C_BESCHRIFTETEFORM_H
#define C_BESCHRIFTETEFORM_H

#include <string>
#include "Form.h"

class BeschrifteteForm: virtual public Form {
private:
    std::string beschriftung;

public:
    BeschrifteteForm(const Punkt p, const std::string text);
    virtual void zeichneBeschriftung();
};


#endif //C_BESCHRIFTETEFORM_H
