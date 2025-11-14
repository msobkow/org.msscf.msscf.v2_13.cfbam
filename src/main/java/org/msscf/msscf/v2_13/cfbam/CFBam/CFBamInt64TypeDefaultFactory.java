
// Description: Java 11 Default Factory implementation for Int64Type.

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
	 *	CFBamInt64TypeFactory implementation for Int64Type
	 */
public class CFBamInt64TypeDefaultFactory
	implements ICFBamInt64TypeFactory
{
	public CFBamInt64TypeDefaultFactory() {
	}

	public CFBamInt64TypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamInt64TypeBySchemaIdxKey key =
			new CFBamInt64TypeBySchemaIdxKey();
		return( key );
	}

	public CFBamInt64TypeBuff newBuff() {
		CFBamInt64TypeBuff buff =
			new CFBamInt64TypeBuff();
		return( buff );
	}

	public CFBamInt64TypeHBuff newHBuff() {
		CFBamInt64TypeHBuff hbuff =
			new CFBamInt64TypeHBuff();
		return( hbuff );
	}
}
