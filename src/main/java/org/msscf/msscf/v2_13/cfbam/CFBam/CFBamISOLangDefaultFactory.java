
// Description: Java 11 Default Factory implementation for ISOLang.

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
	 *	CFBamISOLangFactory implementation for ISOLang
	 */
public class CFBamISOLangDefaultFactory
	extends CFSecISOLangDefaultFactory
	implements ICFBamISOLangFactory
{
	public CFBamISOLangDefaultFactory() {
		super();
	}

	public CFSecISOLangPKey newPKey() {
		CFSecISOLangPKey pkey =
			new CFSecISOLangPKey();
		return( pkey );
	}

	public CFSecISOLangHPKey newHPKey() {
		CFSecISOLangHPKey hpkey =
			new CFSecISOLangHPKey();
		return( hpkey );
	}

	public CFSecISOLangByCode3IdxKey newCode3IdxKey() {
		CFSecISOLangByCode3IdxKey key =
			new CFSecISOLangByCode3IdxKey();
		return( key );
	}

	public CFSecISOLangByCode2IdxKey newCode2IdxKey() {
		CFSecISOLangByCode2IdxKey key =
			new CFSecISOLangByCode2IdxKey();
		return( key );
	}

	public CFSecISOLangBuff newBuff() {
		CFSecISOLangBuff buff =
			new CFSecISOLangBuff();
		return( buff );
	}

	public CFSecISOLangHBuff newHBuff() {
		CFSecISOLangHBuff hbuff =
			new CFSecISOLangHBuff();
		return( hbuff );
	}
}
