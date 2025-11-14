
// Description: Java 11 Default Factory implementation for TSecGrpInc.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2025 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFSec 2.13 Security Essentials
 *	
 *	Copyright (C) 2016-2025 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
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
	 *	CFBamTSecGrpIncFactory implementation for TSecGrpInc
	 */
public class CFBamTSecGrpIncDefaultFactory
	extends CFSecTSecGrpIncDefaultFactory
	implements ICFBamTSecGrpIncFactory
{
	public CFBamTSecGrpIncDefaultFactory() {
		super();
	}

	public CFSecTSecGrpIncPKey newPKey() {
		CFSecTSecGrpIncPKey pkey =
			new CFSecTSecGrpIncPKey();
		return( pkey );
	}

	public CFSecTSecGrpIncHPKey newHPKey() {
		CFSecTSecGrpIncHPKey hpkey =
			new CFSecTSecGrpIncHPKey();
		return( hpkey );
	}

	public CFSecTSecGrpIncByTenantIdxKey newTenantIdxKey() {
		CFSecTSecGrpIncByTenantIdxKey key =
			new CFSecTSecGrpIncByTenantIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncByGroupIdxKey newGroupIdxKey() {
		CFSecTSecGrpIncByGroupIdxKey key =
			new CFSecTSecGrpIncByGroupIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncByIncludeIdxKey newIncludeIdxKey() {
		CFSecTSecGrpIncByIncludeIdxKey key =
			new CFSecTSecGrpIncByIncludeIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncByUIncludeIdxKey newUIncludeIdxKey() {
		CFSecTSecGrpIncByUIncludeIdxKey key =
			new CFSecTSecGrpIncByUIncludeIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncBuff newBuff() {
		CFSecTSecGrpIncBuff buff =
			new CFSecTSecGrpIncBuff();
		return( buff );
	}

	public CFSecTSecGrpIncHBuff newHBuff() {
		CFSecTSecGrpIncHBuff hbuff =
			new CFSecTSecGrpIncHBuff();
		return( hbuff );
	}
}
