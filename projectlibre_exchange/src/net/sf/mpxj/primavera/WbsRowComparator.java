/*
 * file:       WbsRowComparator.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2011
 * date:       24/11/2011
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.primavera;

import java.util.Comparator;

/**
 * Comparator used to ensure that WBS elements read from an XER file
 * are processed in the correct order.
 */
class WbsRowComparator implements Comparator<Row>
{
   /**
    * {@inheritDoc}
    */
   public int compare(Row o1, Row o2)
   {
      Integer parent1 = o1.getInteger("parent_wbs_id");
      Integer parent2 = o2.getInteger("parent_wbs_id");
      int result = parent1.compareTo(parent2);
      if (result == 0)
      {
         Integer seq1 = o1.getInteger("seq_num");
         Integer seq2 = o2.getInteger("seq_num");
         result = seq1.compareTo(seq2);
      }
      return result;
   }
}
