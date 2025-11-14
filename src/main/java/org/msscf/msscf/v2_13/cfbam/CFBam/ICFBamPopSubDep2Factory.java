
// Description: Java 11 Factory interface for PopSubDep2.

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
 *	CFBamPopSubDep2Factory interface for PopSubDep2
 */
public interface ICFBamPopSubDep2Factory
{

	/**
	 *	Allocate a PopSubDep1Idx key over PopSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2ByPopSubDep1IdxKey newPopSubDep1IdxKey();

	/**
	 *	Allocate a UNameIdx key over PopSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PopSubDep2 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2Buff newBuff();

	/**
	 *	Allocate a PopSubDep2 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2HBuff newHBuff();

}
