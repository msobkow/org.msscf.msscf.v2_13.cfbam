
// Description: Java 11 Default Factory implementation for ServiceType.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFSec 2.13 Security Essentials
 *	
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
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
	 *	CFBamServiceTypeFactory implementation for ServiceType
	 */
public class CFBamServiceTypeDefaultFactory
	extends CFSecServiceTypeDefaultFactory
	implements ICFBamServiceTypeFactory
{
	public CFBamServiceTypeDefaultFactory() {
		super();
	}

	public CFSecServiceTypePKey newPKey() {
		CFSecServiceTypePKey pkey =
			new CFSecServiceTypePKey();
		return( pkey );
	}

	public CFSecServiceTypeHPKey newHPKey() {
		CFSecServiceTypeHPKey hpkey =
			new CFSecServiceTypeHPKey();
		return( hpkey );
	}

	public CFSecServiceTypeByUDescrIdxKey newUDescrIdxKey() {
		CFSecServiceTypeByUDescrIdxKey key =
			new CFSecServiceTypeByUDescrIdxKey();
		return( key );
	}

	public CFSecServiceTypeBuff newBuff() {
		CFSecServiceTypeBuff buff =
			new CFSecServiceTypeBuff();
		return( buff );
	}

	public CFSecServiceTypeHBuff newHBuff() {
		CFSecServiceTypeHBuff hbuff =
			new CFSecServiceTypeHBuff();
		return( hbuff );
	}
}
