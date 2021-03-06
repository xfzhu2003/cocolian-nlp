package org.cocolian.nlp.pos.chmm.corpus;

import org.cocolian.nlp.Nature;

/**
 * 两个词性之间的共现关系频率
 * @author lixf
 *
 */
public interface NatureCooccurrenceCorpus {

	/**
	 * 获取两个词性之间的共现关系频率。
	 * @param from
	 * @param to
	 * @return
	 */
	public int getOccurrenctFrequency(Nature from, Nature to);

}