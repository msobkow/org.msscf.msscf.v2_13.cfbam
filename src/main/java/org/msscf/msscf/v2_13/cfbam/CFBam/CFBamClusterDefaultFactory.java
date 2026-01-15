
// Description: Java 11 Default Factory implementation for Cluster.

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
	 *	CFBamClusterFactory implementation for Cluster
	 */
public class CFBamClusterDefaultFactory
	extends CFSecClusterDefaultFactory
	implements ICFBamClusterFactory
{
	public CFBamClusterDefaultFactory() {
		super();
	}

	public CFSecClusterPKey newPKey() {
		CFSecClusterPKey pkey =
			new CFSecClusterPKey();
		return( pkey );
	}

	public CFSecClusterHPKey newHPKey() {
		CFSecClusterHPKey hpkey =
			new CFSecClusterHPKey();
		return( hpkey );
	}

	public CFSecClusterByUDomNameIdxKey newUDomNameIdxKey() {
		CFSecClusterByUDomNameIdxKey key =
			new CFSecClusterByUDomNameIdxKey();
		return( key );
	}

	public CFSecClusterByUDescrIdxKey newUDescrIdxKey() {
		CFSecClusterByUDescrIdxKey key =
			new CFSecClusterByUDescrIdxKey();
		return( key );
	}

	public CFSecClusterBuff newBuff() {
		CFSecClusterBuff buff =
			new CFSecClusterBuff();
		return( buff );
	}

	public CFSecClusterHBuff newHBuff() {
		CFSecClusterHBuff hbuff =
			new CFSecClusterHBuff();
		return( hbuff );
	}
}
