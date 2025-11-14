
// Description: Java 11 Factory interface for Uuid6Gen.

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
 *	CFBamUuid6GenFactory interface for Uuid6Gen
 */
public interface ICFBamUuid6GenFactory
{

	/**
	 *	Allocate a DispIdx key over Uuid6Gen instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuid6GenByDispIdxKey newDispIdxKey();

	/**
	 *	Allocate a Uuid6Gen instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuid6GenBuff newBuff();

	/**
	 *	Allocate a Uuid6Gen history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuid6GenHBuff newHBuff();

}
