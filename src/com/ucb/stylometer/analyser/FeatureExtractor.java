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
package com.ucb.stylometer.analyser;

import com.ucb.stylometer.analyser.features.LinguisticFeature;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Filipe Sateles <filipe.sateles@outlook.com>
 */
public class FeatureExtractor {
    
    private final Set<LinguisticFeature> featureSet;
    private final String sample;

    public FeatureExtractor(String sample) {
        this.featureSet = new HashSet<>();
        this.sample = sample;
    }
    
    public FeatureExtractor addFeature(LinguisticFeature feature) {
        this.featureSet.add(feature);
        return this;
    }
    
    public void removeFeature(LinguisticFeature feature) {
        this.featureSet.remove(feature);
    }
    
    public Set<LinguisticFeature> getFeatures() {
        return this.featureSet;
    }
    
    public FeatureResultSet extract() {
        FeatureResultSet featureResultSet = new FeatureResultSet();
        
        this.featureSet.stream().forEach((feature) -> {
            featureResultSet.addResult(feature.extract(sample));
        });
        
        return featureResultSet;
    }
}
