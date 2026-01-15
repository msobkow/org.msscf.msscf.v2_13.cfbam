
// Description: Java 11 Default Factory implementation for DelTopDep.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
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
	 *	CFBamDelTopDepFactory implementation for DelTopDep
	 */
public class CFBamDelTopDepDefaultFactory
	implements ICFBamDelTopDepFactory
{
	public CFBamDelTopDepDefaultFactory() {
	}

	public CFBamDelTopDepByDelTopDepTblIdxKey newDelTopDepTblIdxKey() {
		CFBamDelTopDepByDelTopDepTblIdxKey key =
			new CFBamDelTopDepByDelTopDepTblIdxKey();
		return( key );
	}

	public CFBamDelTopDepByUNameIdxKey newUNameIdxKey() {
		CFBamDelTopDepByUNameIdxKey key =
			new CFBamDelTopDepByUNameIdxKey();
		return( key );
	}

	public CFBamDelTopDepByPrevIdxKey newPrevIdxKey() {
		CFBamDelTopDepByPrevIdxKey key =
			new CFBamDelTopDepByPrevIdxKey();
		return( key );
	}

	public CFBamDelTopDepByNextIdxKey newNextIdxKey() {
		CFBamDelTopDepByNextIdxKey key =
			new CFBamDelTopDepByNextIdxKey();
		return( key );
	}

	public CFBamDelTopDepBuff newBuff() {
		CFBamDelTopDepBuff buff =
			new CFBamDelTopDepBuff();
		return( buff );
	}

	public CFBamDelTopDepHBuff newHBuff() {
		CFBamDelTopDepHBuff hbuff =
			new CFBamDelTopDepHBuff();
		return( hbuff );
	}
}
