/**
 *
 * Copyright (c) 2015, Lucee Association Switzerland. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/
package org.lucee.mongodb.support;

import lucee.runtime.PageContext;
import lucee.runtime.dump.DumpData;
import lucee.runtime.dump.DumpProperties;
import lucee.runtime.dump.DumpTable;

public abstract class DBImplSupport extends CollObsSupport {

	private static final long serialVersionUID = -6887503857516957781L;






	/*public static class ValueIterator implements Iterator<Object> {

		private final Iterator<String> it;
		private final DB db;

		/**
		 * constructor for the class
		 * @param arr Base Array
		 * /
		public ValueIterator(DB db,Iterator<String> it) {
			this.db=db;
			this.it=it;
		}

		/**
		 * @see java.util.Iterator#remove()
		 * /
		public void remove() {
			throw new UnsupportedOperationException("this operation is not suppored");
		}

		/**
		 * @see java.util.Iterator#hasNext()
		 * /
		public boolean hasNext() {
			return it.hasNext();
		}

		/**
		 * @see java.util.Iterator#next()
		 * /
		public Object next() {
			return new DBCollectionImpl(db.getCollection(it.next()));
		}
	}
	public static class EntryIterator implements Iterator<Entry<Key, Object>> {

		private final Iterator<String> it;
		private final DB db;
		private final Collection coll;
		private final Cast caster;

		/**
		 * constructor for the class
		 * @param caster2
		 * @param arr Base Array
		 * /
		public EntryIterator(Cast caster, DB db,Collection coll,Iterator<String> it) {
			this.caster=caster;
			this.db=db;
			this.coll=coll;
			this.it=it;
		}

		/**
		 * @see java.util.Iterator#remove()
		 * /
		public void remove() {
			throw new UnsupportedOperationException("this operation is not suppored");
		}

		/**
		 * @see java.util.Iterator#hasNext()
		 * /
		public boolean hasNext() {
			return it.hasNext();
		}

		/**
		 * @see java.util.Iterator#next()
		 * /
		public Entry<Key, Object> next() {
			String k = it.next();
			return new EntryImpl(coll, caster.toKey(k,null), new DBCollectionImpl(db.getCollection(k))) ;
		}
	}*/


	public DumpData toDumpData(PageContext pageContext, int maxlevel, DumpProperties dp) {
		DumpTable table = _toDumpTable("DB", pageContext, maxlevel, dp);
		table.setComment("http://docs.mongodb.org/manual/reference/command/");
		return table;



	}
}
