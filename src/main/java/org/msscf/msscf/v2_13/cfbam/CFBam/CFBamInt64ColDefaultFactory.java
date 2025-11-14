
// Description: Java 11 Default Factory implementation for Int64Col.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2025 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

	/*
	 *	CFBamInt64ColFactory implementation for Int64Col
	 */
public class CFBamInt64ColDefaultFactory
	implements ICFBamInt64ColFactory
{
	public CFBamInt64ColDefaultFactory() {
	}

	public CFBamInt64ColByTableIdxKey newTableIdxKey() {
		CFBamInt64ColByTableIdxKey key =
			new CFBamInt64ColByTableIdxKey();
		return( key );
	}

	public CFBamInt64ColBuff newBuff() {
		CFBamInt64ColBuff buff =
			new CFBamInt64ColBuff();
		return( buff );
	}

	public CFBamInt64ColHBuff newHBuff() {
		CFBamInt64ColHBuff hbuff =
			new CFBamInt64ColHBuff();
		return( hbuff );
	}
}
