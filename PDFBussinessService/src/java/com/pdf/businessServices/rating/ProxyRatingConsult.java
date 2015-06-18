package com.pdf.businessServices.rating;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@LocalBean
@Stateless
public class ProxyRatingConsult implements IRatable{
    @EJB
    private ServRatingConsult ratingConsult;
    
    @Override
    public String activityRating(int idActivity) {
        return ratingConsult.activityRating(idActivity);
    }
    
    public ProxyRatingConsult(){
    }
}