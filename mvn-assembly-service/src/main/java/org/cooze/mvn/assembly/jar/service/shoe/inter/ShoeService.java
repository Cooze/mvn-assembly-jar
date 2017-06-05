package org.cooze.mvn.assembly.jar.service.shoe.inter;

import org.cooze.mvn.assembly.jar.model.shoe.domain.Shoe;

/**
 * @author xianzhe_song
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
public interface ShoeService {

    Shoe getShoe(String noCode)throws Exception;
}
