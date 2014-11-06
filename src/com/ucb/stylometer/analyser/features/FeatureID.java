/*
 * The MIT License
 *
 * Copyright 2014 Filipe Sateles <filipe.sateles@outlook.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ucb.stylometer.analyser.features;

/**
 *
 * @author Filipe Sateles <filipe.sateles@outlook.com>
 */
public enum FeatureID {
    
    WORD_COUNT("Word count", "Number of words in the sample."),
    
    WORD_FREQUENCY_CALCULATOR("Word frequecy", "Counts the frequecy of the words."),
    
    WORD_LENGTH_CALCULATOR("Words Length", "Calculates the length of every unique word.");
    
    //<editor-fold defaultstate="collapsed" desc=" Custom Enum Setup ">
    private final String name;
    private final String description;
    
    private FeatureID(String name, String description) {
        this.name = name;
        this.description = description;
    }
     
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
    //</editor-fold>
    
}
