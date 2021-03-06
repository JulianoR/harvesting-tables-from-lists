/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regex_extractor;

import alg_listextract.FieldExtractor;

/**
 * This class recognizes the type 'Phone'.
 *
 * @since 15/07/2012 - Last change: 11/09/2012
 * @version 0.1
 * @author Juliano R.
 * @link https://github.com/JulianoR/Extract-Tables-from-Lists
 *
 */
public class PhoneFieldExtractor extends FieldExtractor {

    /**
     * Find the pattern: (XX) XXXX-XXXX
     * @return the extracted Phone
     */
    @Override
    public String getExpression() {
        //^\(?\d{2}\)?[\s-]?\d{4}-?\d{4}$
        return "(\\(?\\d{2}\\)?[\\s-]?\\d{4}-?\\d{4})+";
    }

    /**
     *
     * @return the score of Phone
     */
    @Override
    public double getScore() {

        return 0.8;
    }

    /**
     *
     * @return the name of expression
     */
    @Override
    public String getNameExpression() {
        return "Phone_Expression";
    }
}
